
package universidadgrupo_34;

import java.time.LocalDate;
import universidadgrupo_34.accesoAData.AlumnoData;
import universidadgrupo_34.entidades.Alumno;


public class UniversidadGrupo_34 {

    
    public static void main(String[] args) {
        Alumno alu=new Alumno(12345678,"Gonzales","juan",LocalDate.of(1999, 10, 20),true);
        AlumnoData alum=new AlumnoData();
        alum.guardarAlumno(alu);
    }
    
}
