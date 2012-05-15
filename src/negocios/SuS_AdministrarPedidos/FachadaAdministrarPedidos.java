/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.SuS_AdministrarPedidos;

import java.util.List;
import negocios.objetosNegocio.Pedido;

/**
 * Fachada para el caso de uso Administrar Pedidos,
 * que permite acceder a los metodos necesarios
 * para el envio y guardado de pedidos a traves
 * de las capas de datos e infraestructura.
 * 
 * @author Focus Dev
 */
public class FachadaAdministrarPedidos implements IAdministrarPedidos{
    private AdministrarPedidos admon;
    
    /**
     * Constructor por defecto de la clase
     */
    public FachadaAdministrarPedidos(){
        admon =new AdministrarPedidos();
    }
    
    /**
     * Metodo que regresa desde la capa de datos
     * la lista de pedidos que se encuentra
     * guardada actualmente.
     * @return Lista de pedidos
     */
    public List<Pedido> obtenerListaPedidos(){
        return admon.obtenerListaPedidos();
    }
    
    /**
     * Metodo que solicita a la capa de infraestructura
     * el envio de un pedido en linea a su respectivo
     * proveedor
     * @param p Pedido a enviar en linea
     * @return true si logro enviarlo exitosamente, false en
     * caso contrario
     */
    public boolean enviarPedido(Pedido p){
        if(admon.enviarPedido(p)){
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
        return admon.obtenPedido(folioSolicitud);
    }

}
