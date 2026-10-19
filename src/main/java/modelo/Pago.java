
package modelo;


public class Pago {
    private String codigoPago;
    private String codigoReserva; 
    private String fechaHora; 
    private double monto;
    private String metodoPago;

    public Pago(String codigoPago, String codigoReserva, String fechaHora, double monto, String metodoPago) {
        this.codigoPago = codigoPago;
        this.codigoReserva = codigoReserva;
        this.fechaHora = fechaHora;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    public String getCodigoPago() {
        return codigoPago;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public double getMonto() {
        return monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
    
    
    public String aCSV(){
        return codigoPago + "," + codigoReserva + ","+fechaHora+ ","+ monto + ","+metodoPago;
    }
    
    public static Pago desdeCSv (String linea){
        String [] p = linea.split(",");
        return new Pago(p[0], p[1], p[2], Double.parseDouble(p[3]), p[4]); 
    }
}
