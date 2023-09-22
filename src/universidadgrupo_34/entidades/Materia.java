package universidadgrupo_34.entidades;

/**
 *
 * @author Fer
 */
public class Materia {
   private int idMateria;
   private String nombre;
   private int anio;
   private boolean estado;

    public Materia() {
    }

    public Materia(String nombre, int año, boolean estado) {
        this.nombre = nombre;
        this.anio = año;
        this.estado = estado;
    }
    
    public Materia(int idMateria, String nombre, int año, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = año;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int año) {
        this.anio = año;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", a\u00f1o=" + anio + ", estado=" + estado + '}';
    }
}
