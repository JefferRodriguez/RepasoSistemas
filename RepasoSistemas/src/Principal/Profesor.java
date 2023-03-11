package Principal;

public class Profesor {


    private int cedula;


    private String nombre;


    private String apellido;

    private String profesion;

    public Profesor() {
    }

    public Profesor(int cedula, String nombre, String apellido, String profesion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", profesion='" + profesion + '\'' +
                '}';
    }
}
