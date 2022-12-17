
package poo.javacomp.logica;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Date;

public class RecursosApp {
    private static ArrayList<Producto> listaProductos = new ArrayList<>();
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Venta> listaVentas = new ArrayList<>();
    private static Producto objProducto;
    private static Boolean res;
    
    /** Establece el ArrayList de productos
     * @param producto */
    public static void setProductos(ArrayList<Producto> producto) {
        listaProductos = producto;
    }
    
    /**@return Devuelve el ArrayList de productos */
    public static ArrayList<Producto> getProductos() {
        Collections.sort(listaProductos, new Comparator<Producto>(){
            @Override
            public int compare(Producto p1, Producto p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }});
        return listaProductos;
    }
    
    /** Establece el ArrayList de clientes
     * @param cliente */
    public static void setClientes(ArrayList<Cliente> cliente) {
        listaClientes = cliente;
    }
    
    /**@return Devuelve el ArrayList de clientes */
    public static ArrayList<Cliente> getClientes() {
        Collections.sort(listaClientes, new Comparator<Cliente>(){
            @Override
            public int compare(Cliente c1, Cliente c2) {
                return c1.getNombre().compareTo(c2.getNombre());
            }});
        return listaClientes;
    }
    
    /** Establece el ArrayList de ventas
     * @param venta */
    public static void setVentas(ArrayList<Venta> venta) {
        listaVentas = venta;
    }
    
    /**@return Devuelve el ArrayList de ventas */
    public static ArrayList<Venta> getVentas() {
        Collections.sort(listaVentas, new Comparator<Venta>(){
            @Override
            public int compare(Venta v1, Venta v2) {
                return v1.getFechaVenta().compareTo(v2.getFechaVenta());
            }});
        return listaVentas;
    }
    
    /** Da de alta una Producto
     * @param objProducto
     * @return  */
    public static boolean altaProducto(Producto objProducto) {
        if (!listaProductos.contains(objProducto)) {
            listaProductos.add(objProducto);
            return true;
        } else {
            return false;
        }
    }
    
    /** Da de baja una Producto
     * @param objProducto
     * @return  */
    public static boolean bajaProducto(Producto objProducto) {
        if (listaProductos.contains(objProducto)) {
            listaProductos.remove(objProducto);
            return true;
        } else {
            return false;
        }
    }
    
    /** Da de alta una Cliente
     * @param objCliente
     * @return  */
    public static boolean altaCliente(Cliente objCliente) {
        if (!listaClientes.contains(objCliente)) {
            listaClientes.add(objCliente);
            return true;
        } else {
            return false;
        }

    }

    /** Dar de baja un Cliente
     * @param objCliente
     * @return  */
    public static boolean bajaCliente(Cliente objCliente) {
        if (listaClientes.contains(objCliente)) {
            listaClientes.remove(objCliente);
            return true;
        } else {
            return false;
        }

    }
    
    /** Crea una nueva Venta
     * @param objVenta
     * @return  */
    public static boolean nuevaVenta(Venta objVenta) {
        if (!listaVentas.contains(objVenta)) {
            listaVentas.add(objVenta);
            return true;
        } else {
            return false;
        }
    }
    
    /** Busca un producto con una categoria y palabras clave
     * @param categoria
     * @param palabrasClave
     * @return Deveulve la lista buscada */
    public static List<Producto> busquedaProductos(String categoria, String palabrasClave) {
        ArrayList<Producto> productosBuscados = new ArrayList<>();
        for (Producto p : listaProductos) {
                if ((p.getCategoria().equals(categoria) || categoria.equals("Todas las Categorías")) && (p.getTitulo().contains(palabrasClave) || p.getCaracteristicas().contains(palabrasClave) || palabrasClave.equals(""))) {
                    productosBuscados.add(p);
                }
        }
        return productosBuscados;
    }
    
    
    /** Ordena la lista de menor a mayor
     * @param listaProductos
     * @return Devuelve la lista ordenada
     */
    public static List<Producto> ordenarPorPrecio(List<Producto> listaProductos) {
        Collections.sort(listaProductos, new Comparator<Producto>(){
            @Override
            public int compare(Producto p1, Producto p2) {
                if (p1.getPrecio() < (p2.getPrecio())){
                    return -1;
                } else if (p1.getPrecio() > (p2.getPrecio())){
                    return 1;
                } else {
                    return 0;
                }
            }});
        return listaProductos;
    }
    
