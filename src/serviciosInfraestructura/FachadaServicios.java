/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosInfraestructura;

import interfacesGenerales.IFachadaServicios;
import negocios.objetosNegocio.Libro;
import serviciosInfraestructura.pedidosEnLinea.FachadaPedidosEnLinea;

/**
 *
 * @author Rafuru
 */
public class FachadaServicios implements IFachadaServicios {

    public boolean enviarCorreo(String mail, String folioPedido, Libro[] titulos,
            String fecha) {
        FachadaPedidosEnLinea pedido=new FachadaPedidosEnLinea();
        return pedido.enviarPedidos(mail, folioPedido, titulos, fecha);
    }
    
}
