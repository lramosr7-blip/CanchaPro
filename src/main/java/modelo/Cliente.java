
package modelo;

public class Cliente {
    private String codigo; 
    private String nombre; 
    private String telefono; 
    private String correo; 
    private String fechaRegistro; 

    public Cliente(String codigo, String nombre, String telefono, String correo, String fechaRegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaRegistro = fechaRegistro;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    
    //setters 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    //guardar en CSV
    public String aCSV(){
        return codigo + ","+nombre+ ","+telefono+","+correo+","+fechaRegistro;
    }
    
    // leer  CVS
    public static Cliente desdeCSV (String linea){
        String[] partes = linea.split(",");
        return new Cliente(partes[0],partes[1], partes[2], partes[3], partes[4]);
    }

    @Override
    public String toString() {
        return nombre + " ("+codigo+ ")";
    }
   
  
}
