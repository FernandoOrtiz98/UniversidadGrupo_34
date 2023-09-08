package universidadgrupo_34.entidades;

/**
 *
 * @author Fer
 */
public class Inscripcion {
    private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, double nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    @Override
    public String toString() {
        String insc=idInscripcion+" "+alumno.getApellido()+", "+alumno.getNombre()+" "+materia.getNombre();
        return insc;
    }
    
    
}
