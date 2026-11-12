
package com.mycompany.canchapro;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class PanelReportes extends javax.swing.JPanel {

    private modelo.Repositorio repo;
    
    public PanelReportes(modelo.Repositorio repo) {
        initComponents();
        this.repo = repo;
        aplicarEstiloTabla();
    }

    
    
       private void aplicarEstiloTabla(){
        //para colores
       Color fondo = new Color(17,25,31);
       Color verde = new Color(0,122,73);
       Color texto = Color.WHITE;
       Color gris = new Color(43,58,66);
       
       //tabla
       
       tablaReportes.setBackground(fondo);
       tablaReportes.setForeground(texto);
       tablaReportes.setGridColor(gris);
       tablaReportes.setSelectionBackground(verde);
       tablaReportes.setSelectionForeground(texto);
       tablaReportes.setRowHeight(28);
       
       //encabezados de las columnas
       JTableHeader encabezado = tablaReportes.getTableHeader();
       
       encabezado.setBackground( new Color(24,33,39));
       encabezado.setForeground(texto);
       encabezado.setFont(new Font ("Arial", BOLD, 12));
       
       //panel que contiene la tabla
      JScrollPane scroll = (javax.swing.JScrollPane) javax.swing.SwingUtilities.getAncestorOfClass(javax.swing.JScrollPane.class,tablaReportes);
       
       if (scroll != null){
           scroll.getViewport().setBackground(fondo);
           scroll.setBackground(fondo);
           scroll.getViewport().setOpaque(true);
       }
       
       
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescripcion1 = new javax.swing.JLabel();
        cbxReportes = new javax.swing.JComboBox<>();
        btnGenerar = new javax.swing.JButton();
        panelResultados = new javax.swing.JPanel();
        lblTituloResultados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReportes = new javax.swing.JTable();

        setBackground(new java.awt.Color(11, 17, 21));

        jPanel1.setBackground(new java.awt.Color(17, 25, 31));

        lblDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion.setText("Consulta las estadisticas y la actividad ");

        lblTitulo1.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Reportes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo1)
                    .addComponent(lblDescripcion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(11, 25, 31));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Generar Reporte");

        lblDescripcion1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion1.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion1.setText("Selecciona un reporte");

        cbxReportes.setBackground(new java.awt.Color(27, 37, 44));
        cbxReportes.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxReportes.setForeground(new java.awt.Color(255, 255, 255));
        cbxReportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reservas por Canchas", "Clientes con más Reservas", "Ingresos Totales", "Rerservas Canceladas", "Reservas por fechas", "Pagos Pendientes", "Cancha más utilizada", "Horarioss de mayor demanda", " " }));

        btnGenerar.setBackground(new java.awt.Color(0, 128, 75));
        btnGenerar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("Generar Reporte");
        btnGenerar.addActionListener(this::btnGenerarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(lblDescripcion1)
                            .addComponent(cbxReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblDescripcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelResultados.setBackground(new java.awt.Color(17, 25, 31));

        lblTituloResultados.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTituloResultados.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloResultados.setText("Resultados de Reporte");

        jScrollPane1.setBackground(new java.awt.Color(17, 25, 31));

        tablaReportes.setBackground(new java.awt.Color(17, 25, 31));
        tablaReportes.setForeground(new java.awt.Color(255, 255, 255));
        tablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Conceptop", "Cantidad/Monto"
            }
        ));
        tablaReportes.setGridColor(new java.awt.Color(43, 58, 66));
        tablaReportes.setRowHeight(28);
        tablaReportes.setSelectionBackground(new java.awt.Color(0, 128, 75));
        tablaReportes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaReportes);

        javax.swing.GroupLayout panelResultadosLayout = new javax.swing.GroupLayout(panelResultados);
        panelResultados.setLayout(panelResultadosLayout);
        panelResultadosLayout.setHorizontalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelResultadosLayout.createSequentialGroup()
                        .addComponent(lblTituloResultados)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelResultadosLayout.setVerticalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloResultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        
        int opcion = cbxReportes.getSelectedIndex();
        
        String [][]datos = repo.generarReporte(opcion);
        String [] columnas = repo.obtenerColumnasReporte(opcion);
        
        DefaultTableModel modelo = new DefaultTableModel (datos, columnas);
        tablaReportes.setModel(modelo);
    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbxReportes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTituloResultados;
    private javax.swing.JPanel panelResultados;
    private javax.swing.JTable tablaReportes;
    // End of variables declaration//GEN-END:variables
}
