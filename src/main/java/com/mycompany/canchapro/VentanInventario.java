
package com.mycompany.canchapro;

import javax.swing.JOptionPane;


public class VentanInventario extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanInventario.class.getName());

    private modelo.Repositorio repo; 
    
    private PanelTienda panelTiendaPadre;
    public VentanInventario(modelo.Repositorio repo, PanelTienda padre) {
        initComponents();
        this.repo = repo;
        this.panelTiendaPadre = padre;
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        lblDescripcion1 = new javax.swing.JLabel();
        lblDescripcion2 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        btnGuardarProd = new javax.swing.JButton();
        txtNomProd = new javax.swing.JTextField();
        lblDescripcion3 = new javax.swing.JLabel();
        lblDescripcion4 = new javax.swing.JLabel();
        txtPrecioProd = new javax.swing.JTextField();
        txtStockProd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 25, 31));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Inventario de Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitulo)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(11, 25, 31));

        lblTitulo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Datos del Producto");

        lblDescripcion1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion1.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion1.setText("Codigo");

        lblDescripcion2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion2.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion2.setText("Nombre");

        txtCodProd.setBackground(new java.awt.Color(24, 33, 39));
        txtCodProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodProd.setForeground(new java.awt.Color(255, 255, 255));
        txtCodProd.addActionListener(this::txtCodProdActionPerformed);

        btnGuardarProd.setBackground(new java.awt.Color(0, 169, 92));
        btnGuardarProd.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnGuardarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarProd.setText("Guardar / Reabastercer");
        btnGuardarProd.setFocusPainted(false);
        btnGuardarProd.addActionListener(this::btnGuardarProdActionPerformed);

        txtNomProd.setBackground(new java.awt.Color(24, 33, 39));
        txtNomProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNomProd.setForeground(new java.awt.Color(255, 255, 255));

        lblDescripcion3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion3.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion3.setText("Precio");

        lblDescripcion4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion4.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion4.setText("Stock");

        txtPrecioProd.setBackground(new java.awt.Color(24, 33, 39));
        txtPrecioProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPrecioProd.setForeground(new java.awt.Color(255, 255, 255));

        txtStockProd.setBackground(new java.awt.Color(24, 33, 39));
        txtStockProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtStockProd.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescripcion1)
                                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDescripcion2)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescripcion3)
                                    .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStockProd, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDescripcion4)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnGuardarProd)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion1)
                    .addComponent(lblDescripcion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion3)
                    .addComponent(lblDescripcion4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStockProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(btnGuardarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProdActionPerformed
            String cod = txtCodProd.getText().trim();
            String nombre = txtNomProd.getText().trim();
            
            double precio = 0;
            int stock = 0;
            
            if(cod.isEmpty() || nombre.isEmpty()){
                JOptionPane.showMessageDialog(this, "El campo de nombre y codigo son obligatorios");
                return;
            }
            
            try{
                precio = Double.parseDouble(txtPrecioProd.getText().trim());
                stock = Integer.parseInt(txtStockProd.getText().trim());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "El stock y el precio deben ser valores numericos");
                return;
            }
            
            //crear producto
            modelo.Producto nuevo = new modelo.Producto(cod, nombre, precio, stock);
            
            if (repo.agregarProducto(nuevo)){
                JOptionPane.showMessageDialog(this, "Inventario Actualizado correctamente");
            }
            
            txtCodProd.setText("");
            txtNomProd.setText("");
            txtPrecioProd.setText("");
            txtStockProd.setText("");
            
            panelTiendaPadre.actualizarComboProductos();
    }//GEN-LAST:event_btnGuardarProdActionPerformed

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarProd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblDescripcion3;
    private javax.swing.JLabel lblDescripcion4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtNomProd;
    private javax.swing.JTextField txtPrecioProd;
    private javax.swing.JTextField txtStockProd;
    // End of variables declaration//GEN-END:variables
}
