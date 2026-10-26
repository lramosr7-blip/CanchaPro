
package modelo;

import java.io.*;
import java.time.LocalTime;

public class Repositorio {
   
    public Cliente[] clientes = new Cliente[200];
    public int numClientes = 0;

    public Cancha[] canchas = new Cancha[20];
    public int numCanchas = 0;

    public Reserva[] reservas = new Reserva[500];
    public int numReservas = 0;

    public Pago[] pagos = new Pago[1000];
    public int numPagos = 0;
    
    public modelo.ServicioAdicional[] servicios = new modelo.ServicioAdicional[20];
    public int numServicios = 0;
    
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

    public boolean agregarCliente(Cliente c) {
        if (numClientes >= clientes.length) return false;
        if (buscarClientePorCodigo(c.getCodigo()) != null) return false;
        clientes[numClientes] = c;
        numClientes++;
        return true;
    }

    public boolean agregarCancha(Cancha c) {
        if (numCanchas >= canchas.length) return false;
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

        LocalTime apertura = LocalTime.parse(c.getHoraApertura());
        LocalTime cierre = LocalTime.parse(c.getHoraCierre());
        LocalTime inicioSol = LocalTime.parse(horaInicio);
        LocalTime finSol = LocalTime.parse(horaFin);

        if (inicioSol.isBefore(apertura) || finSol.isAfter(cierre)) {
            return false; 
        }

        for (int i = 0; i < numReservas; i++) {
            Reserva r = reservas[i];
            if (r.getCodigoCancha().equals(codigoCancha) && r.getFecha().equals(fecha) 
                && !r.getEstado().equals(Reserva.CANCELADA)) {
                
                if (seTraslapan(horaInicio, horaFin, r.getHoraInicio(), r.getHoraFin())) {
                    return false; 
                }
            }
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

            System.out.println("Todo guardado exitosamente en el disco.");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public void cargarTodo() {
        numClientes = 0; numCanchas = 0; numReservas = 0; numPagos = 0;

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
    }

    public void cargarCanchasPorDefecto() {
        if (numCanchas > 0) return;
        agregarCancha(new Cancha("C01", "La Bombonera", "Fútbol 5", 10, "08:00", "23:00", Cancha.DISPONIBLE));
        agregarCancha(new Cancha("C02", "El Maracaná",  "Fútbol 5", 10, "08:00", "23:00", Cancha.DISPONIBLE));
        agregarCancha(new Cancha("C03", "El Monumental","Fútbol 7", 14, "08:00", "23:00", Cancha.DISPONIBLE));
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
    
    
}