    /** Ordena la lista según la relevancia de sus opiniones
     * @param listaProductos
     * @return lista ordenada de mayor a menor relevancia
     */
    public static List<Producto> ordenarPorRelevancia(List<Producto> listaProductos){
        Collections.sort(listaProductos, new Comparator<Producto>() {
            @Override
            public int compare (Producto p1, Producto p2){
                int rev1 = 0, rev2 = 0, cont1 = 0, cont2 = 0;
                for (Opinion o : p1.getOpiniones()){
                    rev1 += o.getCalificacion();
                    cont1++ ;
                }
                for (Opinion o : p2.getOpiniones()){
                    rev2 += o.getCalificacion();
                    cont2++ ;
                }
                if ((rev1/cont1) > (rev2/cont2))
                    return -1;
                else if ((rev1/cont1) < (rev2/cont2)){
                    return 1;
                } else {
                    return 0;
                }
            }});
        return listaProductos;
    }
    
    /** Modifica los datos de un producto
     * @param p
     * @param p_caracteristicas
     * @param p_categoria
     * @param p_precio
     * @param p_stock
     * @param p_fecha
     * @return */
    public static boolean modificaProducto(Producto p, String p_caracteristicas, String p_categoria, double p_precio, int p_stock, LocalDate p_fecha) {
        if (p == null || !listaProductos.contains(p)) {
            return false;
        } else {        
        p.setCaracteristicas(p_caracteristicas);
        p.setCategoria(p_categoria);
        p.setPrecio(p_precio);
        p.setStock(p_stock);
        p.setFechaEntrada(p_fecha);
        }
            return true;
    }
    /** Modifica los datos de un cliente
     * @param c
     * @param c_nombre
     * @param c_correo
     * @param c_clave
     * @param c_direccion
     * @param c_tarjetaCredito
     * @param c_telefono
     * @param c_DniCif
     * @param c_Web
     * @return */
    public static boolean modificaCliente(Cliente c, String c_nombre, String c_correo, String c_clave, Direccion c_direccion, TarjetaCredito c_tarjetaCredito, long c_telefono, String c_DniCif, String c_Web) {
        if (c == null || !listaClientes.contains(c)) {
            return false;
        } else {
            c.setNombre(c_nombre);
            c.setCorreo(c_correo);
            c.setClave(c_clave);
            c.setDireccion(c_direccion);
            c.setTarjetaCredito(c_tarjetaCredito);
            c.setTelefono(c_telefono);
            if (c.getClass().getSimpleName().equals("ClienteParticular")) {
                ClienteParticular particular = (ClienteParticular) c;
                particular.setDni(c_DniCif);
            } else {
                ClienteEmpresa empresa = (ClienteEmpresa) c;
                empresa.setCif(c_DniCif);
                empresa.setWeb(c_Web);
            }
            return true;
        }
    }
    
