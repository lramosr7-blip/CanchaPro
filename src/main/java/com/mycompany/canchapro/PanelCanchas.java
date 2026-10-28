
package com.mycompany.canchapro;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.JTableHeader;
import javax.swing.table.DefaultTableModel;


public class PanelCanchas extends javax.swing.JPanel {

    private modelo.Repositorio repo;
    public PanelCanchas(modelo.Repositorio repo) {
        initComponents();
        this.repo = repo;
        aplicarEstiloTabla();
    }

    
    
    public void actualizattabla (){
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaCanchas.getModel();
        modeloTabla.setRowCount(0);
        
        for (int i =0; i<repo.numCanchas; i++){
            modelo.Cancha c =repo.canchas[i];
            Object[] fila =new Object[7];
            fila [0]= c.getCodigo();
            fila [1] = c.getNombre();
            fila [2]= c.getTipo();
            fila [3] = c.getCapacidad();
            fila [4] =c.getHoraApertura();
            fila [5] = c.getHoraCierre();
            fila [6] =c.getEstado();
            
            modeloTabla.addRow(fila);
         
        }
       tablaCanchas.repaint();
        
    }
    
    
    
    private void aplicarEstiloTabla(){
        //para colores
       Color fondo = new Color(17,25,31);
       Color verde = new Color(0,122,73);
       Color texto = Color.WHITE;
       Color gris = new Color(43,58,66);
       
       //tabla
       
       tablaCanchas.setBackground(fondo);
       tablaCanchas.setForeground(texto);
       tablaCanchas.setGridColor(gris);
       tablaCanchas.setSelectionBackground(verde);
       tablaCanchas.setSelectionForeground(texto);
       tablaCanchas.setRowHeight(28);
       
       //encabezados de las columnas
       JTableHeader encabezado = tablaCanchas.getTableHeader();
       
       encabezado.setBackground( new Color(24,33,39));
       encabezado.setForeground(texto);
       encabezado.setFont(new Font ("Arial", BOLD, 12));
       
       //panel que contiene la tabla
      JScrollPane scroll = (javax.swing.JScrollPane) javax.swing.SwingUtilities.getAncestorOfClass(javax.swing.JScrollPane.class,tablaCanchas);
       
       if (scroll != null){
           scroll.getViewport().setBackground(fondo);
           scroll.setBackground(fondo);
           scroll.getViewport().setOpaque(true);
       }
       
       
        
        
        
        
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelNuevaReserva = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        txtApertura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCierre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCanchas = new javax.swing.JTable();

        setBackground(new java.awt.Color(11, 17, 25));

        jPanel1.setBackground(new java.awt.Color(17, 25, 31));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Canchas");

        lblDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion.setText("Registra, actualiza y administra la informacion de las canchas");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel1.setText("Nueva Cancha");

        jLabel2.setBackground(new java.awt.Color(24, 33, 39));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");

        jLabel3.setBackground(new java.awt.Color(24, 33, 39));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setBackground(new java.awt.Color(24, 33, 39));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Capacidad");

        txtCapacidad.setBackground(new java.awt.Color(24, 33, 39));
        txtCapacidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCapacidad.setForeground(new java.awt.Color(255, 255, 255));

        txtApertura.setBackground(new java.awt.Color(24, 33, 39));
        txtApertura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtApertura.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(24, 33, 39));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora Apertura");

