
package com.mycompany.canchapro;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.JTableHeader;
import javax.swing.table.DefaultTableModel;


public class PanelReservas extends javax.swing.JPanel {

  
    private modelo.Repositorio repo;
    public PanelReservas(modelo.Repositorio repo) {
        initComponents();
        this.repo = repo;
        actualizarCombos();
        aplicarEstiloTabla();
        actualizarTabla();
    }
    
    public void actualizarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaReservas.getModel();
        
        modeloTabla.setRowCount(0);
        
        for (int i = 0; i<repo.numReservas; i++){
            modelo.Reserva r = repo.reservas[i];
            Object [] fila = new Object[7];
            fila[0] = r.getCodigo();
            fila[1] = r.getCodigoCliente();
            fila[2] = r.getCodigoCancha();
            fila[3] = r.getFecha();
            fila[4] = r.getHoraInicio();
            fila[5] = r.getHoraFin();
            fila[6] = r.getEstado();
            
            modeloTabla.addRow(fila);
            
           
        }
        
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelNuevaReserva = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxClientes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxCanchas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHoraInicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHoraFin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnReservar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(11, 17, 21));
        setPreferredSize(new java.awt.Dimension(1200, 750));

        jPanel1.setBackground(new java.awt.Color(17, 25, 31));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Reservas");

        lblDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion.setText("Consultas la disponibilidad y registra nuevas reservas.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblDescripcion))
                    .addComponent(lblTitulo))
                .addContainerGap(829, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(51, 255, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 255, 51));

        panelNuevaReserva.setBackground(new java.awt.Color(17, 25, 31));
        panelNuevaReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Reserva");

        jLabel2.setBackground(new java.awt.Color(24, 33, 39));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente:");

        cbxClientes.setBackground(new java.awt.Color(24, 33, 39));
        cbxClientes.setForeground(new java.awt.Color(255, 255, 255));
        cbxClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxClientes.addActionListener(this::cbxClientesActionPerformed);

        jLabel3.setBackground(new java.awt.Color(24, 33, 39));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cancha");

        cbxCanchas.setBackground(new java.awt.Color(24, 33, 39));
        cbxCanchas.setForeground(new java.awt.Color(255, 255, 255));
        cbxCanchas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setBackground(new java.awt.Color(24, 33, 39));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha (DD-MM-AAAA)");

        txtFecha.setBackground(new java.awt.Color(24, 33, 39));
        txtFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));

        txtHoraInicio.setBackground(new java.awt.Color(24, 33, 39));
        txtHoraInicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHoraInicio.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(24, 33, 39));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora Inicio (HH:MM)");

        txtHoraFin.setBackground(new java.awt.Color(24, 33, 39));
        txtHoraFin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHoraFin.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(24, 33, 39));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora Fin (HH:MM)");

        btnReservar.setBackground(new java.awt.Color(0, 169, 92));
        btnReservar.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnReservar.setText("Verificar y Reservar");
        btnReservar.setFocusPainted(false);
        btnReservar.addActionListener(this::btnReservarActionPerformed);

        javax.swing.GroupLayout panelNuevaReservaLayout = new javax.swing.GroupLayout(panelNuevaReserva);
        panelNuevaReserva.setLayout(panelNuevaReservaLayout);
        panelNuevaReservaLayout.setHorizontalGroup(
            panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(130, 130, 130)
                                .addComponent(jLabel3))
                            .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbxCanchas, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                                    .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41)
                                    .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNuevaReservaLayout.setVerticalGroup(
            panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxCanchas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(17, 25, 31));

        lblResultado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado.setText("Resultado");

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Cancha", "Fecha", "Inicio", "Fin", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tablaReservas);

        btnCancelar.setBackground(new java.awt.Color(45, 52, 58));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar Reserva Seleccionada");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblResultado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNuevaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNuevaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void actualizarCombos(){
        //primero limpiar las listas
        cbxCanchas.removeAllItems();
        cbxClientes.removeAllItems();
        
        //llnear con el arreglo
        for (int i=0; i<repo.numClientes; i++){
            cbxClientes.addItem(repo.clientes[i].getCodigo() + " - "+ repo.clientes[i].getNombre());
        }
        
        //llenar con las canchas del arreglo
        for (int i = 0; i<repo.numCanchas; i++){
            cbxCanchas.addItem(repo.canchas[i].getCodigo() + " - "+ repo.canchas[i].getNombre());
        }
    }
    
    
        private void aplicarEstiloTabla(){
        //para colores
       Color fondo = new Color(17,25,31);
       Color verde = new Color(0,122,73);
       Color texto = Color.WHITE;
       Color gris = new Color(43,58,66);
       
       //tabla
       
       tablaReservas.setBackground(fondo);
       tablaReservas.setForeground(texto);
       tablaReservas.setGridColor(gris);
       tablaReservas.setSelectionBackground(verde);
       tablaReservas.setSelectionForeground(texto);
       tablaReservas.setRowHeight(28);
       
       //encabezados de las columnas
       JTableHeader encabezado = tablaReservas.getTableHeader();
       
       encabezado.setBackground( new Color(24,33,39));
       encabezado.setForeground(texto);
       encabezado.setFont(new Font ("Arial", BOLD, 12));
       
       //panel que contiene la tabla
      JScrollPane scroll = (javax.swing.JScrollPane) javax.swing.SwingUtilities.getAncestorOfClass(javax.swing.JScrollPane.class,tablaReservas);
       
       if (scroll != null){
           scroll.getViewport().setBackground(fondo);
           scroll.setBackground(fondo);
           scroll.getViewport().setOpaque(true);
       }
       
       
        
        
        
        
    }
    
    
    
    private void cbxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClientesActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        //validar que de hayan clintes y canchas
        if(cbxCanchas.getItemCount()==0 || cbxClientes.getItemCount()==0){
            JOptionPane.showMessageDialog(this, "Debe de haber al menos un cliente y una cancha registrados");
            return; 
        }
        
        //obtener los datos de los texfield
        String codCliente = cbxClientes.getSelectedItem().toString().split(" - ")[0];
        String codCancha = cbxCanchas.getSelectedItem().toString().split(" - ")[0];
        
        String fecha = txtFecha.getText().trim();
        String hInicio = txtHoraInicio.getText().trim();
        String hFin = txtHoraFin.getText().trim();
        
        if (fecha.isEmpty() || hInicio.isEmpty() || hFin.isEmpty()){
            JOptionPane.showMessageDialog(this, "Porfavor, llenar todos los campos de fecha y hora");
            return;
        }
        
        // verificar si la cancha esta diponible en ese horario
        boolean disponible = repo.esCanchaDisponible(codCancha, fecha, hInicio, hFin);
        
        if(disponible){
            
            try{
                int minInicio = Integer.parseInt(hInicio.split(":")[0])* 60 + Integer.parseInt(hInicio.split(":")[1]);
                int minFin = Integer.parseInt(hFin.split(":")[0])* 60 + Integer.parseInt(hFin.split(":")[1]);
                
                if (minFin<=minInicio){
                    JOptionPane.showMessageDialog(this, "La hora de fin debe de ser mayor a la hora de inicio");
                    return;
                }
                
                double horas = (minFin-minInicio)/60.0;
                double total = horas *225.0;
                
                // se crea la reserva
                String codReserva = "R"+(repo.numReservas+1);
                modelo.Reserva nueva = new modelo.Reserva(codReserva, codCliente, codCancha, fecha, hInicio, hFin, total, modelo.Reserva.PENDIENTE );
                repo.agregarReserva(nueva);
                
                lblResultado.setText("Exito reserva "+ codReserva+" Creada. Total Q"+total);
                JOptionPane.showMessageDialog(this, "Reserva registrada \n"+ "Recuerda ir a Guardar en el lateral");
                actualizarTabla();
                
                txtFecha.setText("");
                txtHoraInicio.setText("");
                txtHoraFin.setText("");
            }catch (Exception e){
                
                JOptionPane.showMessageDialog(this, "Error en el formato de las horas");
                
                
            }
            
            
        }else{
            lblResultado.setText("Error: la cancha no esta disponible en ese horario");
            JOptionPane.showMessageDialog(this, "Error, la cancha no esta disponible");
            
        }
 
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // ver si se selecciono una fila
        
        int fila = tablaReservas.getSelectedRow();
        
        if (fila == -1){
            JOptionPane.showMessageDialog(this, "Porfavor, Seleccione una reserva de la tabla primero");
            return;
        }
        
        //obterner el codigo de la reserva seleccionadad
        String codReserva = tablaReservas.getValueAt(fila, 0).toString();
        
        //buscar la reserva en el arreglo y cambiar el estado
        
        for (int i= 0; i<repo.numReservas; i++){
            if (repo.reservas[i].getCodigo().equals(codReserva)){
                
                //valiar por si ya esta cancelada
                if(repo.reservas[i].getEstado().equals(modelo.Reserva.CANCELADA)){
                    JOptionPane.showMessageDialog(this, "Esta reservas ya esta cancelada");
                    return; 
                }
                
                //cambiar estado
                repo.reservas[i].setEstado(modelo.Reserva.CANCELADA);
                JOptionPane.showMessageDialog(this, "Reserva cancelada. El registro se mantiene en el historial");
                
            }
        }
        
        actualizarTabla();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cbxCanchas;
    private javax.swing.JComboBox<String> cbxClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelNuevaReserva;
    private javax.swing.JTable tablaReservas;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    // End of variables declaration//GEN-END:variables
}
