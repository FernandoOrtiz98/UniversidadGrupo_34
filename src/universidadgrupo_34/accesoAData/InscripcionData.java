
package universidadgrupo_34.accesoAData;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo_34.entidades.Alumno;
import universidadgrupo_34.entidades.Inscripcion;

/**
 *
 * @author Jose
 */
public class InscripcionData {
    private Connection con;
    private MateriaData matDat;
    private AlumnoData aluData;

    public InscripcionData() {
    }
    
    public void guardarInscripcion(Inscripcion inscripcion){
        String query="INSERT INTO inscripcion(idAlumno,idMateria,nota=null) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
                ps.setInt(2, inscripcion.getMateria().getIdMateria());
                ps.setInt(3, inscripcion.getNota());
                
                ps.executeUpdate();
                
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                inscripcion.setIdInscripcion(rs.getInt(1));
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null,"Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion... "+ex.getMessage());
        }
    }
    public void borrarInscripcionAlumnoMateria(Inscripcion inscripcion){
        String query="DELETE FROM inscripcion WHERE idMateria = ? AND idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            
                ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
                ps.setInt(2, inscripcion.getMateria().getIdMateria());               
                ps.executeUpdate();
                
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                inscripcion.setIdInscripcion(rs.getInt(1));
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null,"Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion... "+ex.getMessage());
        }
    }
    public void actualizarNota(Inscripcion inscripcion,int nota){
        String query="UPDATE inscripcion SET nota=?,"
                + "where idAlumno=?, AND idMateria=?";
        try {
            PreparedStatement ps= con.prepareStatement(query);
            ps.setInt(1, nota);
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null,"Actualizado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion...");
        }
    }
}
