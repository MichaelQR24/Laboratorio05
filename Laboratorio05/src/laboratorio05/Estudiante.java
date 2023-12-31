
package laboratorio05;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String dni;
    
    public Estudiante(){}
    
    public Estudiante(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
    public String getTextoLista(){
        return (this.nombre + ", " + this.apellido + " | Cod: " + this.dni);
       
    }
}
