
package modelo;


public class ServicioAdicional {
    private String codigo; 
    private String nombre; 
    private double precio; 
    private boolean activo;

    public ServicioAdicional(String codigo, String nombre, double precio, boolean activo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public boolean isActivo(){
        return activo;
    }
    
    public String aCSV(){
        return codigo + ","+nombre + ","+ precio + "," + activo;
    }
    
    public static ServicioAdicional desdeCSV(String linea){
        String [] p =linea.split(",");
        return new ServicioAdicional(p[0], p[1], Double.parseDouble(p[2]), Boolean.parseBoolean(p[3]));
    }
}
