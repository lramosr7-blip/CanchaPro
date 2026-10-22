
package com.mycompany.canchapro;

import javax.swing.JOptionPane;


public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());

    private modelo.Repositorio repo; 
    private java.awt.CardLayout cardLayout;
    
    private PanelDashboard panelDash;
    private PanelClientes panelCli;
    private PanelReservas panelRes;
    
    public VentanaPrincipal(modelo.Repositorio repo) {
        initComponents();
        this.repo = repo;
        this.setLocationRelativeTo(null);
        
        cardLayout = new java.awt.CardLayout();
        panelCentral.setLayout(cardLayout);
        
        panelDash = new PanelDashboard(repo);
       panelCli = new PanelClientes(repo);
        panelRes = new PanelReservas(repo);
       
       panelCentral.add(panelDash, "dashboard");
       panelCentral.add(panelCli, "clientes");
       panelCentral.add(panelRes, "reservas");
       
       cardLayout.show(panelCentral, "dashboard");
       
               
    }
 
        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        panelCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CanchaPro");
        setBackground(new java.awt.Color(11, 17, 21));

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.BorderLayout());

        panelLateral.setBackground(new java.awt.Color(8, 13, 16));
        panelLateral.setPreferredSize(new java.awt.Dimension(220, 700));

        jLabel1.setBackground(new java.awt.Color(8, 13, 16));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CanchaPro");

        btnDashboard.setBackground(new java.awt.Color(8, 122, 73));
        btnDashboard.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("Inicio");
        btnDashboard.setBorderPainted(false);
        btnDashboard.setFocusPainted(false);
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashboard.setOpaque(true);
        btnDashboard.setPreferredSize(new java.awt.Dimension(200, 50));
        btnDashboard.addActionListener(this::btnDashboardActionPerformed);

        btnClientes.setBackground(new java.awt.Color(8, 13, 16));
        btnClientes.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(220, 230, 235));
        btnClientes.setText("Clientes");
        btnClientes.setBorderPainted(false);
        btnClientes.setFocusPainted(false);
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.setOpaque(true);
        btnClientes.setPreferredSize(new java.awt.Dimension(200, 50));
        btnClientes.addActionListener(this::btnClientesActionPerformed);

        btnReservas.setBackground(new java.awt.Color(8, 13, 16));
        btnReservas.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnReservas.setForeground(new java.awt.Color(220, 230, 235));
        btnReservas.setText("Reservas");
        btnReservas.setBorderPainted(false);
        btnReservas.setFocusPainted(false);
        btnReservas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReservas.setOpaque(true);
        btnReservas.setPreferredSize(new java.awt.Dimension(200, 50));
        btnReservas.addActionListener(this::btnReservasActionPerformed);

        btnGuardar.setBackground(new java.awt.Color(8, 13, 16));
        btnGuardar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(220, 230, 235));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuardar.setOpaque(true);
        btnGuardar.setPreferredSize(new java.awt.Dimension(200, 50));
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );

        jPanel4.add(panelLateral, java.awt.BorderLayout.WEST);

        panelCentral.setBackground(new java.awt.Color(11, 17, 21));
        panelCentral.setPreferredSize(new java.awt.Dimension(1200, 750));

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jPanel4.add(panelCentral, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       repo.guardarTodo();
        
        JOptionPane.showMessageDialog(this, "Datos Guardados en el disco");
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
            cardLayout.show(panelCentral, "dashboard");
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        cardLayout.show(panelCentral, "clientes");
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        cardLayout.show(panelCentral, "reservas");
        panelRes.actualizarCombos();
        panelRes.actualizarTabla();
    }//GEN-LAST:event_btnReservasActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelLateral;
    // End of variables declaration//GEN-END:variables
}
