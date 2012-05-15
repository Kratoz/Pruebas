/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import accesoDatos.persistencia.FachadaPersistencia;
import interfacesGenerales.IFachadaDatos;
import java.util.List;
import negocios.objetosNegocio.Libro;
import negocios.objetosNegocio.Pedido;


/**
 *
 * @author Rafuru
 */
public class FachadaDatos implements IFachadaDatos{
    
    FachadaPersistencia persistencia;
    
    public FachadaDatos (){
        persistencia=new FachadaPersistencia();
    }
    
    public List<Pedido> getListaPedido() {
        return persistencia.getListaPedido();
    }

    public void agregarPedido(Pedido pedido) {
        persistencia.agregarPedido(pedido);
    }

    public Pedido getPedido(Pedido pedido) {
        return persistencia.getPedido(pedido);
    }

   
    
}
