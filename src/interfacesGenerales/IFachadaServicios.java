
package interfacesGenerales;

import negocios.objetosNegocio.Libro;

/**
 *
 * @author ignacio
 */
public interface IFachadaServicios {
    public boolean enviarCorreo(String mail, String folioPedido, Libro[] titulos,
            String fecha);
}
