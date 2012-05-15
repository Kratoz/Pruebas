/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos.datos;

import java.util.ArrayList;
import java.util.List;
import negocios.objetosNegocio.Libro;

/**
 * DatosLibro clase de donde se obtienen los datos de un libro 
 * @author Focus Dev
 */
public class DatosLibro {
  
  private static List<Libro> listaLibros;
   
  /**
   * Metodo stub para simula una lista de libros
   * @return listaLibro
   */
  public  List<Libro> listaLibros(){
      listaLibros = new ArrayList(); 
      
      Libro libro1 = new Libro("123","Crepusculo 9000","Esteban Velarde",1989.16f,"234532");
      Libro libro2 = new Libro("345","El Silmarillion","John Howe",186.16f,"281232");
      Libro libro3 = new Libro("567","Harry potter","Rafael",1565.16f,"8751545621879");
      
      listaLibros.add(libro1);
      listaLibros.add(libro2);
      listaLibros.add(libro3);
      return listaLibros; 
  }
}