        txtCierre.setBackground(new java.awt.Color(24, 33, 39));
        txtCierre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCierre.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(24, 33, 39));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora Cierre");

        cbxTipo.setBackground(new java.awt.Color(27, 37, 44));
        cbxTipo.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cbxTipo.setForeground(new java.awt.Color(255, 255, 255));
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futbol 5", "Futbol 7", " " }));
        cbxTipo.addActionListener(this::cbxTipoActionPerformed);

        txtCodigo.setBackground(new java.awt.Color(24, 33, 39));
        txtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));

        txtNombre.setBackground(new java.awt.Color(24, 33, 39));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(24, 33, 39));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo");

        jLabel9.setBackground(new java.awt.Color(24, 33, 39));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado");

        cbxEstado.setBackground(new java.awt.Color(27, 37, 44));
        cbxEstado.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cbxEstado.setForeground(new java.awt.Color(255, 255, 255));
        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIBLE", "MANTENIMIENTO", "INACTIVA" }));
        cbxEstado.addActionListener(this::cbxEstadoActionPerformed);

        btnGuardar.setBackground(new java.awt.Color(0, 169, 92));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar Canchas");
        btnGuardar.setFocusPainted(false);
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnActualizar.setBackground(new java.awt.Color(0, 169, 92));
        btnActualizar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar Tabla");
        btnActualizar.setFocusPainted(false);
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        javax.swing.GroupLayout panelNuevaReservaLayout = new javax.swing.GroupLayout(panelNuevaReserva);
        panelNuevaReserva.setLayout(panelNuevaReservaLayout);
        panelNuevaReservaLayout.setHorizontalGroup(
            panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(534, 534, 534))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNuevaReservaLayout.createSequentialGroup()
                        .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNuevaReservaLayout.createSequentialGroup()
                                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNuevaReservaLayout.createSequentialGroup()
                                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)
                                .addGap(305, 305, 305)
                                .addComponent(jLabel8)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelNuevaReservaLayout.setVerticalGroup(
            panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                        .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaReservaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaReservaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                            .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelNuevaReservaLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panelNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jScrollPane1.setBackground(new java.awt.Color(17, 25, 31));

        tablaCanchas.setBackground(new java.awt.Color(17, 25, 31));
        tablaCanchas.setForeground(new java.awt.Color(255, 255, 255));
        tablaCanchas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Tipo", "Capacidad", "Apertura", "Cierre", "Estado"
            }
        ));
        tablaCanchas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCanchasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCanchas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(panelNuevaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNuevaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
           String codigo = txtCodigo.getText().trim();
           String nombre = txtNombre.getText().trim();
           String tipo =cbxTipo.getSelectedItem().toString();
           String apertura = txtApertura.getText().trim();
           String cierre = txtCierre.getText().trim();
           String estado = cbxEstado.getSelectedItem().toString();
           
           int capacidad =0;
           try{
               capacidad = Integer.parseInt(txtCapacidad.getText().trim());
           }catch(Exception e){
               JOptionPane.showMessageDialog(this, "La capacidad debe de ser un numero valido");
               return;
           }
           
           if(codigo.isEmpty() || nombre.isEmpty()){
               JOptionPane.showMessageDialog(this, "el codigo y el nombre son obligatorios");
                return;
           }
           

           
           //verificar si ya exite para actualizar
           modelo.Cancha exitente = repo.buscarCanchaPorCodigo(codigo);
           
           if(exitente != null){
               exitente.setNombre(nombre);
               exitente.setEstado(estado);
               exitente.setHoraApertura(apertura);
               exitente.setHoraCierre(cierre);
               JOptionPane.showMessageDialog(this, "Cancha actualizada");
               
           }else{
               modelo.Cancha nueva = new modelo.Cancha(codigo, nombre, tipo, capacidad, apertura, cierre, estado);
               if(repo.agregarCancha(nueva)){
                   JOptionPane.showMessageDialog(this, "Cancha Registrada");
                   
               }else{
                   JOptionPane.showMessageDialog(this, "Error, arreglos lleno o codigo duplicado");
               }
           }
           
           actualizattabla();
           txtCodigo.setText("");
           txtNombre.setText("");
           txtCapacidad.setText("");
           txtApertura.setText("");
           txtCierre.setText("");
           
           
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
           actualizattabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tablaCanchasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCanchasMouseClicked
       int fila = tablaCanchas.getSelectedRow();
       
       if(fila!=1){
           txtCodigo.setText(tablaCanchas.getValueAt(fila, 0).toString());
           txtNombre.setText(tablaCanchas.getValueAt(fila, 1).toString());
           cbxTipo.setSelectedItem(tablaCanchas.getValueAt(fila,2).toString());
           txtCapacidad.setText(tablaCanchas.getValueAt(fila, 3).toString());
           txtApertura.setText(tablaCanchas.getValueAt(fila, 4).toString());
           txtCierre.setText(tablaCanchas.getValueAt(fila, 5).toString());
           cbxEstado.setSelectedItem(tablaCanchas.getValueAt(fila,6).toString());
     
       }
    }//GEN-LAST:event_tablaCanchasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelNuevaReserva;
    private javax.swing.JTable tablaCanchas;
    private javax.swing.JTextField txtApertura;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCierre;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
