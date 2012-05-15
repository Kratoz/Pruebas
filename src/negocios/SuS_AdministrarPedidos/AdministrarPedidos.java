/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.SuS_AdministrarPedidos;

import accesoDatos.FachadaDatos;
import java.util.Date;
import java.util.List;
import negocios.objetosNegocio.Libro;
import negocios.objetosNegocio.Pedido;
import negocios.objetosNegocio.Proveedor;
import serviciosInfraestructura.FachadaServicios;

/**
 * Clase para administrar los pedidos almacenados
 * en la capa de datos y tambien contiene los metodos
 * necesarios para su envio.
 * 
 * @author Focus Dev
 */
public class AdministrarPedidos {

    FachadaServicios servicioLinea;
    FachadaDatos servicioDatos;
    public AdministrarPedidos() {
        servicioLinea = new FachadaServicios();
        servicioDatos = new FachadaDatos();
    }
    
    /**
     * Metodo que regresa desde la capa de datos
     * la lista de pedidos que se encuentra
     * guardada actualmente.
     * @return Lista de pedidos
     */
    public List<Pedido> obtenerListaPedidos(){
        return servicioDatos.getListaPedido();
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
        Date date=p.getFechaSolicitud();
        String fecha=date.getDay()+"/"+date.getMonth()+"/"+date.getYear();
        if(servicioLinea.enviarCorreo(p.getProveedor().getCorreoProveedor(), p.getFolioSolicitud(), p.getArticulosSolicitud(),
                fecha)){
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
       return servicioDatos.getPedido(new Pedido("folioSolicitud"));
    }
}
