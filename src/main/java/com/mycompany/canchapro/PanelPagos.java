
package com.mycompany.canchapro;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class PanelPagos extends javax.swing.JPanel {
    private modelo.Repositorio repo;
    public PanelPagos(modelo.Repositorio repo) {
        initComponents();
        this.repo = repo;
        actualizarReservas();
    }
    
    public void actualizarReservas(){
        cbxReservas.removeAllItems();
        for (int i = 0; i<repo.numReservas; i++){
            //solo mostrar unicamente las que no estan canceladas ni finalizadas
            if(!repo.reservas[i].getEstado().equals(modelo.Reserva.CANCELADA) && !repo.reservas[i].getEstado().equals(modelo.Reserva.FINALIZADA)){
                cbxReservas.addItem(repo.reservas[i].getCodigo() + " - Cliente: "+repo.reservas[i].getCodigoCliente()+ " - Total: Q"+repo.reservas[i].getTotal());
                
            }
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblPagado = new javax.swing.JLabel();
        lblPagado1 = new javax.swing.JLabel();
        lblPendiente = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblInfo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxReservas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxMetodo = new javax.swing.JComboBox<>();
        btnPagar = new javax.swing.JButton();

        setBackground(new java.awt.Color(11, 17, 21));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 25, 31));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Gestion de pagos");

        lblDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion.setText("Administra los abonos y saldos de las reservas");

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
                .addContainerGap(543, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 865, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 255, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 255, 51));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 72, 865, 10));

        jPanel2.setBackground(new java.awt.Color(17, 25, 31));

        lblTitulo2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setText("Estado de Cueta");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pagado");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pendiente");

        lblTotal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("-");

        lblPagado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPagado.setForeground(new java.awt.Color(255, 255, 255));
        lblPagado.setText("-");

        lblPagado1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPagado1.setForeground(new java.awt.Color(255, 255, 255));

        lblPendiente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPendiente.setForeground(new java.awt.Color(255, 255, 255));
        lblPendiente.setText("-");

        jSeparator3.setBackground(new java.awt.Color(51, 255, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 255, 51));

        lblInfo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setText("Informacion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitulo2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(416, 416, 416)
                                .addComponent(lblPagado1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(lblPagado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblInfo)))
                        .addGap(0, 379, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfo)
                .addGap(12, 12, 12)
                .addComponent(lblPagado1)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblPagado)
                    .addComponent(lblPendiente))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jPanel6.setBackground(new java.awt.Color(17, 25, 31));

        lblTitulo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Registrar Abono");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccionar Reserva");

        cbxReservas.setBackground(new java.awt.Color(27, 37, 44));
        cbxReservas.setForeground(new java.awt.Color(255, 255, 255));
        cbxReservas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxReservas.addActionListener(this::cbxReservasActionPerformed);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Monto a abonar");

        txtMonto.setBackground(new java.awt.Color(27, 37, 44));
        txtMonto.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Metodo de Pago");

        cbxMetodo.setBackground(new java.awt.Color(27, 37, 44));
        cbxMetodo.setForeground(new java.awt.Color(255, 255, 255));
        cbxMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "Tranferencia" }));

        btnPagar.setBackground(new java.awt.Color(0, 128, 75));
        btnPagar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("RegistrarPago");
        btnPagar.addActionListener(this::btnPagarActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cbxMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnPagar)))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbxReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnPagar)
                .addContainerGap())
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 860, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if(cbxReservas.getItemCount() ==0){
            JOptionPane.showMessageDialog(this, "No hat reservas pendientes de pago");
            return;
           
        }
        String seleccion = cbxReservas.getSelectedItem().toString();
        String codReserva = seleccion.split(" - ")[0];
        
        //buscar la reserva para saber su estado
        
        double totalReserva = 0;
        
        for (int i = 0; i<repo.numReservas; i++){
            if (repo.reservas[i].getCodigo().equals(codReserva)){
                totalReserva = repo.reservas[i].getTotal();
                break;
            }
        }
        
        
        //calcular el saldo acutal 
        double pago = repo.calcularTotalPagado(codReserva);
        double saldo = totalReserva - pago;
        
        double monto = 0; 
        
        try{
            monto = Double.parseDouble(txtMonto.getText());
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Ingresa un monto numerico que sea valido");
            return;
        }
        
        
        //validar
        if(monto <=0){
            JOptionPane.showMessageDialog(this, "Ell pago debe de ser mayor a cero");
            return;
        }
        if(monto > saldo){
            JOptionPane.showMessageDialog(this, "El pago (Q" + monto +") supera el saldo pendiente (Q"+saldo+ ")");
            return;
        }
        
        
        //obtener la fecha y hora actual;
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String fechaHoraActual = ahora.format(formato);
        
        
        
        
        
        ///registrar el pago
       String codPago  = "P"+(repo.numPagos+1);
       String metodo = cbxMetodo.getSelectedItem().toString();
       modelo.Pago nuevoPago = new modelo.Pago(codPago, codReserva, fechaHoraActual, monto, metodo);
       
       repo.agregarPago(nuevoPago);
       repo.actualizarEstadosAutomaticos();
       
       //actualizar la informacion en pantalla;
       cbxReservasActionPerformed(null);
   
      
       
       
    }//GEN-LAST:event_btnPagarActionPerformed

    private void cbxReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxReservasActionPerformed
        if(cbxReservas.getItemCount()==0) return;
        
        String seleccion = cbxReservas.getSelectedItem().toString();
        String codReserva = seleccion.split(" - ")[0];
        
        double totalReserva =0;
        
        for (int i = 0; i<repo.numReservas; i++){
            if (repo.reservas[i].getCodigo().equals(codReserva)){
                totalReserva = repo.reservas[i].getTotal();
                break;
            }
        }
        
        //calcular cuanto se ha pagado y cuanto falta
        double pagado = repo.calcularTotalPagado(codReserva);
        double saldo = totalReserva - pagado;
        
        //actualizar los labes de la pantalla; 
        
        lblTotal.setText("Q."+totalReserva);
        lblPagado.setText("Q"+pagado);
        lblPendiente.setText("Q"+saldo);
        
        // si ya se pago todo
        
        if (saldo ==0 ){
            lblInfo.setText("Reserva Pagada en su totalidad");
        }else{
            lblInfo.setText("Saldo pendiete por cobrar");
        }
    }//GEN-LAST:event_cbxReservasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> cbxMetodo;
    private javax.swing.JComboBox<String> cbxReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblPagado;
    private javax.swing.JLabel lblPagado1;
    private javax.swing.JLabel lblPendiente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
