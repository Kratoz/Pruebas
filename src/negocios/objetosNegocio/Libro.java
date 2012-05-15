/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.objetosNegocio;

/**
 * Clase que permite la crear y editar los atributos
 * de un objeto que representa libros.
 * 
 * @author Focus Dev
 */
public class Libro {
    private String idLibro;
    private String tituloLibro;
    private String autor;
    private float costo;
    private String ISBN;

    /**
     * Constructor por defecto de la clase libros.
     */
    public Libro() {
    }

    /**
     * Constructor de la clase libro que crea un objeto
     * Libro inicializando el valor del atributo idLibro
     * al valor de su parametro.
     * @param idLibro Id del libro
     */
    public Libro(String idLibro) {
        this.idLibro = idLibro;
    }

    /**
     * Constructor de la clase libro que crea un objeto
     * Libro inicializando el valor de sus atributos
     * al valor de su parametro.
     * @param idLibro Id del libro
     * @param tituloLibro Titulo del libro
     * @param proveedor Proveedor que ofrece el libro
     * @param autor Autor del libro
     * @param costo Costo del libro
     * @param ISBN ISBN del libro
     */
    public Libro(String idLibro, String tituloLibro, String autor, float costo, String ISBN) {
        this.idLibro = idLibro;
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.costo = costo;
        this.ISBN = ISBN;
    }

    /**
     * Metodo que regresa el valor del 
     * atributo ISBN
     * @return ISBN del libro
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Establece el valor del atributo ISBN al valor
     * de su parametro.
     * @param ISBN ISBN del libro a establecer.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Metodo que regresa el valor del 
     * atributo autor de la clase.
     * @return Autor de la clase
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el valor del atributo autor al valor
     * de su parametro.
     * @param autor Autor del libro a establecer
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Metodo que regresa el valor del 
     * atributo costo de la clase.
     * @return Costo del libro
     */
    public float getCosto() {
        return costo;
    }

    /**
     * Establece el valor del atributo costo
     * al valor de su parametro.
     * @param costo Costo del libro a establecer
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * Metodo que regresa el valor del 
     * atributo idLibro de la clase.
     * @return 
     */
    public String getIdLibro() {
        return idLibro;
    }

    /**
     * Establece el valor del atributo idLibro
     * al valor de su parametro.
     * @param idLibro ID del libro a establecer
     */
    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    /**
     * Metodo que regresa el valor del 
     * atributo tituloLibro de la clase.
     * @return Titulo del libro
     */
    public String getTituloLibro() {
        return tituloLibro;
    }

    /**
     * Establece el valor del atributo tituloLibro
     * al valor de su parametro.
     * @param tituloLibro Titulo del libro a establecer
     */
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    /**
     * Metodo toString que regresa una cadena con los
     * valores de todos los atributos de la clase.
     * @return Cadena con los valores de todos los atributos de la clase.
     */
    @Override
    public String toString() {
        return tituloLibro+" - "+autor;
    }
    
}
