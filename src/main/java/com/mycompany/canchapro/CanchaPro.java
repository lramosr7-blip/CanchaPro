
package com.mycompany.canchapro;

import modelo.Cliente;
import modelo.Repositorio;
import modelo.Reserva;

public class CanchaPro {

    public static void main(String[] args) {
    Repositorio repo = new Repositorio();
    repo.cargarTodo();
    repo.cargarCanchasPorDefecto();

    // Registramos un cliente de prueba
    Reserva r1 = new Reserva ("R01", "CL01", "C01", "2025-04-15", "18:00", "19:00", 450, Reserva.CONFIRMADA);
    repo.agregarReserva(r1);
    
      // PRUEBA 1: Intentar reservar 18:30 a 19:30 (debería dar false)
    boolean disponible1 = repo.esCanchaDisponible("C01", "2025-04-15", "18:30", "19:30");
    System.out.println("Reserva 18:30-19:30 disponible?: " + disponible1 + " (Esperado: false)");
}
}
