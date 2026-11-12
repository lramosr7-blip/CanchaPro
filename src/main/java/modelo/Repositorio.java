
package modelo;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Repositorio {
   
    public Cliente[] clientes = new Cliente[200];
    public int numClientes = 0;

    public Cancha[] canchas = new Cancha[20];
    public int numCanchas = 0;

    public Reserva[] reservas = new Reserva[500];
    public int numReservas = 0;

    public Pago[] pagos = new Pago[1000];
    public int numPagos = 0;
    
    public Venta[] ventas = new Venta[1000];
    public int numVentas=0;
    
    public modelo.ServicioAdicional[] servicios = new modelo.ServicioAdicional[20];
    public int numServicios = 0;
    
    public modelo.Producto[] productos = new modelo.Producto[100];
    public int numProductos = 0;
    
    
    public boolean agregarServicio (modelo.ServicioAdicional s){
        if (numServicios >= servicios.length ) return false;
        servicios[numServicios] = s;
        numServicios ++;
        return true;
    }
    
    public modelo.ServicioAdicional buscarServicioPorCodigo(String codigo){
        for (int i = 0; i<numServicios; i++){
            if (servicios[i].getCodigo().equals(codigo)) return servicios[i];
        }
        return null;
    }
    
    

    private final String RUTA_CLIENTES = "datos/clientes.csv";
    private final String RUTA_CANCHAS   = "datos/canchas.csv";
    private final String RUTA_RESERVAS  = "datos/reservas.csv";
    private final String RUTA_PAGOS     = "datos/pagos.csv";
    private final String RUTA_SERVICIOS = "datos/servicios.csv";
    private final String RUTA_PRODUCTOS = "datos/productos.csv";
    private final String RUTA_VENTAS = "datos/ventas.csv";

    public boolean agregarCliente(Cliente c) {
        if (numClientes >= clientes.length) return false;
        if (buscarClientePorCodigo(c.getCodigo()) != null) return false;
        clientes[numClientes] = c;
        numClientes++;
        return true;
    }

    public boolean agregarCancha(Cancha c) {
        if (numCanchas >= canchas.length) return false;
        if(buscarCanchaPorCodigo(c.getCodigo()) != null) return false;
        canchas[numCanchas] = c;
        numCanchas++;
        return true;
        
    }

    public boolean agregarReserva(Reserva r) {
        if (numReservas >= reservas.length) return false;
        reservas[numReservas] = r;
        numReservas++;
        return true;
    }

    public boolean agregarPago(Pago p) {
        if (numPagos >= pagos.length) return false;
        pagos[numPagos] = p;
        numPagos++;
        return true;
    }

    // BÚSQUEDAS
    public Cliente buscarClientePorCodigo(String codigo) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getCodigo().equals(codigo)) return clientes[i];
        }
        return null;
    }

    public Cancha buscarCanchaPorCodigo(String codigo) {
        for (int i = 0; i < numCanchas; i++) {
            if (canchas[i].getCodigo().equals(codigo)) return canchas[i];
        }
        return null;
    }

    // LÓGICA DE TRASLAPES
    private int horaAMinutos(String hora) {
        String[] partes = hora.split(":");
        return Integer.parseInt(partes[0]) * 60 + Integer.parseInt(partes[1]);
    }

    public boolean seTraslapan(String inicio1, String fin1, String inicio2, String fin2) {
        LocalTime i1 = LocalTime.parse(inicio1);
        LocalTime f1 = LocalTime.parse(fin1);
        LocalTime i2 = LocalTime.parse(inicio2);
        LocalTime f2 = LocalTime.parse(fin2);

        return i1.isBefore(f2) && f1.isAfter(i2);
    }

    public boolean esCanchaDisponible(String codigoCancha, String fecha, String horaInicio, String horaFin) {
        Cancha c = buscarCanchaPorCodigo(codigoCancha);
        if (c == null) return false;

        if (!c.getEstado().equals(Cancha.DISPONIBLE)) {
            return false;
        }
        
        try{
            DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("H:mm");
        LocalTime apertura = LocalTime.parse(c.getHoraApertura(),formatoHora);
        LocalTime cierre = LocalTime.parse(c.getHoraCierre(), formatoHora);
        LocalTime inicioSol = LocalTime.parse(horaInicio, formatoHora);
        LocalTime finSol = LocalTime.parse(horaFin, formatoHora);
        
        if (inicioSol.isBefore(apertura) || finSol.isAfter(cierre)) {
            return false; 
        }
        
        
        for (int i =0; i<numReservas; i++){
            Reserva r = reservas[i];
            if (r.getCodigoCancha().equals(codigoCancha)&& r.getFecha().equals(fecha) && !r.getEstado().equals(Reserva.CANCELADA)){
                LocalTime i2 = LocalTime.parse(r.getHoraInicio(),formatoHora);
                LocalTime f2 = LocalTime.parse(r.getHoraFin(), formatoHora);
                
                if (inicioSol.isBefore(f2)&& finSol.isAfter(i2)){
                    return false;
                }
                
            }
        }
        
        
        }catch (Exception e){
            System.out.println("Error en el formato de hora");
            return false;
        }
        
  

    

        

      
        return true; 
    }

    // GUARDAR Y CARGAR
    public void guardarTodo() {
        try {
            new File("datos").mkdirs();

            BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_CLIENTES));
            for (int i = 0; i < numClientes; i++) { bw.write(clientes[i].aCSV()); bw.newLine(); }
            bw.close();

            bw = new BufferedWriter(new FileWriter(RUTA_CANCHAS));
            for (int i = 0; i < numCanchas; i++) { bw.write(canchas[i].aCSV()); bw.newLine(); }
            bw.close();

            bw = new BufferedWriter(new FileWriter(RUTA_RESERVAS));
            for (int i = 0; i < numReservas; i++) { bw.write(reservas[i].aCSV()); bw.newLine(); }
            bw.close();

            bw = new BufferedWriter(new FileWriter(RUTA_PAGOS));
            for (int i = 0; i < numPagos; i++) { bw.write(pagos[i].aCSV()); bw.newLine(); }
            bw.close();
            
            bw = new BufferedWriter(new FileWriter(RUTA_SERVICIOS));
            for (int i = 0; i < numServicios; i++) { bw.write(servicios[i].aCSV()); bw.newLine(); }
            bw.close();
            
            bw = new BufferedWriter(new FileWriter(RUTA_PRODUCTOS));
            for (int i = 0; i < numProductos; i++) { bw.write(productos[i].aCSV()); bw.newLine(); }
            bw.close();
            
            bw = new BufferedWriter(new FileWriter(RUTA_VENTAS));
            for (int i = 0; i < numVentas; i++) {
            bw.write(ventas[i].aCSV());
            bw.newLine();
            }
            bw.close();
            
            
            System.out.println("Todo guardado exitosamente en el disco.");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public void cargarTodo() {
        numClientes = 0;
        numCanchas = 0;
        numReservas = 0; 
        numPagos = 0;
        numVentas=0;

        // Clientes
        try {
            File f = new File(RUTA_CLIENTES);
            if (f.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String linea;
                while ((linea = br.readLine()) != null) {
                    if (linea.trim().isEmpty()) continue;
                    try { clientes[numClientes] = Cliente.desdeCSV(linea); numClientes++; } 
                    catch (Exception e) { System.out.println("Error cliente: " + linea); }
                }
                br.close();
            }
        } catch (IOException e) { System.out.println("Error leyendo clientes"); }

        // Canchas
        try {
            File f = new File(RUTA_CANCHAS);
            if (f.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String linea;
                while ((linea = br.readLine()) != null) {
                    if (linea.trim().isEmpty()) continue;
                    try { canchas[numCanchas] = Cancha.desdeCSV(linea); numCanchas++; } 
                    catch (Exception e) { System.out.println("Error cancha: " + linea); }
                }
                br.close();
            }
        } catch (IOException e) { System.out.println("Error leyendo canchas"); }

        // Reservas
        try {
            File f = new File(RUTA_RESERVAS);
            if (f.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String linea;
                while ((linea = br.readLine()) != null) {
                    if (linea.trim().isEmpty()) continue;
                    try { reservas[numReservas] = Reserva.desdeCSV(linea); numReservas++; } 
                    catch (Exception e) { System.out.println("Error reserva: " + linea); }
                }
                br.close();
            }
        } catch (IOException e) { System.out.println("Error leyendo reservas"); }

        // Pagos
        try {
            File f = new File(RUTA_PAGOS);
            if (f.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String linea;
                while ((linea = br.readLine()) != null) {
                    if (linea.trim().isEmpty()) continue;
                    try { pagos[numPagos] = Pago.desdeCSv(linea); numPagos++; } 
                    catch (Exception e) { System.out.println("Error pago: " + linea); }
                }
                br.close();
            }
        } catch (IOException e) { System.out.println("Error leyendo pagos"); }
        
        
        
        //servicios
       // Servicios
    try {
    File f = new File(RUTA_SERVICIOS);
    if (f.exists()) {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.trim().isEmpty()) continue;
            try { servicios[numServicios] = ServicioAdicional.desdeCSV(linea); numServicios++; } 
            catch (Exception e) { System.out.println("Error servicio: " + linea); }
        }
        br.close();
    }
    } catch (IOException e) { System.out.println("Error leyendo servicios"); }
    
    
    // productos
    try {
    File f = new File(RUTA_PRODUCTOS);
    if (f.exists()) {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.trim().isEmpty()) continue;
            try { productos[numProductos] = Producto.desdeCSV(linea); numProductos++; } 
            catch (Exception e) { System.out.println("Error producto: " + linea); }
        }
        br.close();
    }
    } catch (IOException e) { System.out.println("Error leyendo productos"); }
    
    //ventas
    try {
    File f = new File(RUTA_VENTAS);

    if (f.exists()) {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String linea;

        while ((linea = br.readLine()) != null) {
            if (linea.trim().isEmpty()) {
                continue;
            }

            try {
                ventas[numVentas] = Venta.desdeCSV(linea);
                numVentas++;
            } catch (Exception e) {
                System.out.println("Error en venta: " + linea);
            }
        }

        br.close();
    }
} catch (IOException e) {
    System.out.println("Error leyendo ventas");
}
    
    
    
    }
    

    
    
    public void cargarServiciosPorDefecto(){
        if (numServicios>0) return;
            agregarServicio(new modelo.ServicioAdicional("S01", "Balón", 30, true));
            agregarServicio(new modelo.ServicioAdicional("S02", "Arbitro", 100, true));
            agregarServicio(new modelo.ServicioAdicional("S03", "Chalecos", 25, true));
                    
        
    
}
    
    public double calcularTotalPagado(String codigoReserva){
        double total = 0;
        for (int i =0; i<numPagos; i++){
            if (pagos[i].getCodigoReserva().equals(codigoReserva)){
                total += pagos[i].getMonto();
            }
        }
        return total;
    }
    
    
     public void actualizarEstadosAutomaticos() {
        java.time.LocalDate hoy = java.time.LocalDate.now();
        java.time.LocalTime horaActual = java.time.LocalTime.now();

        for (int i = 0; i < numReservas; i++) {
            modelo.Reserva r = reservas[i];

          
            if (r.getEstado().equals(modelo.Reserva.CANCELADA)) {
                continue;
            }

            boolean tienePagos = (calcularTotalPagado(r.getCodigo()) > 0);
            
            if(!tienePagos){
                r.setEstado(modelo.Reserva.PENDIENTE);
                continue;
            }

            try {
                java.time.LocalDate fechaReserva = java.time.LocalDate.parse(r.getFecha());
                java.time.LocalTime inicioReserva = java.time.LocalTime.parse(r.getHoraInicio());
                java.time.LocalTime finReserva = java.time.LocalTime.parse(r.getHoraFin());

                
                
               
                if (fechaReserva.isBefore(hoy) || (fechaReserva.isEqual(hoy) && horaActual.isAfter(finReserva))) {
                    r.setEstado(modelo.Reserva.FINALIZADA);
                    System.out.println("Reserva " + r.getCodigo() + " FINALIZADA");
                } 
               
                else if (fechaReserva.isEqual(hoy) && (horaActual.isAfter(inicioReserva) || horaActual.equals(inicioReserva)) && horaActual.isBefore(finReserva)) {
                    r.setEstado(modelo.Reserva.EN_CURSO);
                    System.out.println("Reserva " + r.getCodigo() + " EN_CURSO");
                } 
           
                else {
                    if (tienePagos) {
                        r.setEstado(modelo.Reserva.CONFIRMADA);
                    } else {
                        r.setEstado(modelo.Reserva.PENDIENTE);
                    }
                    System.out.println("Reserva " + r.getCodigo() + " -> " + r.getEstado());
                }
                
            } catch (Exception e) {
                System.out.println("Error al actualizar estado de la reserva " + r.getCodigo() + ": " + e.getMessage());
            }
        }
    }
     
     
     
     
     
   //reportes
      public String[][] generarReporte(int opcion) {
        String[][] datos = new String[0][0];
        
        switch (opcion) {
            case 0: // reservas por cancha
                datos = new String[numCanchas][2];
                for (int i = 0; i < numCanchas; i++) {
                    int contador = 0;
                    for (int j = 0; j < numReservas; j++) {
                        if (reservas[j].getCodigoCancha().equals(canchas[i].getCodigo()) && !reservas[j].getEstado().equals(Reserva.CANCELADA)) {
                            contador++;
                        }
                    }
                    datos[i][0] = canchas[i].getNombre();
                    datos[i][1] = String.valueOf(contador);
                }
                break;
                
            case 1: // cliete con mas reservas
                datos = new String[numClientes][2];
                for (int i = 0; i < numClientes; i++) {
                    int contador = 0;
                    for (int j = 0; j < numReservas; j++) {
                        if (reservas[j].getCodigoCliente().equals(clientes[i].getCodigo()) && !reservas[j].getEstado().equals(Reserva.CANCELADA)) {
                            contador++;
                        }
                    }
                    datos[i][0] = clientes[i].getNombre();
                    datos[i][1] = String.valueOf(contador);
                }
                break;
                
            case 2: // ingresos totales
                double total = 0;
                for (int i = 0; i < numPagos; i++) {
                    total += pagos[i].getMonto();
                }
                datos = new String[1][2];
                datos[0][0] = "Ingresos Totales Recaudados";
                datos[0][1] = "Q " + total;
                break;
                
            case 3: // reservas canceladas
                int cont = 0;
                for (int i = 0; i < numReservas; i++) {
                    if (reservas[i].getEstado().equals(Reserva.CANCELADA)) {
                        cont++;
                    }
                }
                datos = new String[1][2];
                datos[0][0] = "Total de Reservas Canceladas";
                datos[0][1] = String.valueOf(cont);
                break;
                
            case 4: // 5. reservas por fechas
                String[] fechas = new String[numReservas];
                int[] conteos = new int[numReservas];
                int numFechas = 0;
                for (int i = 0; i < numReservas; i++) {
                    String f = reservas[i].getFecha();
                    boolean encontrada = false;
                    for (int j = 0; j < numFechas; j++) {
                        if (fechas[j].equals(f)) {
                            conteos[j]++;
                            encontrada = true;
                            break;
                        }
                    }
                    if (!encontrada) {
                        fechas[numFechas] = f;
                        conteos[numFechas] = 1;
                        numFechas++;
                    }
                }
                datos = new String[numFechas][2];
                for (int i = 0; i < numFechas; i++) {
                    datos[i][0] = fechas[i];
                    datos[i][1] = String.valueOf(conteos[i]);
                }
                break;
                
            case 5: // pagos pendientes
                int contPendientes = 0;
                for (int i = 0; i < numReservas; i++) {
                    if (!reservas[i].getEstado().equals(Reserva.CANCELADA)) {
                        double pagado = calcularTotalPagado(reservas[i].getCodigo());
                        if (pagado < reservas[i].getTotal()) {
                            contPendientes++;
                        }
                    }
                }
                datos = new String[contPendientes][2];
                int index = 0;
                for (int i = 0; i < numReservas; i++) {
                    if (!reservas[i].getEstado().equals(Reserva.CANCELADA)) {
                        double pagado = calcularTotalPagado(reservas[i].getCodigo());
                        if (pagado < reservas[i].getTotal()) {
                            datos[index][0] = reservas[i].getCodigo();
                            datos[index][1] = "Falta Q" + (reservas[i].getTotal() - pagado);
                            index++;
                        }
                    }
                }
                break;
                
            case 6: // cancha mas utilizada
                String maxCancha = "Ninguna";
                int maxCont = -1;
                for (int i = 0; i < numCanchas; i++) {
                    int contador = 0;
                    for (int j = 0; j < numReservas; j++) {
                        if (reservas[j].getCodigoCancha().equals(canchas[i].getCodigo()) && !reservas[j].getEstado().equals(Reserva.CANCELADA)) {
                            contador++;
                        }
                    }
                    if (contador > maxCont) {
                        maxCont = contador;
                        maxCancha = canchas[i].getNombre();
                    }
                }
                datos = new String[1][2];
                datos[0][0] = maxCancha;
                datos[0][1] = maxCont + " reservas";
                break;
                
            case 7: // horarios de mayor demanda
                String[] horas = new String[numReservas];
                int[] conteosHoras = new int[numReservas];
                int numHoras = 0;
                for (int i = 0; i < numReservas; i++) {
                    String h = reservas[i].getHoraInicio();
                    boolean encontrada = false;
                    for (int j = 0; j < numHoras; j++) {
                        if (horas[j].equals(h)) {
                            conteosHoras[j]++;
                            encontrada = true;
                            break;
                        }
                    }
                    if (!encontrada) {
                        horas[numHoras] = h;
                        conteosHoras[numHoras] = 1;
                        numHoras++;
                    }
                }
                datos = new String[numHoras][2];
                for (int i = 0; i < numHoras; i++) {
                    datos[i][0] = horas[i];
                    datos[i][1] = String.valueOf(conteosHoras[i]);
                }
                break;
                
            default:
                System.out.println("Opción no válida");
                break;
        }
        
        return datos;
    }
     
     
         public String[] obtenerColumnasReporte(int opcion) {
        switch (opcion) {
            case 0: return new String[]{"Cancha", "Cantidad de Reservas"};
            case 1: return new String[]{"Cliente", "Cantidad de Reservas"};
            case 2: return new String[]{"Concepto", "Monto Total"};
            case 3: return new String[]{"Concepto", "Cantidad"};
            case 4: return new String[]{"Fecha", "Cantidad de Reservas"};
            case 5: return new String[]{"Reserva", "Saldo Pendiente"};
            case 6: return new String[]{"Cancha Más Utilizada", "Total Reservas"};
            case 7: return new String[]{"Hora de Inicio", "Cantidad de Reservas"};
            default: return new String[]{"", ""};
        }
    }
         
         
         public boolean agregarProducto(modelo.Producto p){
             if (numProductos >= productos.length) return false;
             
             
             //si ya existe se actualiza el stokc
             for (int i =0; i<numProductos; i++){
                 if(productos[i].getCodigo().equals(p.getCodigo())){
                    productos[i].setStock(productos[i].getStock() + p.getStock()); // Sumar stock
                    
                    return true;

                     
                     
                     
                     
                 }
             }
             //se agrega si no existe
             productos[numProductos] =p;
             numProductos++;
             return true;
         }
         
         public modelo.Producto buscarProductosPorCodigo(String codigo){
             for(int i = 0; i < numProductos; i++){
                 if (productos[i].getCodigo().equals(codigo)) return productos[i];
             }
             return null;
         }
         
         
         public boolean agregarVenta(Venta venta){
             if(numVentas >= ventas.length){
                 return false;
             }
             
             ventas[numVentas] = venta;
             numVentas++;
             return true;
         }
       
         
         
         
}