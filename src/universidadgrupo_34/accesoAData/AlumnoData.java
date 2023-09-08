/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo_34.accesoAData;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgrupo_34.entidades.Alumno;

/**
 *
 * @author Jose
 */
public class AlumnoData {
    private Connection con=null;

    public AlumnoData() {
        this.con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alum){
        String query="INSERT INTO alumno(dni,apellido,nombre,fechaNacimiento,estado) VALUES (?,?,?,?,?)";
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
}
