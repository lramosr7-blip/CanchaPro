
package com.mycompany.canchapro;


public class PanelDashboard extends javax.swing.JPanel {

    
    private modelo.Repositorio repo;
    public PanelDashboard(modelo.Repositorio repo) {
        initComponents();
        this.repo = repo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelReservasHoy = new javax.swing.JPanel();
        lblTituloReservas = new javax.swing.JLabel();
        lblNumeroReservas = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        lblTituloClientes = new javax.swing.JLabel();
        lblNumeroClientes = new javax.swing.JLabel();
        panelIngresos = new javax.swing.JPanel();
        lblTituloIngresos = new javax.swing.JLabel();
        lblNumeroIngresos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(11, 17, 21));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido a CanchaPro");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 224, 235));
        jLabel3.setText("Gestiona tus canchas, clientes y reservas de forma facil y rapida");

        panelReservasHoy.setBackground(new java.awt.Color(21, 32, 39));

        lblTituloReservas.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblTituloReservas.setForeground(new java.awt.Color(240, 239, 239));
        lblTituloReservas.setText("Reservas hoy");

        lblNumeroReservas.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblNumeroReservas.setForeground(new java.awt.Color(204, 225, 234));
        lblNumeroReservas.setText("0");

        javax.swing.GroupLayout panelReservasHoyLayout = new javax.swing.GroupLayout(panelReservasHoy);
        panelReservasHoy.setLayout(panelReservasHoyLayout);
        panelReservasHoyLayout.setHorizontalGroup(
            panelReservasHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReservasHoyLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelReservasHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        panelReservasHoyLayout.setVerticalGroup(
            panelReservasHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReservasHoyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTituloReservas)
                .addGap(18, 18, 18)
                .addComponent(lblNumeroReservas)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        panelClientes.setBackground(new java.awt.Color(21, 32, 39));
        panelClientes.setPreferredSize(new java.awt.Dimension(294, 172));

        lblTituloClientes.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblTituloClientes.setForeground(new java.awt.Color(240, 239, 239));
        lblTituloClientes.setText("Clientes");

        lblNumeroClientes.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblNumeroClientes.setForeground(new java.awt.Color(204, 225, 234));
        lblNumeroClientes.setText("0");

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloClientes))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTituloClientes)
                .addGap(18, 18, 18)
                .addComponent(lblNumeroClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelIngresos.setBackground(new java.awt.Color(21, 32, 39));
        panelIngresos.setPreferredSize(new java.awt.Dimension(294, 172));

        lblTituloIngresos.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblTituloIngresos.setForeground(new java.awt.Color(240, 239, 239));
        lblTituloIngresos.setText("Ingresos hoy");

        lblNumeroIngresos.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblNumeroIngresos.setForeground(new java.awt.Color(204, 225, 234));
        lblNumeroIngresos.setText("0");

        javax.swing.GroupLayout panelIngresosLayout = new javax.swing.GroupLayout(panelIngresos);
        panelIngresos.setLayout(panelIngresosLayout);
        panelIngresosLayout.setHorizontalGroup(
            panelIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloIngresos))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        panelIngresosLayout.setVerticalGroup(
            panelIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTituloIngresos)
                .addGap(18, 18, 18)
                .addComponent(lblNumeroIngresos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(panelReservasHoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(panelIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelReservasHoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNumeroClientes;
    private javax.swing.JLabel lblNumeroIngresos;
    private javax.swing.JLabel lblNumeroReservas;
    private javax.swing.JLabel lblTituloClientes;
    private javax.swing.JLabel lblTituloIngresos;
    private javax.swing.JLabel lblTituloReservas;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelIngresos;
    private javax.swing.JPanel panelReservasHoy;
    // End of variables declaration//GEN-END:variables
}
