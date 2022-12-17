
package poo.javacomp.ventanas;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import poo.javacomp.logica.RecursosApp;
import poo.javacomp.logica.Venta;
import poo.javacomp.logica.Cliente;
import java.util.ListIterator;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import poo.javacomp.logica.ClienteEmpresa;
import poo.javacomp.logica.ClienteParticular;
import poo.javacomp.logica.Producto;

public class ConsultaVentas extends javax.swing.JFrame {
    private VentanaAdmin ventanaAdmin;
    private List<Venta> listaVentas;            //Referencia al ArrayList de ventas de la clase RecursosApp
    private List<Venta> ventasAux;              //Referencia a la List auxiliar de ventas de la clase RecursosApp
    private ListIterator<Venta> iterador;       //Iterador para recorrer el ArrayList
    private Venta objVenta;                     //Referencia a un objeto del tipo venta del ArrayList
    private List<Producto> compras;             //Referencia al ArrayList de compras de la clase venta
    
    /**
     * Creates new form ConsultaVentas
     * @param ventana
     */
    public ConsultaVentas(VentanaAdmin ventana) {
        initComponents();
        ventanaAdmin = ventana;
        ventanaAdmin.setVisible(false);
        jTextFieldDatosCliente1.setEditable(false);
        this.setVisible(true);
    }

    /** Consulta las ventas del ArrayList ordenados para su presentación */
    private void consultarTodo(List<Venta> ventas) {
        try {
            ventasAux = ventas;
            iterador = ventasAux.listIterator();
            if (ventasAux.size() < 1) {
                JOptionPane.showMessageDialog(this, "No hay ventas.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                jButtonSiguiente.setEnabled(false);
                jButtonAnterior.setEnabled(false);
                return;
            } else {
                jButtonSiguiente.setEnabled(true);
                jButtonAnterior.setEnabled(true);
            }
            if (iterador.hasNext()) {
                objVenta = iterador.next();
            }
            if (objVenta != null) {
                presenta(objVenta);
            } else {
                JOptionPane.showMessageDialog(this, "No hay ventas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.toString());
        }
    }//fin consultarTodo

    /** Presenta los datos de una venta */
    private void presenta(Venta v) {
        for (int cont = 0; cont < 30; cont++) {
                    jTableCompra.setValueAt("", cont, 0);
                    jTableCompra.setValueAt("", cont, 1);
                    jTableCompra.setValueAt("", cont, 2);
                    jTableCompra.setValueAt("", cont, 3);
                    jTableCompra.setValueAt("", cont, 4);
                    jTableCompra.setValueAt("", cont, 5);
                }
        
        compras = v.getProductosComprados();
        int tamaño = compras.size();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
        String f = formato.format(v.getFechaVenta());
        for (int cont = 0 ; cont < tamaño ; cont++){
            jTableCompra.setValueAt(f, cont, 0);
            jTableCompra.setValueAt(compras.get(cont).getStock(), cont, 1);
            jTableCompra.setValueAt(compras.get(cont).getTitulo(), cont, 2);
            jTableCompra.setValueAt(compras.get(cont).getCaracteristicas(), cont, 3);
            jTableCompra.setValueAt(compras.get(cont).getPrecio(), cont, 4);
            jTableCompra.setValueAt(compras.get(cont).getCategoria(), cont, 5);
        }
        
        Cliente cliente = v.getCliente();
        if (cliente.getClass().getSimpleName().equals("ClienteParticular")){
            ClienteParticular particular = (ClienteParticular) cliente;
            jTextFieldDatosCliente1.setText("Nombre: " + cliente.getNombre() + " - Correo: " + cliente.getCorreo() + " - DNI: " + particular.getDni());
        } else {
            ClienteEmpresa empresa = (ClienteEmpresa) cliente;
            jTextFieldDatosCliente1.setText("Nombre: " + cliente.getNombre() + " - Correo: " + cliente.getCorreo() + " - CIF: " + empresa.getCif() + " - WEB: " + empresa.getWeb());
        }
        jTextFieldDatosCliente2.setText("Dirección: " + cliente.getDireccion().getCalle() + " " + cliente.getDireccion().getNumero() + " " + cliente.getDireccion().getCiudad() + " " + cliente.getDireccion().getCodigoPostal() + " - TLF: " + cliente.getTelefono());
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCompra = new javax.swing.JTable();
        jTextFieldDatosCliente1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerFecha = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButtonAnterior = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jTextFieldDatosCliente2 = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setText("Consulta de Ventas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        jTableCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Cantidad", "Título", "Características", "Precio", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCompra.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableCompra);
        if (jTableCompra.getColumnModel().getColumnCount() > 0) {
            jTableCompra.getColumnModel().getColumn(0).setResizable(false);
            jTableCompra.getColumnModel().getColumn(1).setResizable(false);
            jTableCompra.getColumnModel().getColumn(2).setResizable(false);
            jTableCompra.getColumnModel().getColumn(3).setResizable(false);
            jTableCompra.getColumnModel().getColumn(4).setResizable(false);
            jTableCompra.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setText("Datos del cliente");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGORedimensionado.jpg"))); // NOI18N

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());
        jSpinnerFecha.setEditor(new javax.swing.JSpinner.DateEditor(jSpinnerFecha, "dd/MM/yy"));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setText("Búsqueda por fecha:");

        jButtonAnterior.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAnterior.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSiguiente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.setToolTipText("");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setText("Productos Comprados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldDatosCliente2)
                            .addComponent(jTextFieldDatosCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAnterior))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(jButtonSiguiente)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButtonSiguiente)
                    .addComponent(jButtonAnterior))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDatosCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDatosCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ANTERIOR
    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        if (iterador.hasPrevious()) {
            objVenta = iterador.previous();
            if (objVenta != null) {
                presenta(objVenta);
            } else {
                JOptionPane.showMessageDialog(this, "No hay ventas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    // POSTERIOR
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        // TODO add your handling code here:
        if (iterador.hasNext()) {
            objVenta = iterador.next();
            if (objVenta != null) {
                presenta(objVenta);
            } else {
                JOptionPane.showMessageDialog(this, "No hay ventas", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    // BUSCAR
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        listaVentas = RecursosApp.busquedaVentas((Date) jSpinnerFecha.getValue());
        consultarTodo(listaVentas);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        ventanaAdmin.setVisible(true);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JTable jTableCompra;
    private javax.swing.JTextField jTextFieldDatosCliente1;
    private javax.swing.JTextField jTextFieldDatosCliente2;
    // End of variables declaration//GEN-END:variables
}