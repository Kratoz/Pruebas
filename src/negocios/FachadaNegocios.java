/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;
import interfacesGenerales.IFachadaNegocios;
import java.util.List;
import negocios.SuS_AdministrarPedidos.FachadaAdministrarPedidos;
import negocios.objetosNegocio.Libro;
import negocios.objetosNegocio.Pedido;
import negocios.objetosNegocio.Proveedor;
/**
 * Clase de fachada que permite el acceso
 * a los metodos de la capa de negocio.
 * 
 * @author Focus Dev
 */
public class FachadaNegocios implements IFachadaNegocios{
FachadaAdministrarPedidos servicioNegocio = new FachadaAdministrarPedidos();

    /**
     * Metodo que regresa desde la capa de datos
     * la lista de pedidos que se encuentra
     * guardada actualmente.
     * @return Lista de pedidos
     */
    public List<Pedido> obtenerListaPedidos() {
        return servicioNegocio.obtenerListaPedidos();
    }

    /**
     * Metodo que solicita a la fachada
     * el envio de un pedido en linea a su respectivo
     * proveedor
     * @param p Pedido a enviar en linea
     * @return true si logro enviarlo exitosamente, false en
     * caso contrario
     */
    public boolean enviarPedido(Pedido p) {
        if(servicioNegocio.enviarPedido(p)){
            return true;
        }
        return false;
    }

    /**
     * Metodo que obtiene un pedido con el mismo folio
     * de solicitud que el del parametro.
     * @param folioSolicitud Folio de la solicitud a obtener
     * @return Pedido buscado
     */
    public Pedido obtenPedido(String folioSolicitud) {
        return servicioNegocio.obtenPedido(folioSolicitud);
    }
}
