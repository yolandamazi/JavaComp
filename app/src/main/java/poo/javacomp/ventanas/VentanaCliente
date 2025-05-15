
package poo.javacomp.ventanas;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Date;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import poo.javacomp.logica.Producto;
import poo.javacomp.logica.RecursosApp;
import poo.javacomp.logica.Cliente;
import poo.javacomp.logica.Venta;
import java.util.Collections;
import poo.javacomp.logica.Opinion;
import static poo.javacomp.logica.RecursosApp.nuevaVenta;

public class VentanaCliente extends javax.swing.JFrame {
    private VentanaInicioSesion inicioSesion;
    private VentanaMiCuenta miCuenta;
    private List<Producto> busquedasAnt = new ArrayList<>();    //Referencia a la List de productos buscados anteriormente
    private List<Producto> productosAux;                        //Referencia una List auxiliar de productos de la clase RecursosApp
    private ListIterator<Producto> iterador;                    //Iterador para recorrer el ArrayList de prosuctos
    private Producto objProducto, copiaProducto;                //Referencia a un objeto del tipo producto
    private List<Producto> busquedas = null;                    //Referencia a la List de productos buscados
    private List<Producto> compras = new ArrayList<>();         //Referencia a la List de productos añadidos al carrito
    private List<Producto> copiaCompras = new ArrayList<>();    //Copia del List compras
    private ArrayList<Producto> comprasAux = new ArrayList<>(); //Referencia al ArrayList de compras realizadas
    private Cliente objCliente;                                 //Referencia a un objeto del tipo cliente 
    private ArrayList<Producto> listaProductos;                 //Referencia el ArrayList de productos de la clase RecursosApp
    private Boolean compraRealizada = false;                    //Referencia la variable que indica si se ha realizado la compra o no
    
    /**
     * Creates new form VentanaCliente
     * @param ventana
     */
    public VentanaCliente(VentanaInicioSesion ventana) {
        inicioSesion = ventana;
        inicioSesion.setVisible(false);
        initComponents();
        panelProductos.desactivaTodo();
        this.setVisible(true);
    }
    
