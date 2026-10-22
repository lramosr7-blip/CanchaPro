
package com.mycompany.canchapro;

import modelo.Cliente;
import modelo.Repositorio;
import modelo.Reserva;

public class CanchaPro {

    public static void main(String[] args) {
    Repositorio repo = new Repositorio();
    repo.cargarTodo();
    repo.cargarCanchasPorDefecto();
    
    VentanaPrincipal ventana = new VentanaPrincipal(repo);

    ventana.setVisible(true);
 
    
      
}
}
