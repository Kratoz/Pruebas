/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos.persistencia;

import accesoDatos.IPersistencia;
import accesoDatos.datos.DatosLibro;
import accesoDatos.datos.DatosPedido;
import java.util.List;
import negocios.objetosNegocio.*;


/**
 * Clase en la que implementa la interfaz IPersistencia y encapcula los datos de la persistencia
 * @author Focus Dev
 */
public class FachadaPersistencia implements IPersistencia{
    private DatosPedido pedidos;
    private DatosLibro libros;
    /**
     * constructor de la clse que inicializa el parametro pedidos
     */
    public FachadaPersistencia() {
        pedidos=new DatosPedido();
        libros=new DatosLibro();
    }

    /**
     * Metodo que regresa la lista de pedido
     * @return pedidos
     */
    public List <Pedido> getListaPedido(){
         return pedidos.getListaPedido();
    }

    /**
     * Metodo que se encarga de agregar un pedido
     * @param pedido
     */
    public void agregarPedido(Pedido pedido){
        pedidos.agregarPedido(pedido);
    }
    /**
     * Metodo que regresa el folio solicitud de un pedido
     * @param pedido
     * @return folio solicitud
     */
    public Pedido getPedido(Pedido pedido){
        return pedidos.obtenPedido(pedido.getFolioSolicitud());
    }

    public List<Libro> getListaLibros(){
        return libros.listaLibros();
    }
    
}