    /** Busca ventas a partir de una fceha
     * @param fecha
     * @return lista de ventas a partir de esa fecha
     */
    public static List<Venta> busquedaVentas(Date fecha) {
        List<Venta> ventasBuscadas = new ArrayList<>();
        for (Venta v : listaVentas) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
            String f1 = formato.format(v.getFechaVenta());
            String f2 = formato.format(fecha);
                if (v.getFechaVenta().after(fecha) || f1.equals(f2)){
                    ventasBuscadas.add(v);
                }
        }
        return ventasBuscadas;
    }
    
    /** Consulta un producto por su titulo
     * @param titulo
     * @return el producto buscado
     */
    public static Producto consultaProductoPorTitulo(String titulo) {
        Comparator nombreComparador = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Producto p1 = (Producto) o1;
                Producto p2 = (Producto) o2;
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        };
        Collections.sort(listaProductos, nombreComparador);
        Producto p = new Producto();
        p.setTitulo(titulo);
        int pos = Collections.binarySearch(listaProductos, p, nombreComparador);
        if (pos >= 0) {
            objProducto = listaProductos.get(pos);
        } else {
            objProducto = null;
        }
        return objProducto;
    }
    
    /** Compara ventas sin tener en cuenta su stock y su precio
     * @param p1
     * @param p2
     * @return  */
    public static boolean equalsVenta(Producto p1, Producto p2) {
            if (p1 == null || p2 == null || p1.getClass() != p2.getClass() || !p1.getTitulo().equals(p2.getTitulo()) ||
                   !p1.getCaracteristicas().equals(p2.getCaracteristicas()) || !p1.getCategoria().equals(p2.getCategoria()) ||
                   !p1.getNombreImagen().equals(p2.getNombreImagen()) || !p1.getFechaEntrada().equals(p2.getFechaEntrada()) ) {
                res = false;
            } else {
                res = true;
            }
        return res;    
    } 
   
   
    /** Carga los datos de los productos en un fichero */
    public static void cargarDatosProductos() {
        try {
            FileInputStream istreampro = new FileInputStream("copiaProductos.dat");
            ObjectInputStream oispro = new ObjectInputStream(istreampro);
            listaProductos = (ArrayList) oispro.readObject();
            istreampro.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }   
    }
    
    /** Guarda los datos de los productos en un fichero */
    public static void guardarDatosProductos() {
        try {
            if (!listaProductos.isEmpty()) {
                try (FileOutputStream ostreampro = new FileOutputStream("copiaProductos.dat")) {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(listaProductos);
                    ostreampro.close();
                }
            } else {
                System.out.println("Error: No hay datos...");
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /** Carga los datos de los clientes en un fichero */
    public static void cargarDatosClientes() {
        try {
            FileInputStream istreampro = new FileInputStream("copiaClientes.dat");
            ObjectInputStream oispro = new ObjectInputStream(istreampro);
            listaClientes = (ArrayList) oispro.readObject();
            istreampro.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }   
    }
    
    /** Guarda los datos de los clientes en un fichero */
    public static void guardarDatosClientes() {
        try {
            if (!listaClientes.isEmpty()) {
                try (FileOutputStream ostreampro = new FileOutputStream("copiaClientes.dat")) {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(listaClientes);
                    ostreampro.close();
                }
            } else {
                System.out.println("Error: No hay datos...");
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /** Carga los datos de las ventas en un fichero */
    public static void cargarDatosVentas() {
        try {
            FileInputStream istreampro = new FileInputStream("copiaVentas.dat");
            ObjectInputStream oispro = new ObjectInputStream(istreampro);
            listaVentas = (ArrayList) oispro.readObject();
            istreampro.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }   
    }
    
    /** Guarda los datos de las ventas en un fichero */
    public static void guardarDatosVentas() {
        try {
            if (!listaVentas.isEmpty()) {
                try (FileOutputStream ostreampro = new FileOutputStream("copiaVentas.dat")) {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(listaVentas);
                    ostreampro.close();
                }
            } else {
                System.out.println("Error: No hay datos...");
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /** Crea un fichero de texto con los datos de la compra y el cliente
     * @param compras
     * @param cliente
     * @throws java.io.IOException */
    public static void generaFactura(List<Producto> compras, Cliente cliente) throws IOException {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");        
        String fecha = hoy.format(formatoCorto);        
        String rutaFicheroFactura = "./Facturas/Factura(" + fecha.replace('/', '_') + cliente.getNombre() +").txt";
        
        int importeTotal = 5;
        for (Producto p : compras){
            importeTotal += p.getPrecio();
        }
                
        try {
            File dirFacturas = new File("./Facturas");

            if (!dirFacturas.exists()) {
                dirFacturas.mkdir();
            }

            FileWriter fw = new FileWriter(rutaFicheroFactura);
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {
                salida.println("-------------------------------- FACTURA DE COMPRA --------------------------------");
                salida.println("\n");
                salida.println("\n");
                salida.println("Fecha de venta: " + fecha );
                salida.println("\n");
                salida.println("Datos del Cliente: ");
                if (cliente.getClass().getSimpleName().equals("Cliente Particular")){
                    salida.println("Tipo de Cliente: Particular");
                } else {
                    salida.println("Tipo de Cliente: Empresa");
                }
                salida.println("Nombre:" + cliente.getNombre());
                salida.println("Correo:" + cliente.getCorreo());
                salida.println("Direccion:" + cliente.getDireccion().getCalle() + " " + cliente.getDireccion().getNumero() + " " + cliente.getDireccion().getCalle() + " " + cliente.getDireccion().getCodigoPostal());
                salida.println("Tarjeta de Crédito:" + cliente.getTarjetaCredito().getNombreTitular() + " " + cliente.getTarjetaCredito().getNumero() + " " + cliente.getTarjetaCredito().getFechaCaducidad());
                salida.println("Teléfono:" + cliente.getTelefono());
                salida.println("\n");
                
                for (Producto p : compras){
                    salida.println("Tipo: " + p.getTitulo());
                    salida.println("Caracteristicas: " + p.getCaracteristicas());
                    salida.println("Categoria: " + p.getCategoria());
                    salida.println("Cantidad: " + p.getStock());
                    salida.println("Precio: " + p.getPrecio());
                    salida.println("\n");
                }
                salida.println("\n");
                salida.println("\n");
                salida.println("Gastos de envio: 5€");
                salida.println("-----------------------------------------------------------------------------------");
                salida.println("IMPORTE TOTAL: " + importeTotal);
                salida.println("\n");
                salida.println("-----------------------------------------------------------------------------------");
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
}
