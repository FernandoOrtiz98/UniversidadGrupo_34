package universidadgrupo_34.entidades;

import java.time.LocalDate;


public class Alumno {
    private int idAlumno=-1;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fNacimiento;
    private boolean estado;
    
     public Alumno(int idAlumno, int dni, String apellido, String nombre, LocalDate fNacimiento, boolean estado) {
        this.idAlumno=idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.estado = estado;
    }

    public Alumno(int dni, String apellido, String nombre, LocalDate fNacimiento, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.estado = estado;
    }
    public Alumno(){
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    @Override
    public String toString() {
        return dni+", "+apellido+", "+nombre+" ";
    }
}
