/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos.datos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import negocios.objetosNegocio.Proveedor;

/**
 * DatosProvedor clase de donde se obtiene los datos de un proveedor
 * @author Focus Dev 
 */
public class DatosProveedor {
    private static List<Proveedor> listaProveedor;
    /**
     * Metodo stub que agrega provedores a la lista de provedores
     * @return lista
     */
     public DatosProveedor(){
         listaProveedor = new ArrayList();

        Proveedor proveedor1 = new Proveedor("123", "Adrian Macias", "adrian.macias@itson.edu.mx", "1584328");
        Proveedor proveedor2 = new Proveedor("456", "Rafael Carrillo", "masterxp79@gmail.com", "1846813");
        Proveedor proveedor3 = new Proveedor("678", "Esteban Velarde", "mortal_saibot@hotmail.com", "384548");
        Proveedor proveedor4 = new Proveedor("910", "Ignacio Marquez", "nxchx_280192@hotmail.com", "1790705");
        Proveedor proveedor5 = new Proveedor("112", "Sergio Castellanos", "sergiolo03@hotmail.com", "324324");


        listaProveedor.add(proveedor1);
        listaProveedor.add(proveedor2);
        listaProveedor.add(proveedor3);
        listaProveedor.add(proveedor4);
        listaProveedor.add(proveedor5);
     }
    protected static List<Proveedor> listaProvedores(){
        return listaProveedor;
    } 

    protected Proveedor getProveedor(Proveedor proveedor){
        for(Proveedor tmpProveedor:listaProveedor){
            if(tmpProveedor.getId_proveedor().equalsIgnoreCase
                    (proveedor.getId_proveedor())){
                return tmpProveedor;
            }        
        }
        return null; 
    }
}
