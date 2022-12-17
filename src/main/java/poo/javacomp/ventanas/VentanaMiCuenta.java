
package poo.javacomp.ventanas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import poo.javacomp.logica.Cliente;
import poo.javacomp.logica.RecursosApp;
import poo.javacomp.logica.Direccion;
import poo.javacomp.logica.TarjetaCredito;
import poo.javacomp.logica.ClienteParticular;
import poo.javacomp.logica.ClienteEmpresa;

public class VentanaMiCuenta extends javax.swing.JFrame {
    private VentanaCliente ventanaCliente;
    private VentanaPrincipal ventanaPrincipal;
    private Cliente objCliente = RecursosApp.getClientes().get(VentanaInicioSesion.getPosicion());  // Referencia al cliente que ha iniciado sesion

    /**
     * Creates new form VentanaMiCuenta
     * @param ventana
     */
    public VentanaMiCuenta(VentanaCliente ventana) {
        ventanaCliente = ventana;
        ventanaCliente.setVisible(false);
        initComponents();
        presenta(objCliente);
        this.setVisible(true);
    }

    /** Presenta los datos del cliente en el panel de datos */
    private void presenta(Cliente c) {
        panelUsuarios.setJTextFieldNombre(c.getNombre());
        panelUsuarios.setJTextFieldCorreo(c.getCorreo());
        panelUsuarios.setJTextFieldClave(c.getClave());
        panelUsuarios.setJTextFieldCalle(c.getDireccion().getCalle());
        panelUsuarios.setJFormattedTextFieldDireccionNumero(c.getDireccion().getNumero() + "");
        panelUsuarios.setJFormattedTextFieldCodigoPostal(c.getDireccion().getCodigoPostal() + "");
        panelUsuarios.setJTextFieldCiudad(c.getDireccion().getCiudad());
        panelUsuarios.setJTextFieldTarjetaNombre(c.getTarjetaCredito().getNombreTitular());
        panelUsuarios.setJFormattedTextFieldTarjetaNumero(c.getTarjetaCredito().getNumero() + "");
        
        SimpleDateFormat formato = new SimpleDateFormat("MM/yy");  
        String fecha = formato.format(c.getTarjetaCredito().getFechaCaducidad());
        panelUsuarios.setJFormattedTextFieldTarjetaFecha(fecha);
        
        panelUsuarios.setJFormattedTextFieldTelefono(c.getTelefono() + "");
        
        if (c.getClass().getSimpleName().equals("ClienteParticular")){
            ClienteParticular particular = (ClienteParticular) c;
            panelUsuarios.setJLabelDniCif("DNI:");
            panelUsuarios.setJTextFieldDniCif(particular.getDni());
            panelUsuarios.setEditableJTextFieldWeb(false);
            jLabelTipo.setText("Particular");
        } else {
            ClienteEmpresa empresa = (ClienteEmpresa) c;
            panelUsuarios.setJLabelDniCif("CIF:");
            panelUsuarios.setJTextFieldDniCif(empresa.getCif());
            panelUsuarios.setEditableJTextFieldWeb(true);
            panelUsuarios.setJTextFieldWeb(empresa.getWeb());
            jLabelTipo.setText("Empresa");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        panelUsuarios = new poo.javacomp.ventanas.PanelUsuarios();
        jLabel2 = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(panelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 390, 400));

        jLabel2.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de Cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jButtonModificar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setText("Mi Cuenta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addGap(0, 165, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGORedimensionado.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 50, 50));

        jLabelTipo.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jPanel1.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 160, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        jButton1.setText("BAJA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // MODIFICAR
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        try {
            Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            
            String web;
            String nombre = panelUsuarios.getJTextFieldNombre();
            
            String correo = panelUsuarios.getJTextFieldCorreo();
            Matcher matcher = pattern.matcher(correo);
            
            String clave = panelUsuarios.getJTextFieldClave();
            
            String calle = panelUsuarios.getJTextFieldCalle();
            int numero = Integer.parseInt(panelUsuarios.getJFormattedTextFieldDireccionNumero());
            int codigoPostal = Integer.parseInt(panelUsuarios.getJFormattedTextFieldCodigoPostal());
            String ciudad = panelUsuarios.getJTextFieldCiudad();
            Direccion direccion = new Direccion(calle, numero, codigoPostal, ciudad);
                    
            String nombreTarjeta = panelUsuarios.getJTextFieldTarjetaNombre();
            long numTarjeta = Long.parseLong(panelUsuarios.getJFormattedTextFieldTarjetaNumero());
            SimpleDateFormat formato = new SimpleDateFormat("MM/yy");
            Date hoy = new Date();
            Date fechaTarjeta = formato.parse(panelUsuarios.getJFormattedTextFieldTarjetaFecha());
            TarjetaCredito tarjetaCredito = new TarjetaCredito(nombreTarjeta, numTarjeta, fechaTarjeta);
            
            long telefono = Long.parseLong(panelUsuarios.getJFormattedTextFieldTelefono());
            if (jLabelTipo.getText().equals("Particular")){
                web = "";
            } else {
                web = panelUsuarios.getJTextFieldWeb();
            }
            String dniCif = panelUsuarios.getJTextFieldDniCif();
            
            if (fechaTarjeta.after(hoy)){
                if (panelUsuarios.getJFormattedTextFieldTarjetaNumero().length() == 16){
                    if (matcher.find()) {
                        if (jLabelTipo.getText().equals("Particular")){
                            if (RecursosApp.modificaCliente(objCliente, nombre, correo, clave, direccion, tarjetaCredito, telefono, dniCif, web)) {
                                JOptionPane.showMessageDialog(this, "Datos modificados", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(this, "Datos no modificados", "Mensaje", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            if (web.equals("")){
                                JOptionPane.showMessageDialog(this, "Introduzca una web válida", "Mensaje", JOptionPane.ERROR_MESSAGE);
                            } else {
                                if (RecursosApp.modificaCliente(objCliente, nombre, correo, clave, direccion, tarjetaCredito, telefono, dniCif, web)) {
                                    JOptionPane.showMessageDialog(this, "Datos modificados", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(this, "Datos no modificados", "Mensaje", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Introduzca un correo válido", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Introduzca un número de tarjeta de 16 cifras", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe introducir una tarjeta no caducada", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar: " + e.toString(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        ventanaCliente.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(RecursosApp.bajaCliente(objCliente)){
            JOptionPane.showMessageDialog(this, "Cliente dado de baja", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            RecursosApp.guardarDatosClientes();
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al dar de baja" , "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private poo.javacomp.ventanas.PanelUsuarios panelUsuarios;
    // End of variables declaration//GEN-END:variables
}