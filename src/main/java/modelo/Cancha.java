
package modelo;

public class Cancha {
public static final String DISPONIBLE  = "DISPONIBLE";
public static final String MANTENIMIENTO = "MANTENIMINETO";
public static final String INACTIVA = "INACTIVA";

private String codigo; 
private String nombre; 
private String tipo;
private int capacidad; 
private String horaApertura; 
private String horaCierre; 
private String estado;

    public Cancha(String codigo, String nombre, String tipo, int capacidad, String horaApertura, String horaCierre, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.estado = estado;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public String getEstado() {
        return estado;
    }

    
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    public String aCSV(){
       return codigo + "," + nombre + "," + tipo + "," + capacidad + ","
             + horaApertura + "," + horaCierre + "," + estado;
    }
    
    public static Cancha desdeCSV(String linea){
        String[] p = linea.split(",");
        return new Cancha(p[0], p[1], p[2], Integer.parseInt(p[3]), p[4], p[5], p[6]);
    }

    @Override
    public String toString() {
        return nombre + " ("+tipo + ")";
    }
    
   


  





    
}
