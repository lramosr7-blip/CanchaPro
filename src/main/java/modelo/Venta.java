package modelo;

public class Venta {
    private String codigoVenta;
    private String fecha;
    private String codigoProducto;
    private String nombreProducto;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;

    public Venta(String codigoVenta, String fecha, String codigoProducto, String nombreProducto, int cantidad, double precioUnitario, double subtotal) {
        this.codigoVenta = codigoVenta;
        this.fecha = fecha;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }

    public String aCSV() {
        return codigoVenta + "," + fecha + "," + codigoProducto + ","+ nombreProducto + "," + cantidad + ","+ precioUnitario + "," + subtotal;
    }

    public static Venta desdeCSV(String linea) {
        String[] datos = linea.split(",");
        return new Venta(
                datos[0],
                datos[1],
                datos[2],
                datos[3],
                Integer.parseInt(datos[4]),
                Double.parseDouble(datos[5]),
                Double.parseDouble(datos[6])
        );
    }
}