    /** Presenta los datos de un producto en el panel de datos */
    private void presenta(Producto p) {
        panelProductos.setJTextFieldTitulo(p.getTitulo());
        panelProductos.setJTextFieldCaracteristicas(p.getCaracteristicas());
        panelProductos.setJComboBoxCategoria(p.getCategoria());
        panelProductos.setJFormattedTextFieldPrecio(p.getPrecio() + "");
        panelProductos.setJFormattedTextFieldStock(p.getStock() + "");
        panelProductos.setJFormattedTextFieldFecha(p.getFechaEntrada() + "");
        String imagentxt = panelProductos.getJTextFieldTitulo().replace(" ", "");
        ImageIcon imagen = new ImageIcon("./imagenes/" + imagentxt);
        ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(jLabelImagen.getWidth(), jLabelImagen.getHeight(), 1));
        jLabelImagen.setIcon(imgRedimensionada);
    }
    
    /** Limpia el panel de datos */
    private void limpiarTodo(List<Producto> busquedasAnt) {
        panelProductos.setJTextFieldTitulo(null);
        panelProductos.setJTextFieldCaracteristicas(null);
        panelProductos.setJComboBoxCategoria(null);
        panelProductos.setJFormattedTextFieldPrecio(null);
        panelProductos.setJFormattedTextFieldStock(null);
        panelProductos.setJFormattedTextFieldFecha(null);
    }
    
    /** Consulta los productos del ArrayList ordenados para su presentación */
    private void consultarTodo(List<Producto> busquedas) {
        try {
            productosAux = busquedas;
            iterador = productosAux.listIterator();
            if (productosAux.size() < 1) {
                JOptionPane.showMessageDialog(this, "No hay productos.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                jButtonSiguiente.setEnabled(false);
                jButtonAnterior.setEnabled(false);
                return;
            } else {
                jButtonSiguiente.setEnabled(true);
                jButtonAnterior.setEnabled(true);
            }
            if (iterador.hasNext()) {
                objProducto = iterador.next();
            }
            if (objProducto != null) {
                presenta(objProducto);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.toString());
        }
    } // fin ConsultaTodo
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSegun = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCompra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonSiguiente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarrito = new javax.swing.JTable();
        jRadioButtonRelevancia = new javax.swing.JRadioButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonCarrito = new javax.swing.JButton();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jRadioButtonPrecioM = new javax.swing.JRadioButton();
        jTextFieldPalabrasClave = new javax.swing.JTextField();
        jRadioButtonPreciom = new javax.swing.JRadioButton();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jButtonBuscar = new javax.swing.JButton();
        jLabelImagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonCuenta = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        panelProductos = new poo.javacomp.ventanas.PanelProductos();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldComentario = new javax.swing.JTextField();
        jButtonOpinion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldCalificacion = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad:");

        jButtonCompra.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCompra.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonCompra.setText("Comprar");
        jButtonCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setText("Carrito de Compra");

        jButtonSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSiguiente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jTableCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Caracteristicas", "Categoria", "Precio", "Cantidad", "Confirmar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCarrito.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableCarrito);
        if (jTableCarrito.getColumnModel().getColumnCount() > 0) {
            jTableCarrito.getColumnModel().getColumn(0).setResizable(false);
            jTableCarrito.getColumnModel().getColumn(1).setResizable(false);
            jTableCarrito.getColumnModel().getColumn(2).setResizable(false);
            jTableCarrito.getColumnModel().getColumn(3).setResizable(false);
            jTableCarrito.getColumnModel().getColumn(4).setResizable(false);
            jTableCarrito.getColumnModel().getColumn(5).setResizable(false);
        }

        jRadioButtonRelevancia.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupSegun.add(jRadioButtonRelevancia);
        jRadioButtonRelevancia.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jRadioButtonRelevancia.setText("Por Relevancia");

        jButtonAnterior.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAnterior.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonCarrito.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCarrito.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonCarrito.setText("Añadir al Carrito");
        jButtonCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarritoActionPerformed(evt);
            }
        });

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas las Categorías", "Componentes", "Ordenadores", "Móviles y Telefonía", "TV Audio y Foto", "Consolas y Videojuegos" }));

        jRadioButtonPrecioM.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupSegun.add(jRadioButtonPrecioM);
        jRadioButtonPrecioM.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jRadioButtonPrecioM.setText("Por Precio Mayor");

        jRadioButtonPreciom.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupSegun.add(jRadioButtonPreciom);
        jRadioButtonPreciom.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jRadioButtonPreciom.setText("Por Precio Menor");

        jButtonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jButtonCuenta.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCuenta.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonCuenta.setText("MI CUENTA\n");
        jButtonCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuentaActionPerformed(evt);
            }
        });

        jButtonCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCerrarSesion.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonCerrarSesion.setText("CERRAR SESIÓN");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addComponent(jButtonCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCerrarSesion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCuenta)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        jLabel4.setFont(new java.awt.Font("Arial Nova", 1, 14)); // NOI18N
        jLabel4.setText("Deja tu opinion del producto:");

        jButtonOpinion.setBackground(new java.awt.Color(255, 255, 255));
        jButtonOpinion.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonOpinion.setText("Opinar");
        jButtonOpinion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpinionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Comentario:");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setText("Calificación");

        jFormattedTextFieldCalificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jFormattedTextFieldCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldComentario)
                .addGap(18, 18, 18)
                .addComponent(jButtonOpinion)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jFormattedTextFieldCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonOpinion))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel1.setText("Búsqueda de Productos");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGORedimensionado.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPalabrasClave, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonPrecioM)
                                    .addComponent(jRadioButtonRelevancia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonPreciom)
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jButtonAnterior))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonSiguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCompra)
                                .addGap(47, 47, 47))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonPrecioM)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSiguiente)
                        .addComponent(jButtonAnterior)
                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonPreciom)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldPalabrasClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCarrito)
                        .addComponent(jButtonBuscar))
                    .addComponent(jRadioButtonRelevancia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );

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

    // BUSCAR
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            limpiarTodo(busquedasAnt);
            List<Producto> listaProductos = RecursosApp.busquedaProductos((String) jComboBoxCategoria.getSelectedItem(), jTextFieldPalabrasClave.getText());
            if (jRadioButtonPrecioM.isSelected()){
                busquedas = RecursosApp.ordenarPorPrecio(listaProductos);
                Collections.reverse(busquedas);
            } else if (jRadioButtonPreciom.isSelected()){
                busquedas = RecursosApp.ordenarPorPrecio(listaProductos);
            } else if (jRadioButtonRelevancia.isSelected()){
                busquedas = RecursosApp.ordenarPorRelevancia(listaProductos);
            } else {
                JOptionPane.showMessageDialog(this, "Elija un opción de ordenación", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
            consultarTodo(busquedas);
            busquedasAnt = busquedas;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Rellene todos los campos de busqueda", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    // SIGUIENTE
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        // TODO add your handling code here:
        if (iterador.hasNext()) {
            objProducto = iterador.next();
            if (objProducto != null) {
                presenta(objProducto);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    // ANTERIOR
    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        if (iterador.hasPrevious()) {
            objProducto = iterador.previous();
            if (objProducto != null) {
                presenta(objProducto);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    // CERRAR SESION Y REPONER EL STOCK EN CASO DE NO REALIZAR LA COMPRA
    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        if (compras.size() != 0){
            for (Producto c : compras){
                    listaProductos = RecursosApp.getProductos();
                    for (Producto p : listaProductos){
                        if (RecursosApp.equalsVenta(c, p)){
                            int cantidadCompra = c.getStock();
                            int cantidadDisponible = p.getStock();
                            p.setStock(cantidadDisponible + cantidadCompra);
                        }
                    } 
            }
        }
        this.setVisible(false);
        inicioSesion.setVisible(true);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    // CARRITO DE COMPRA
    private void jButtonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarritoActionPerformed
        try {
            int cantidad = (Integer) jSpinnerCantidad.getValue();
            int stock = objProducto.getStock();
            int contador = 0;
            double precio;
            
            if (cantidad < 0) {
                JOptionPane.showMessageDialog(this, "No introduzca valores negativos.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            } else if (stock >= cantidad) {
                
                objProducto.setStock(stock - cantidad);
                precio = cantidad * objProducto.getPrecio();
                presenta(objProducto);
                
                copiaProducto = new Producto (objProducto.getTitulo(), objProducto.getCaracteristicas(), objProducto.getCategoria(), precio, objProducto.getNombreImagen(), cantidad, objProducto.getFechaEntrada(), objProducto.getOpiniones());
                
                if (compras.size() >= 1){
                    for (Producto p : compras){
                        if (RecursosApp.equalsVenta(copiaProducto, p)) {
                            p.setStock(p.getStock() + copiaProducto.getStock());
                            p.setPrecio(p.getPrecio() + copiaProducto.getPrecio());
                        } else {
                            compras.add(copiaProducto);
                            copiaCompras.add(copiaProducto);
                            break;
                        }
                    }
                } else {
                    compras.add(copiaProducto);
                    copiaCompras.add(copiaProducto);
                }
                
                for (Producto p: compras) {
                    jTableCarrito.setValueAt(p.getTitulo(), contador, 0);
                    jTableCarrito.setValueAt(p.getCaracteristicas(), contador, 1);
                    jTableCarrito.setValueAt(p.getCategoria(), contador, 2);
                    jTableCarrito.setValueAt(p.getPrecio(), contador, 3);
                    jTableCarrito.setValueAt(p.getStock(), contador, 4);
                    jTableCarrito.setValueAt(true, contador, 5);
                    contador++;
                }
                JOptionPane.showMessageDialog(this, "Se ha añadido al carrito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);  
                
            } else {
                JOptionPane.showMessageDialog(this, "No hay suficiente stock.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al añadir al carrito." , "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCarritoActionPerformed

    // AÑADIR OPINIONES
    private void jButtonOpinionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpinionActionPerformed
        // TODO add your handling code here:
        int calificacion = Integer.parseInt(jFormattedTextFieldCalificacion.getText());
        String comentario = jTextFieldComentario.getText();
        Opinion opinion;
        LocalDate fecha = LocalDate.now();
        ArrayList<Opinion> opiniones;
        
        if (0 < calificacion && calificacion < 6) {
            opiniones = objProducto.getOpiniones();
            opinion = new Opinion(calificacion, comentario, fecha);
            opiniones.add(opinion);
            JOptionPane.showMessageDialog(this, "Su opinión ha sido realizada", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Debe introducir una calificacion entre 1 y 5", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonOpinionActionPerformed

    // ABRIR Y VER MI CUENTA
    private void jButtonCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuentaActionPerformed
        // TODO add your handling code here:
        VentanaMiCuenta miCuenta = new VentanaMiCuenta(this);
    }//GEN-LAST:event_jButtonCuentaActionPerformed

    // COMPRAR
    private void jButtonCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompraActionPerformed
        // TODO add your handling code here:
        try {
            int tamaño = compras.size();
            Date fechaVenta = new Date();
            objCliente = RecursosApp.getClientes().get(VentanaInicioSesion.getPosicion());
            
            listaProductos = RecursosApp.getProductos();
            for (Producto pro : listaProductos){
                int contador = 0;
                for (Producto c : compras){
                    int cantidadCompra = c.getStock();
                    int cantidadDisponible = pro.getStock();
                    if ((Boolean) jTableCarrito.getValueAt(contador, 5)==true){
                            compraRealizada = true;
                    } else {
                        copiaCompras.remove(c);
                        if (RecursosApp.equalsVenta(c, pro)){
                            pro.setStock(cantidadDisponible + cantidadCompra);
                        }
                    }
                contador++ ;
                }
            }
            
            for(int cont = 0; cont < copiaCompras.size(); cont++){
                comprasAux.add(compras.get(cont));
            }
            
            if (compraRealizada){
                Venta venta = new Venta(fechaVenta, objCliente, comprasAux);
                nuevaVenta(venta);
                JOptionPane.showMessageDialog(this, "Se ha realizado su compra con 5€ de gastos de envío incluidos - Consulte su factura.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                RecursosApp.generaFactura(comprasAux, objCliente);
                for (int cont = 0; cont < tamaño; cont++) {
                    jTableCarrito.setValueAt("", cont, 0);
                    jTableCarrito.setValueAt("", cont, 1);
                    jTableCarrito.setValueAt("", cont, 2);
                    jTableCarrito.setValueAt("", cont, 3);
                    jTableCarrito.setValueAt("", cont, 4);
                    jTableCarrito.setValueAt(false, cont, 5);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No ha comprado ningún producto", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ioe){
            JOptionPane.showMessageDialog(this, "Error al comprar.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        compras.clear();
        copiaCompras.clear();
    }//GEN-LAST:event_jButtonCompraActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        if (compras.size() != 0){
            for (Producto c : compras){
                    listaProductos = RecursosApp.getProductos();
                    for (Producto p : listaProductos){
                        if (RecursosApp.equalsVenta(c, p)){
                            int cantidadCompra = c.getStock();
                            int cantidadDisponible = p.getStock();
                            p.setStock(cantidadDisponible + cantidadCompra);
                        }
                    } 
            }
        }
        inicioSesion.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSegun;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCarrito;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonCompra;
    private javax.swing.JButton jButtonCuenta;
    private javax.swing.JButton jButtonOpinion;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JFormattedTextField jFormattedTextFieldCalificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonPrecioM;
    private javax.swing.JRadioButton jRadioButtonPreciom;
    private javax.swing.JRadioButton jRadioButtonRelevancia;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTableCarrito;
    private javax.swing.JTextField jTextFieldComentario;
    private javax.swing.JTextField jTextFieldPalabrasClave;
    private poo.javacomp.ventanas.PanelProductos panelProductos;
    // End of variables declaration//GEN-END:variables
}
