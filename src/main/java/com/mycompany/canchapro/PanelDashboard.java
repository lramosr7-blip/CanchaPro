
package com.mycompany.canchapro;

import java.time.LocalDate;


public class PanelDashboard extends javax.swing.JPanel {

    
    private modelo.Repositorio repo;
    public PanelDashboard(modelo.Repositorio repo) {
        initComponents();
        this.repo = repo;
        actualizarDashboard();
    }

    
    
    public void actualizarDashboard(){
        int reservasHoy =0;
        int enCurso =0;
        int pendientes =0;
        double ingresosTotales =0;
        
        LocalDate hoy = LocalDate.now();
        String fechaHoy = hoy.toString();
        
        
        //contar el numero de reservas
        for (int i = 0; i<repo.numReservas; i++){
            modelo.Reserva r= repo.reservas[i];
            if(r.getFecha().equals(fechaHoy)&& !r.getEstado().equals(modelo.Reserva.CANCELADA)) reservasHoy++;
            if(r.getEstado().equals(modelo.Reserva.EN_CURSO)) enCurso++;
            if(r.getEstado().equals(modelo.Reserva.PENDIENTE))pendientes++;
            
             }
            //suma de los ingresos
            for(int i=0; i<repo.numPagos; i++){
                ingresosTotales +=repo.pagos[i].getMonto(); 
            }
            
            
            lblReservasHoy.setText(String.valueOf(reservasHoy));
            lblEnCurso.setText(String.valueOf(enCurso));
            lblPendientes.setText(String.valueOf(pendientes));
            lblIngresos.setText("Q"+ ingresosTotales);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelReservasHoy = new javax.swing.JPanel();
        lblTituloReservas = new javax.swing.JLabel();
        lblReservasHoy = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        lblTituloClientes = new javax.swing.JLabel();
        lblEnCurso = new javax.swing.JLabel();
        panelIngresos = new javax.swing.JPanel();
        lblTituloIngresos = new javax.swing.JLabel();
        lblPendientes = new javax.swing.JLabel();
        panelIngresos1 = new javax.swing.JPanel();
        lblTituloIngresos1 = new javax.swing.JLabel();
        lblIngresos = new javax.swing.JLabel();

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

        lblReservasHoy.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblReservasHoy.setForeground(new java.awt.Color(204, 225, 234));
        lblReservasHoy.setText("0");

        javax.swing.GroupLayout panelReservasHoyLayout = new javax.swing.GroupLayout(panelReservasHoy);
        panelReservasHoy.setLayout(panelReservasHoyLayout);
        panelReservasHoyLayout.setHorizontalGroup(
            panelReservasHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReservasHoyLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelReservasHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReservasHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelReservasHoyLayout.setVerticalGroup(
            panelReservasHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReservasHoyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTituloReservas)
                .addGap(18, 18, 18)
                .addComponent(lblReservasHoy)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        panelClientes.setBackground(new java.awt.Color(21, 32, 39));
        panelClientes.setPreferredSize(new java.awt.Dimension(294, 172));

        lblTituloClientes.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblTituloClientes.setForeground(new java.awt.Color(240, 239, 239));
        lblTituloClientes.setText("En Curso");

        lblEnCurso.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblEnCurso.setForeground(new java.awt.Color(204, 225, 234));
        lblEnCurso.setText("0");

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloClientes))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTituloClientes)
                .addGap(18, 18, 18)
                .addComponent(lblEnCurso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelIngresos.setBackground(new java.awt.Color(21, 32, 39));
        panelIngresos.setPreferredSize(new java.awt.Dimension(294, 172));

        lblTituloIngresos.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblTituloIngresos.setForeground(new java.awt.Color(240, 239, 239));
        lblTituloIngresos.setText("Pendientes");

        lblPendientes.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblPendientes.setForeground(new java.awt.Color(204, 225, 234));
        lblPendientes.setText("0");

        javax.swing.GroupLayout panelIngresosLayout = new javax.swing.GroupLayout(panelIngresos);
        panelIngresos.setLayout(panelIngresosLayout);
        panelIngresosLayout.setHorizontalGroup(
            panelIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloIngresos)
                    .addComponent(lblPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelIngresosLayout.setVerticalGroup(
            panelIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTituloIngresos)
                .addGap(18, 18, 18)
                .addComponent(lblPendientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelIngresos1.setBackground(new java.awt.Color(21, 32, 39));
        panelIngresos1.setPreferredSize(new java.awt.Dimension(294, 172));

        lblTituloIngresos1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblTituloIngresos1.setForeground(new java.awt.Color(240, 239, 239));
        lblTituloIngresos1.setText("Ingresos");

        lblIngresos.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblIngresos.setForeground(new java.awt.Color(204, 225, 234));
        lblIngresos.setText("0");

        javax.swing.GroupLayout panelIngresos1Layout = new javax.swing.GroupLayout(panelIngresos1);
        panelIngresos1.setLayout(panelIngresos1Layout);
        panelIngresos1Layout.setHorizontalGroup(
            panelIngresos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresos1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelIngresos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloIngresos1)
                    .addComponent(lblIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelIngresos1Layout.setVerticalGroup(
            panelIngresos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresos1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTituloIngresos1)
                .addGap(18, 18, 18)
                .addComponent(lblIngresos)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(panelReservasHoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(panelIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelIngresos1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelIngresos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelReservasHoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblEnCurso;
    private javax.swing.JLabel lblIngresos;
    private javax.swing.JLabel lblPendientes;
    private javax.swing.JLabel lblReservasHoy;
    private javax.swing.JLabel lblTituloClientes;
    private javax.swing.JLabel lblTituloIngresos;
    private javax.swing.JLabel lblTituloIngresos1;
    private javax.swing.JLabel lblTituloReservas;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelIngresos;
    private javax.swing.JPanel panelIngresos1;
    private javax.swing.JPanel panelReservasHoy;
    // End of variables declaration//GEN-END:variables
}
