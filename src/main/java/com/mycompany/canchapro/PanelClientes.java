
package com.mycompany.canchapro;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.table.JTableHeader;
import javax.swing.JScrollBar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class PanelClientes extends javax.swing.JPanel {

   private modelo.Repositorio mirepo;
    public PanelClientes(modelo.Repositorio repo) {
  initComponents();
    this.mirepo = repo;       
    actualizarTabla();      
    aplicarEstiloTabla();
      
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PanelFormulario = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        PanelTabla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(24, 33, 39));
        setForeground(new java.awt.Color(235, 240, 245));
        setPreferredSize(new java.awt.Dimension(1200, 750));

        jPanel1.setBackground(new java.awt.Color(17, 25, 31));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Gestión de Clientes");

        lblDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(242, 241, 241));
        lblDescripcion.setText("Registra, busca y administra la informacion de los clientes");

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

        PanelFormulario.setBackground(new java.awt.Color(17, 25, 31));

        txtCodigo.setBackground(new java.awt.Color(24, 33, 39));
        txtCodigo.setColumns(20);
        txtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(235, 240, 245));
        txtCodigo.addActionListener(this::txtCodigoActionPerformed);

        lblNombre.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(24, 33, 39));
        txtNombre.setColumns(20);
        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(235, 240, 245));
        txtNombre.addActionListener(this::txtNombreActionPerformed);

        txtTelefono.setBackground(new java.awt.Color(24, 33, 39));
        txtTelefono.setColumns(20);
        txtTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(235, 240, 245));
        txtTelefono.addActionListener(this::txtTelefonoActionPerformed);

        lblTelefono.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Teléfono");

        lblCorreo.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo");

        txtCorreo.setBackground(new java.awt.Color(24, 33, 39));
        txtCorreo.setColumns(20);
        txtCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(235, 240, 245));
        txtCorreo.addActionListener(this::txtCorreoActionPerformed);

        lblFecha.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha");

        txtFecha.setBackground(new java.awt.Color(24, 33, 39));
        txtFecha.setColumns(20);
        txtFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(235, 240, 245));
        txtFecha.setText("(DD-MM-AAA)");
        txtFecha.setPreferredSize(new java.awt.Dimension(238, 26));
        txtFecha.addActionListener(this::txtFechaActionPerformed);

        btnRegistrar.setBackground(new java.awt.Color(0, 169, 92));
        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnBuscar.setBackground(new java.awt.Color(17, 25, 31));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 200, 117));
        btnBuscar.setText("Buscar por Código");
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        lblCodigo.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código");

        javax.swing.GroupLayout PanelFormularioLayout = new javax.swing.GroupLayout(PanelFormulario);
        PanelFormulario.setLayout(PanelFormularioLayout);
        PanelFormularioLayout.setHorizontalGroup(
            PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtTelefono)
                    .addComponent(txtCorreo)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormularioLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFormularioLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        PanelFormularioLayout.setVerticalGroup(
            PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormularioLayout.createSequentialGroup()
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormularioLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(6, 6, 6)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha))
                .addGap(18, 18, 18))
        );

        PanelTabla.setBackground(new java.awt.Color(17, 25, 31));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes Registrados");

        jScrollPane1.setBackground(new java.awt.Color(17, 25, 31));
        jScrollPane1.setForeground(new java.awt.Color(17, 25, 31));

        tablaClientes.setBackground(new java.awt.Color(17, 25, 31));
        tablaClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaClientes.setForeground(new java.awt.Color(255, 255, 255));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Teléfono", "Correo", "Fecha Registro"
            }
        ));
        tablaClientes.setRowHeight(28);
        tablaClientes.setSelectionBackground(new java.awt.Color(0, 122, 73));
        tablaClientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout PanelTablaLayout = new javax.swing.GroupLayout(PanelTabla);
        PanelTabla.setLayout(PanelTablaLayout);
        PanelTablaLayout.setHorizontalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(PanelTablaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelTablaLayout.setVerticalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(PanelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(PanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarEstiloTabla(){
        //para colores
       Color fondo = new Color(17,25,31);
       Color verde = new Color(0,122,73);
       Color texto = Color.WHITE;
       Color gris = new Color(43,58,66);
       
       //tabla
       
       tablaClientes.setBackground(fondo);
       tablaClientes.setForeground(texto);
       tablaClientes.setGridColor(gris);
       tablaClientes.setSelectionBackground(verde);
       tablaClientes.setSelectionForeground(texto);
       tablaClientes.setRowHeight(28);
       
       //encabezados de las columnas
       JTableHeader encabezado = tablaClientes.getTableHeader();
       
       encabezado.setBackground( new Color(24,33,39));
       encabezado.setForeground(texto);
       encabezado.setFont(new Font ("Arial", BOLD, 12));
       
       //panel que contiene la tabla
      JScrollPane scroll = (javax.swing.JScrollPane) javax.swing.SwingUtilities.getAncestorOfClass(javax.swing.JScrollPane.class,tablaClientes);
       
       if (scroll != null){
           scroll.getViewport().setBackground(fondo);
           scroll.setBackground(fondo);
           scroll.getViewport().setOpaque(true);
       }
       
       
        
        
        
        
    }
    
    
    
    
    
    public void actualizarTabla(){
        
        if (this.mirepo == null){
               System.out.println("Aviso: mirepo es null, saltando actualización.");
               return;
        }
        
    DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
    
    //borrar filas para que estan, para que no hayan repetidos
    int filas = modelo.getRowCount();
    
    for(int i= 0; i<filas; i++){
        modelo.removeRow(0);
    }
    
    /*recorrer el arreglo que esta en el repositorio
    y se agregan a la filas
    */
    
    for (int i=0; i<mirepo.numClientes; i++){
        Cliente c = mirepo.clientes[i];  
        Object[] fila = new Object[5];
        fila [0] = c.getCodigo();
        fila [1] = c.getNombre();
        fila [2] = c.getTelefono();
        fila [3] = c.getCorreo();
        fila [4] = c.getFechaRegistro();
        
        modelo.addRow(fila);
    }
}
    
    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = txtCodigo.getText().trim();
        modelo.Cliente c = mirepo.buscarClientePorCodigo(codigo);
        
        if(c != null){
            txtNombre.setText(c.getNombre());
            txtTelefono.setText(c.getTelefono());
            txtCorreo.setText(c.getCorreo());
            txtFecha.setText(c.getFechaRegistro());
        }else{
            JOptionPane.showMessageDialog(this, "No se encontro ningun cliente con ese codigo");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       String codigo = txtCodigo.getText().trim();
       String nombre = txtNombre.getText().trim();
       String tel = txtTelefono.getText().trim();
       String correo = txtCorreo.getText().trim();
       String fecha = txtFecha.getText().trim();
       
       if (codigo.isEmpty() || nombre.isBlank()){
           JOptionPane.showMessageDialog(this, "El código y el  nombre son obligatorios");
           return; 
       }
       
       //verificar si ya existe para actualizarlo o crear uno nuevo
       
       modelo.Cliente existente = mirepo.buscarClientePorCodigo(codigo);
       
       if (existente != null){
           //si exite se actualizan datos
           existente.setNombre(nombre);
           existente.setTelefono(tel);
           existente.setCorreo(correo);
           JOptionPane.showMessageDialog(this, "Cliente actualidado correctamente");    
       }else{
           //sino existe, se crea
           
           modelo.Cliente nuevo = new modelo.Cliente(codigo, nombre, tel, correo, fecha);
            if(mirepo.agregarCliente(nuevo)){
                JOptionPane.showMessageDialog(this, "Cliente Registrado con exito");
            }else{
                JOptionPane.showMessageDialog(this, "Se ha producido un error al registrar al cliente, arreglo lleno");
                
            }
       }
       
       //limpiar txtField
       txtCodigo.setText("");
       txtNombre.setText("");
       txtTelefono.setText("");
       txtCorreo.setText("");
       txtFecha.setText("");
       
       actualizarTabla();
   
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFormulario;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
