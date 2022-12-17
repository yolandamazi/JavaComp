
package poo.javacomp.ventanas;

public class PanelUsuarios extends javax.swing.JPanel {

    /** Creates new form PanelUsuarios */
    public PanelUsuarios() {
        initComponents();
    }

    // Métodos para devolver y presentar el contenido de los campos del formulario
    public String getJTextFieldDniCif() {
        return jTextFieldDniCif.getText();
    }

    public void setJTextFieldDniCif(String txt) {
        this.jTextFieldDniCif.setText(txt);
    }

    public String getJTextFieldNombre() {
        return jTextFieldNombre.getText();
    }

    public void setJTextFieldNombre(String txt) {
        this.jTextFieldNombre.setText(txt);
    }

    public String getJTextFieldCorreo() {
        return jTextFieldCorreo.getText();
    }

    public void setJTextFieldCorreo(String txt) {
        this.jTextFieldCorreo.setText(txt);
    }

    public String getJTextFieldCalle() {
        return jTextFieldCalle.getText();
    }

    public void setJTextFieldCalle(String txt) {
        this.jTextFieldCalle.setText(txt);
    }

    public String getJFormattedTextFieldCodigoPostal() {
        return jFormattedTextFieldCodigoPostal.getText();
    }

    public void setJFormattedTextFieldCodigoPostal(String txt) {
        this.jFormattedTextFieldCodigoPostal.setText(txt);
    }

    public String getJFormattedTextFieldDireccionNumero() {
        return jFormattedTextFieldDireccionNumero.getText();
    }

    public void setJFormattedTextFieldDireccionNumero(String txt) {
        this.jFormattedTextFieldDireccionNumero.setText(txt);
    }

    public String getJFormattedTextFieldTarjetaFecha() {
        return (String) jFormattedTextFieldTarjetaFecha.getText();
    }

    public void setJFormattedTextFieldTarjetaFecha(String txt) {
        this.jFormattedTextFieldTarjetaFecha.setText(txt);
    }

    public String getJFormattedTextFieldTarjetaNumero() {
        return jFormattedTextFieldTarjetaNumero.getText();
    }

    public void setJFormattedTextFieldTarjetaNumero(String txt) {
        this.jFormattedTextFieldTarjetaNumero.setText(txt);
    }

    public String getJFormattedTextFieldTelefono() {
        return jFormattedTextFieldTelefono.getText();
    }

    public void setJFormattedTextFieldTelefono(String txt) {
        this.jFormattedTextFieldTelefono.setText(txt);
    }

    public String getJTextFieldCiudad() {
        return jTextFieldCiudad.getText();
    }

    public void setJTextFieldCiudad(String txt) {
        this.jTextFieldCiudad.setText(txt);
    }

    public String getJTextFieldClave() {
        return jTextFieldClave.getText();
    }

    public void setJTextFieldClave(String txt) {
        this.jTextFieldClave.setText(txt);
    }

    public String getJTextFieldTarjetaNombre() {
        return jTextFieldTarjetaNombre.getText();
    }

    public void setJTextFieldTarjetaNombre(String txt) {
        this.jTextFieldTarjetaNombre.setText(txt);
    }

    public String getJTextFieldWeb() {
        return jTextFieldWeb.getText();
    }

    public void setJTextFieldWeb(String txt) {
        this.jTextFieldWeb.setText(txt);
    }
    
    public void setEditableJTextFieldWeb(Boolean txt){
        this.jTextFieldWeb.setEditable(txt);
    }
    public void setJLabelDniCif(String txt){
        this.jLabelDniCif.setText(txt);
    }
    
    //Activa todo
    public void activaTodo() {
        this.jTextFieldNombre.setEditable(true);
        this.jTextFieldDniCif.setEditable(true);
        this.jTextFieldCorreo.setEditable(true);
        this.jTextFieldClave.setEditable(true);
        this.jTextFieldCalle.setEditable(true);
        this.jFormattedTextFieldDireccionNumero.setEditable(true);
        this.jFormattedTextFieldCodigoPostal.setEditable(true);
        this.jTextFieldCiudad.setEditable(true);
        this.jTextFieldTarjetaNombre.setEditable(true);
        this.jFormattedTextFieldTarjetaFecha.setEditable(true);
        this.jFormattedTextFieldTarjetaNumero.setEditable(true);
        this.jFormattedTextFieldTelefono.setEditable(true);
        this.jTextFieldWeb.setEditable(true);
    }
    //Desactiva Todo
    public void desactivaTodo(){
        this.jTextFieldNombre.setEditable(false);
        this.jTextFieldDniCif.setEditable(false);
        this.jTextFieldCorreo.setEditable(false);
        this.jTextFieldClave.setEditable(false);
        this.jTextFieldCalle.setEditable(false);
        this.jFormattedTextFieldDireccionNumero.setEditable(false);
        this.jFormattedTextFieldCodigoPostal.setEditable(false);
        this.jTextFieldCiudad.setEditable(false);
        this.jTextFieldTarjetaNombre.setEditable(false);
        this.jFormattedTextFieldTarjetaFecha.setEditable(false);
        this.jFormattedTextFieldTarjetaNumero.setEditable(false);
        this.jFormattedTextFieldTelefono.setEditable(false);
        this.jTextFieldWeb.setEditable(false);
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
        jTextFieldCalle = new javax.swing.JTextField();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();
        jTextFieldWeb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldTarjetaNumero = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTarjetaFecha = new javax.swing.JFormattedTextField();
        jTextFieldTarjetaNombre = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jFormattedTextFieldCodigoPostal = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDireccionNumero = new javax.swing.JFormattedTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelDniCif = new javax.swing.JLabel();
        jTextFieldDniCif = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldCalle.setText("Calle");

        jFormattedTextFieldTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel8.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel8.setText("Web:");

        jLabel7.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel7.setText("Teléfono:");

        jFormattedTextFieldTarjetaNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldTarjetaNumero.setText("Numero");

        jFormattedTextFieldTarjetaFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/yy"))));
        jFormattedTextFieldTarjetaFecha.setText("Fecha");

        jTextFieldTarjetaNombre.setText("Nombre");

        jTextFieldCiudad.setText("Ciudad");

        jFormattedTextFieldCodigoPostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldCodigoPostal.setText("Codigo Postal");

        jFormattedTextFieldDireccionNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldDireccionNumero.setText("N");

        jLabel3.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel3.setText("Correo:");

        jLabel5.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel5.setText("Dirección:");

        jLabel6.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel6.setText("Tarjeta de Crédito:");

        jLabel2.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabel4.setText("Clave:");

        jLabelDniCif.setFont(new java.awt.Font("Arial Nova", 0, 14)); // NOI18N
        jLabelDniCif.setText("CIF/DNI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCalle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFormattedTextFieldDireccionNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldClave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jTextFieldTarjetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextFieldTarjetaFecha))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabelDniCif))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDniCif, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jTextFieldCorreo)
                            .addComponent(jTextFieldNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldTarjetaNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDniCif)
                    .addComponent(jTextFieldDniCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldDireccionNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jFormattedTextFieldTarjetaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldTarjetaNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldTarjetaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldCodigoPostal;
    private javax.swing.JFormattedTextField jFormattedTextFieldDireccionNumero;
    private javax.swing.JFormattedTextField jFormattedTextFieldTarjetaFecha;
    private javax.swing.JFormattedTextField jFormattedTextFieldTarjetaNumero;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDniCif;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDniCif;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTarjetaNombre;
    private javax.swing.JTextField jTextFieldWeb;
    // End of variables declaration//GEN-END:variables
}
