public class Autores {

    private Integer id;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String localidadNacimiento;

    public String getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getLocalidadNacimiento(){
        return localidadNacimiento;
    }

    public void setLocalidadNacimiento(String localidadNacimiento) {
        this.localidadNacimiento = localidadNacimiento;
    }
}
