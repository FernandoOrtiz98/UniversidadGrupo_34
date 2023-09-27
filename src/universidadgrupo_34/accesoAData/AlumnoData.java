
package universidadgrupo_34.accesoAData;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo_34.entidades.Alumno;

/**
 *
 * @author Grupo 34
 */
public class AlumnoData {
    private Connection con=null;
    public AlumnoData() {
        this.con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alum){
        String query="INSERT INTO alumno(dni,apellido,nombre,fNacimiento,estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, alum.getDni());
                ps.setString(2, alum.getApellido());
                ps.setString(3, alum.getNombre());
                ps.setDate(4, Date.valueOf(alum.getfNacimiento()));
                ps.setBoolean(5, alum.isEstado());
                ps.executeUpdate();
                
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                alum.setIdAlumno(rs.getInt(1));
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null,"Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion... "+ex.getMessage());
        }
    }
    public void modificarAlumno(Alumno alum){
        String query="UPDATE alumno SET dni=?, apellido=?, nombre=?, fNacimiento=?"
                + " where idAlumno=?";
        try {
            PreparedStatement ps= con.prepareStatement(query);
            ps.setInt(1, alum.getDni());
                ps.setString(2, alum.getApellido());
                ps.setString(3, alum.getNombre());
                ps.setDate(4, Date.valueOf(alum.getfNacimiento()));
                ps.setInt(5, alum.getIdAlumno());
                int exito=ps.executeUpdate();
                if(exito==1){
                    JOptionPane.showMessageDialog(null, "Alumno Modificado");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion... "+ex.getMessage());
        }
    }
    public void eliminarAlumno(int id){
        String query="UPDATE alumno SET estado=0 where idAlumno = ?";
        try {
            PreparedStatement ps= con.prepareStatement(query);
            ps.setInt(1,id);
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null,"alumno eliminado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion... "+ex.getMessage());
        }
    }
    public  Alumno buscarAlumno(int id){
        String sql="SELECT dni,apellido,nombre,fNacimiento FROM alumno WHERE idAlumno =? AND estado = 1";
        Alumno alumno=null;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                alumno= new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setfNacimiento(rs.getDate("fNacimiento").toLocalDate());
                alumno.setEstado(true);
            
            }else{
                JOptionPane.showMessageDialog(null, "no existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
        }
        return alumno;      
    }
    public  Alumno buscarAlumnoDni(int dni){
        String sql="SELECT idAlumno,dni,apellido,nombre,fNacimiento FROM alumno WHERE dni =? AND estado = 1";
        Alumno alumno=null;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                alumno= new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setfNacimiento(rs.getDate("fNacimiento").toLocalDate());
                alumno.setEstado(true);
            
            }else{
                JOptionPane.showMessageDialog(null, "no existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
        }
        return alumno;      
    }
    public List<Alumno> listarAlumnos() {

        String sql = "SELECT idAlumno,dni,apellido,nombre,fNacimiento FROM alumno WHERE estado = 1";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setfNacimiento(rs.getDate("fNacimiento").toLocalDate());
                alumno.setEstado(true);
                alumnos.add(alumno); //Por cada vuelta del while, agregamos un alumno al ArrayList alumnos.
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumnos;
    }

}
