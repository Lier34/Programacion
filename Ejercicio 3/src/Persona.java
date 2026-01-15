public class Persona {
    String nombre;
    int dNacimiento;
    int mNacimiento;
    int aNacimiento;
    String direccion;
    int codigo_postal;
    String ciudad;

    public Persona(String nombre, int mNacimiento, int dNacimiento, String direccion, int codigo_postal, String ciudad, int aNacimiento) {
        this.nombre = nombre;
        this.mNacimiento = mNacimiento;
        this.dNacimiento = dNacimiento;
        this.direccion = direccion;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.aNacimiento = aNacimiento;
    }

    public int getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(int dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public int getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(int mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String NombrePersona(){
        return "Nombre: " + nombre;
    }

    public String NombreCiudad(){
        return "Ciudad: " + ciudad;
    }

}
