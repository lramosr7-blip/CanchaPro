
package com.mycompany.canchapro;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.JTableHeader;
import javax.swing.table.DefaultTableModel;

public class PanelTienda extends javax.swing.JPanel {

  
    private modelo.Repositorio repo;
    
    
    
    private DefaultTableModel modeloTabla;
    
    public PanelTienda(modelo.Repositorio repo) {
        initComponents();
        this.repo = repo;
        aplicarEstiloTabla();
        
        modeloTabla = (DefaultTableModel) tablaCarrito.getModel();
        modeloTabla.setRowCount(0);
        
      actualizarComboProductos();
        
    }
    
    public void actualizarComboProductos(){
        cbxProductos.removeAllItems();
        for (int i =0; i<repo.numProductos; i++){
            modelo.Producto nuevo = repo.productos[i];
            if(nuevo.getStock()>0){//solo se muestran los que tengan stock
                cbxProductos.addItem(nuevo.getCodigo()+ " - " +nuevo.getNombre() + " Q" +nuevo.getPrecio() + " - Stock"+ nuevo.getStock());
            }
        }
    }
    
    private void calcularTotal(){
        double total = 0; 
        for (int i =0; i<modeloTabla.getRowCount(); i++){
            total+= Double.parseDouble(modeloTabla.getValueAt(i, 3).toString());
        }
        lblTotal.setText("Q "+total);
    }

    
       private void aplicarEstiloTabla(){
        //para colores
       Color fondo = new Color(17,25,31);
       Color verde = new Color(0,122,73);
       Color texto = Color.WHITE;
       Color gris = new Color(43,58,66);
       
       //tabla
       
       tablaCarrito.setBackground(fondo);
       tablaCarrito.setForeground(texto);
       tablaCarrito.setGridColor(gris);
       tablaCarrito.setSelectionBackground(verde);
       tablaCarrito.setSelectionForeground(texto);
       tablaCarrito.setRowHeight(28);
       
       //encabezados de las columnas
       JTableHeader encabezado = tablaCarrito.getTableHeader();
       
       encabezado.setBackground( new Color(24,33,39));
       encabezado.setForeground(texto);
       encabezado.setFont(new Font ("Arial", BOLD, 12));
       
       //panel que contiene la tabla
      JScrollPane scroll = (javax.swing.JScrollPane) javax.swing.SwingUtilities.getAncestorOfClass(javax.swing.JScrollPane.class,tablaCarrito);
       
       if (scroll != null){
           scroll.getViewport().setBackground(fondo);
           scroll.setBackground(fondo);
           scroll.getViewport().setOpaque(true);
       }
       
       
        
        
        
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        lblDescripcion1 = new javax.swing.JLabel();
        cbxProductos = new javax.swing.JComboBox<>();
        lblDescripcion2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        lblTitulo2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();

        setBackground(new java.awt.Color(17, 26, 33));

        jPanel1.setBackground(new java.awt.Color(17, 25, 31));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Tienda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator1.setBackground(new java.awt.Color(51, 255, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 255, 51));

        jPanel2.setBackground(new java.awt.Color(11, 25, 31));

        lblTitulo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Agregar Producto");

        lblDescripcion1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion1.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion1.setText("Producto");

        cbxProductos.setBackground(new java.awt.Color(27, 37, 44));
        cbxProductos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxProductos.setForeground(new java.awt.Color(255, 255, 255));

        lblDescripcion2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion2.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion2.setText("Cantidad");

        txtCantidad.setBackground(new java.awt.Color(24, 33, 39));
        txtCantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));

        btnAgregar.setBackground(new java.awt.Color(0, 169, 92));
        btnAgregar.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar al carrito");
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        btnInventario.setBackground(new java.awt.Color(0, 169, 92));
        btnInventario.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("Inventario");
        btnInventario.setFocusPainted(false);
        btnInventario.addActionListener(this::btnInventarioActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo1)
                    .addComponent(lblDescripcion1)
                    .addComponent(lblDescripcion2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitulo1)
                .addGap(24, 24, 24)
                .addComponent(lblDescripcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDescripcion2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(11, 25, 31));

        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tablaCarrito);

        lblTitulo2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setText("Total a pagar");

        lblTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("-");

        btnVender.setBackground(new java.awt.Color(0, 169, 92));
        btnVender.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnVender.setForeground(new java.awt.Color(255, 255, 255));
        btnVender.setText("Confirmar Venta");
        btnVender.setFocusPainted(false);
        btnVender.addActionListener(this::btnVenderActionPerformed);

        btnQuitar.setBackground(new java.awt.Color(150, 45, 45));
        btnQuitar.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnQuitar.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitar.setText("Quitar Producto");
        btnQuitar.setFocusPainted(false);
        btnQuitar.addActionListener(this::btnQuitarActionPerformed);

        btnVaciar.setBackground(new java.awt.Color(65, 75, 82));
        btnVaciar.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnVaciar.setForeground(new java.awt.Color(255, 255, 255));
        btnVaciar.setText("Vaciar Carrito");
        btnVaciar.setFocusPainted(false);
        btnVaciar.addActionListener(this::btnVaciarActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblTitulo2)
                                .addGap(162, 162, 162)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo2)
                    .addComponent(lblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       int index = cbxProductos.getSelectedIndex();
       if(index == -1) return;
       
       //extraer el codigo del texto
       String seleccion = cbxProductos.getSelectedItem().toString();
       String codProducto = seleccion.split(" - ")[0];
       
       modelo.Producto prod = repo.buscarProductosPorCodigo(codProducto);
       
       int cantidad = 0;
       try{
           cantidad = Integer.parseInt(txtCantidad.getText().trim());
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(this , "Cantidad Invalida");
           return;
       }
       
       
       if(cantidad > prod.getStock()){
           JOptionPane.showMessageDialog(this, "no hay suficiente inventario\n Tinees en tu Stock: "+ prod.getStock());
           return;
       }
       
       double subtotal = cantidad * prod.getPrecio();
       Object[] fila = new Object [4];
       
       fila[0] = prod.getNombre();
       fila[1] = prod.getPrecio();
       fila[2] = cantidad;
       fila[3] = subtotal;
       modeloTabla.addRow(fila);
       
       calcularTotal();
       txtCantidad.setText("");
               
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed

        
        if (modeloTabla.getRowCount() == 0){
            JOptionPane.showMessageDialog(this, "El carrito está vacío");
            return;
        }
        
        
         String codigoVenta = "V" + (repo.numVentas + 1);
        String fechaVenta = java.time.LocalDateTime.now().toString();   
   
        for (int i = 0; i < modeloTabla.getRowCount(); i++){
            String nombreVendido = modeloTabla.getValueAt(i, 0).toString();
            int cantidadVendida = Integer.parseInt(modeloTabla.getValueAt(i, 2).toString());
            
            
            
            // Buscamos el producto en el repositorio
            for (int j = 0; j < repo.numProductos; j++){
                if(repo.productos[j].getNombre().equals(nombreVendido)){
                    modelo.Venta venta = new modelo.Venta(
        codigoVenta,
        fechaVenta,
        repo.productos[j].getCodigo(),
        nombreVendido,
        cantidadVendida,
        Double.parseDouble(modeloTabla.getValueAt(i, 1).toString()),
        Double.parseDouble(modeloTabla.getValueAt(i, 3).toString())
);

repo.agregarVenta(venta);
                    int nuevoStock = repo.productos[j].getStock() - cantidadVendida;
                    repo.productos[j].setStock(nuevoStock);
                    break; // Se detiene al encontrar el producto correcto
                }
            }
        }
        
        repo.guardarTodo();
        JOptionPane.showMessageDialog(this, "Venta Realizada con exito");
    
        
        
        modeloTabla.setRowCount(0);
        calcularTotal();
        actualizarComboProductos();
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
     int fila = tablaCarrito.getSelectedRow();
     if(fila!=-1){
         modeloTabla.removeRow(fila);
         calcularTotal();
     }else{
         JOptionPane.showMessageDialog(this, "Selecciona un producto de la tabla");
     }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
       modeloTabla.setRowCount(0);
       calcularTotal();
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
     VentanInventario nueva = new VentanInventario (repo, this);
     nueva.setVisible(true);
    }//GEN-LAST:event_btnInventarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JButton btnVender;
    private javax.swing.JComboBox<String> cbxProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
