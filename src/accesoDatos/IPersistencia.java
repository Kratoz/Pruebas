/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;


import java.util.List;
import negocios.objetosNegocio.Pedido;


/**
 * Interfaz IPersistencia 
 * @author Focus Dev
 */
public interface IPersistencia {
    /**
     * Metodo que regresa la lista de pedidos
     * @return lista pedidos
     */
    public List <Pedido> getListaPedido();
}
