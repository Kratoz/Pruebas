/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.objetosNegocio;

import java.util.Date;

/**
 * Clase que permite la crear y editar los atributos
 * de un objeto que representa pedidos.
 * 
 * @author Focus Dev
 */
public class Pedido {
    private String folioSolicitud;
    private Date fechaSolicitud;
    private Libro[] articulosSolicitud;
    private Proveedor proveedor;

    /**
     * Constructor por defecto de la clase Pedido.
     */
    public Pedido() {
    }

    /**
     * Constructor de la clase libro que crea un objeto
     * Pedido inicializando el valor del atributo folioSolicitud
     * al valor de su parametro.
     * @param folioSolicitud Folio del pedido
     */
    public Pedido(String folioSolicitud) {
        this.folioSolicitud = folioSolicitud;
    }

    /**
     * Constructor de la clase libro que crea un objeto
     * Pedido inicializando el valor de sus atributos
     * al valor de su parametro.
     * @param folioSolicitud Folio del pedido
     * @param fechaSolicitud Fecha del pedido
     * @param tipoSolicitud Tipo de la solicitud
     * @param articulosSolicitud Arreglo de los articulos de la solicitud
     */
    public Pedido(String folioSolicitud, Date fechaSolicitud, Libro[] articulosSolicitud,Proveedor proveedor) {
        this.folioSolicitud = folioSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.articulosSolicitud = articulosSolicitud;
        this.proveedor= proveedor;
    }

    /**
     * Metodo que regresa el valor
     * del atributo proveedor
     * @return Proveedor del pedido
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Metodo que establece el valor del atributo
     * proveedor al valor recibido por su parametro
     * @param proveedor Proveedor a establecer
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * Metodo que regresa un arreglo
     * del tipo libro representado 
     * los articulos de la solicitud.
     * @return Arreglo con los articulos de la solicitud
     */
    public Libro[] getArticulosSolicitud() {
        return articulosSolicitud;
    }

    /**
     * Establece el valor del los objetos Libro del
     * arreglo articulosSolicitud al valor recibido en
     * su parametro.
     * @param articulosSolicitud Arreglo de libros a establecer.
     */
    public void setArticulosSolicitud(Libro[] articulosSolicitud) {
        this.articulosSolicitud = articulosSolicitud;
    }

    /**
     * Metodo que regresa el valor del 
     * atributo fechaSolicitud de la clase.
     * @return Fecha de la solicitud
     */
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Metodo que establece el valor del 
     * atributo ISBN al valor de su parametro.
     * @param fechaSolicitud Fecha de solicitud a establecer
     */
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    /**
     * Metodo que regresa el valor del 
     * atributo folioSolicitud de la clase.
     * @return Folio de la solicitud
     */
    public String getFolioSolicitud() {
        return folioSolicitud;
    }

    /**
     * Metodo que establece el valor del 
     * atributo folioSolicitud al valor de su parametro.
     * @param folioSolicitud Folio de la solicitud a establecer
     */
    public void setFolioSolicitud(String folioSolicitud) {
        this.folioSolicitud = folioSolicitud;
    }

    /**
     * Metodo toString que regresa una cadena con los
     * valores de todos los atributos de la clase.
     * @return Cadena con los valores de todos los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Pedido{" + "folioSolicitud=" + folioSolicitud + ", fechaSolicitud=" + fechaSolicitud + ", articulosSolicitud=" + articulosSolicitud + ", proveedor=" + proveedor + '}';
    }     
}
