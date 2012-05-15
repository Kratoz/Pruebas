/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos.datos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import negocios.objetosNegocio.Libro;
import negocios.objetosNegocio.Pedido;
import negocios.objetosNegocio.Proveedor;

/**
 * DatosPedido clase de donde se obtienen los datos de un pedido
 * @author Focus Dev 
 */
public class DatosPedido{
    DatosLibro dLibro = new DatosLibro();
    private static List<Pedido>stubPedidos;
    private static List <Pedido> pedidos;
    /**
     * Constructor de la clase que inicializa el atributo pedidos
     */
    public DatosPedido(){
         pedidos=new ArrayList<Pedido>();
         stubPedidos= listaPedidosStub();
    } 
    /**
     * Metodo que agrega un pedido a la lista de pedidos
     * @param pedido 
     */
    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    /**
     * Metodo que regresa la lista de pedidos
     * @return pedidos
     */ 
    public List<Pedido> getListaPedido(){
        return stubPedidos;
    }
    /**
     * Metodo que regresa un pedido cuyo numero de folio sea igual
     * @param FolioSolicitud
     * @return pedido
     */
    public Pedido obtenPedido(String FolioSolicitud){
        for(Pedido p: pedidos ){
            if(p.getFolioSolicitud().equals(FolioSolicitud)){
                return p;
            }     
        }
       return null;
    }

    private List<Pedido> listaPedidosStub(){
        DatosProveedor proveedores=new DatosProveedor();
        stubPedidos = new ArrayList();
        Libro[] libros= arregloLibros(dLibro.listaLibros());
        Pedido pedido1 = new Pedido("564564", new Date(2012, 05, 11), libros,
                proveedores.getProveedor(new Proveedor("123")));
        Pedido pedido2 = new Pedido("331843", new Date(2012, 04, 23), libros,
                proveedores.getProveedor(new Proveedor("456")));
        Pedido pedido3 = new Pedido("897317", new Date(2012, 07, 13), libros,
                proveedores.getProveedor(new Proveedor("678")));
        Pedido pedido4 = new Pedido("8945454", new Date(2012, 07, 14), libros,
                proveedores.getProveedor(new Proveedor("910")));
        Pedido pedido5 = new Pedido("8941234", new Date(2012, 11, 19), libros,
                proveedores.getProveedor(new Proveedor("112")));

        stubPedidos.add(pedido1);
        stubPedidos.add(pedido2);
        stubPedidos.add(pedido3);
        stubPedidos.add(pedido4);
        stubPedidos.add(pedido5);
        
        return stubPedidos;
    }
    
    private Libro[] arregloLibros(List <Libro> libros){
        Libro[] arreglo = new Libro[libros.size()];
        int i=0;
        for(Libro lb : libros){
            arreglo[i]= lb;
            i++;
        }
        return arreglo;
    }
    
}
