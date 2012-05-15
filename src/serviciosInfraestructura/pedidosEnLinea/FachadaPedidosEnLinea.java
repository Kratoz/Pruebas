
package serviciosInfraestructura.pedidosEnLinea;

import negocios.objetosNegocio.Libro;
import serviciosInfraestructura.IPedidosEnLinea;


/**
 * 
 * @author Rafuru
 */
public class FachadaPedidosEnLinea implements IPedidosEnLinea{
    private StringBuilder builder;

    
    public FachadaPedidosEnLinea(){
        builder=new StringBuilder();
    }
    public boolean enviarPedidos(String mail, String folioPedido, Libro[] titulos,
            String fecha) {
        builder.append("------------------------------------------------------------------\n");
        builder.append("-- Pedido de Sistema Integral de Pedios y Devoluciones--\n");
        builder.append("-------------------------------------------------------------------\n");
        builder.append("\n\n");
        builder.append("ID Pedido: ");
        builder.append(folioPedido);
        builder.append("\t \t Fecha del Pedido: ");
        builder.append(fecha);
        
        builder.append("\n\n");
        builder.append("Titulos que se han pedido:\n");
        for(int i=0;i<titulos.length;i++){
            builder.append("\n");
            builder.append(titulos[i].getTituloLibro());
            builder.append(" - ");
            builder.append(titulos[i].getAutor());
        }
        builder.append("\n\n Fin del Pedido\n\n");
        builder.append("---------------------------------------------------\n\n");
        String subject="Nuevo pedido de : Sistema de Pedidos SIDEP";
        Mailer enviar=new Mailer(builder,mail,subject);
        return enviar.enviaCorreo();
        }
    
}
     
    
    
