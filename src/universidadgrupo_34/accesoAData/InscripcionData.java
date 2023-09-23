package universidadgrupo_34.accesoAData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo_34.entidades.Alumno;
import universidadgrupo_34.entidades.Inscripcion;
import universidadgrupo_34.entidades.Materia;

public class InscripcionData {

    private Connection con;
    private MateriaData matDat;
    private AlumnoData aluData;

    //public static TreeSet <Inscripcion> obtenerInscripciones = new TreeSet<>();
    // public static TreeSet <Inscripcion> obtenerInscripcionesPorAlumno = new TreeSet<>();
    public InscripcionData() {
    }

    public void guardarInscripcion(Inscripcion inscripcion) {
        String query = "INSERT INTO inscripcion(idAlumno,idMateria,nota=null) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.setInt(3, inscripcion.getNota());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscripcion.setIdInscripcion(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void borrarInscripcionAlumnoMateria(int idAlumno, int idMateria) {
        String query = "DELETE FROM inscripcion WHERE idMateria = ? AND idAlumno = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas=ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (filas>0) {
                JOptionPane.showMessageDialog(null, "inscripcion borrada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones ");
        }
    }

    public void actualizarNota(Inscripcion inscripcion, int nota) {
        String query = "UPDATE inscripcion SET nota=?,"
                + "where idAlumno=?, AND idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, nota);
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Actualizado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion...");
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matDat.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getInt("nota"));
                inscripciones.add(insc);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        List<Inscripcion> inscripciones = new ArrayList();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matDat.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getInt("nota"));
                inscripciones.add(insc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno){
        ArrayList<Materia> materias = new ArrayList();
        String sql="SELECT inscripcion.idMateria,nombre,anio FROM inscripcion,"
                + "materia WHERE inscripcion.idMateria = materia.idMateria"
                + "AND inscripcion.idAlumno = ?;";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia= new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
                
                }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion");
        }
        return materias;
        
    }
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno){
        ArrayList<Materia> materias = new ArrayList();
        String sql="SELECT * FROM materia WHERE estado = 1 AND idMateria not in"
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia= new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
                
                }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion");
        }
        return materias;
        
    }
       public List<Alumno> obtenerAlumnoPorMateria(int idMateria){
        ArrayList<Alumno> AlumList = new ArrayList();
        String sql="SELECT a.idAlumno,dni,apellido,nombre,fNacimiento,estado"
                + "FROM inscripcion i,alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno= new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setfNacimiento(rs.getDate("fNacimiento").toLocalDate());
                AlumList.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion");
        }
        return AlumList;
    }
}
