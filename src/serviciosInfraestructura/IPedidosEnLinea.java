/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosInfraestructura;

import negocios.objetosNegocio.Libro;

/**
 * 
 * @author Rafuru
 */
public interface IPedidosEnLinea {
    public boolean enviarPedidos(String mail, String folioPedido, Libro[] titulos,
            String fecha);
}
