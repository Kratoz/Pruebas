/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGenerales;

import java.util.List;
import negocios.objetosNegocio.Libro;
import negocios.objetosNegocio.Pedido;

/**
 *
 * @author Focus Dev
 */
public interface IFachadaDatos {
    public List <Pedido> getListaPedido();

    public void agregarPedido(Pedido pedido);
    
    public Pedido getPedido(Pedido pedido);

    
}
