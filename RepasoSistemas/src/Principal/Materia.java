package Principal;

public class Materia extends Profesor {

    private int codigo;

    private String nombre;

    private int crditos;


    public Materia() {

    }

    public Materia(int cedula, String nombre, String apellido, String profesion, int codigo, String nombre1, int crditos) {
        super(cedula, nombre, apellido, profesion);
        this.codigo = codigo;
        this.nombre = nombre1;
        this.crditos = crditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCrditos() {
        return crditos;
    }

    public void setCrditos(int crditos) {
        this.crditos = crditos;
    }

    @Override
    public String toString() {
        return super.toString() + "Materia{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", crditos=" + crditos +
                '}';
    }
}
