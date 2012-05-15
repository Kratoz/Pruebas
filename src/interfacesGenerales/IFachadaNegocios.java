/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGenerales;

import java.util.List;
import negocios.objetosNegocio.Libro;
import negocios.objetosNegocio.Pedido;
import negocios.objetosNegocio.Proveedor;

/**
 * Intefaz para establecer los metodos que deben
 * implementar  las fachadas de negocio.
 * 
 * @author Focus Dev
 */
public interface IFachadaNegocios {
    /**
     * Metodo que regresa desde la capa de datos
     * la lista de pedidos que se encuentra
     * guardada actualmente.
     * @return Lista de pedidos
     */
    public List<Pedido> obtenerListaPedidos();
    
    /**
     * Metodo que solicita a la fachada
     * el envio de un pedido en linea a su respectivo
     * proveedor
     * @param p Pedido a enviar en linea
     * @return true si logro enviarlo exitosamente, false en
     * caso contrario
     */
    public boolean enviarPedido(Pedido p);
    
    /**
     * Metodo que obtiene un pedido con el mismo folio
     * de solicitud que el del parametro.
     * @param folioSolicitud Folio de la solicitud a obtener
     * @return Pedido buscado
     */
    public Pedido obtenPedido(String folioSolicitud);
}
