
package modelo;


public class Reserva {
    
    public static final String PENDIENTE = "PENDIENTE";
    public static final String CONFIRMADA = "CONFIRMADA";
    public static final String EN_CURSO = "EN_CURSO";
    public static final String FINALIZADA = "FINALIZADA";
    public static final String CANCELADA = "CANCELADA";
    
    private String codigo; 
    private String codigoCliente; 
    private String codigoCancha;
    private String fecha; 
    private String horaInicio;
    private String horaFin;
    private double total;
    private String estado;
    private String servicios = "";
    
    
    //para la cancelacion de alguna reserva
    private String motivoCancelacion;
    private String fechaCancelacion;
    
    

    public Reserva(String codigo, String codigoCliente, String codigoCancha, String fecha, String horaInicio, String horaFin, double total, String estado) {
        this.codigo = codigo;
        this.codigoCliente = codigoCliente;
        this.codigoCancha = codigoCancha;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.total = total;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public String getCodigoCancha() {
        return codigoCancha;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
    
    
    
    public String aCSV(){
        
        String motivo = "";
        String fechaCan = "";
        
        if (motivoCancelacion != null) {
            motivo = motivoCancelacion;
        }
        

        if (fechaCancelacion != null) {
            fechaCan = fechaCancelacion;
        }
        
   
        return codigo + "," + codigoCliente + "," + codigoCancha + "," + fecha + "," + horaInicio + "," + horaFin + "," + total + "," + estado + "," + motivo + "," + fechaCan+ ","+servicios;
         

    }
    
    public static Reserva desdeCSV(String linea){
        String [] p = linea.split(",",-1);
        Reserva r= new Reserva(p[0], p[1], p[2], p[3], p[4], p[5], Double.parseDouble(p[6]), p[7]);
        
        if (p.length > 8){
         r.setMotioCancelacion(p[8]);
        }
        
        if(p.length > 9){
            r.setFechaCancelacion(p[9]);
        }
        
        if(p.length>10){
            r.setServicios(p[10]);
        }
        
        return r;
        
        
    }
    
    

    public String getMotioCancelacion() {
        return motivoCancelacion;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setMotioCancelacion(String motioCancelacion) {
        this.motivoCancelacion = motioCancelacion;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }
    
    
    
    
    
    
}
