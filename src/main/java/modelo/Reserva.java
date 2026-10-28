
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
    
    
    //para la cancelacion de alguna reserva
    private String motioCancelacion;
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
    
    public String aCSV(){
        return codigo + "," + codigoCliente + ","+ codigoCancha+","+fecha+","+horaInicio+","+horaFin+","+total+","+estado;
    }
    
    public static Reserva desdeCSV(String linea){
        String [] p = linea.split(",");
        return new Reserva (p[0], p[1], p[2], p[3], p[4], p[5], Double.parseDouble(p[6]), p[7]);
    }

    public String getMotioCancelacion() {
        return motioCancelacion;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setMotioCancelacion(String motioCancelacion) {
        this.motioCancelacion = motioCancelacion;
    }
    
    
    
    
    
    
}
