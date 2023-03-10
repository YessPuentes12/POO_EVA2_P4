/*
LIBROS
ARTÍCULOS
INFORME
SITIO WEB
 */
// Agregar 2 atributos adicionales
//ARTE
//PELÍCULA
package eva2_4_formato_apa;

// Superclase: Documento

/*
AUTOR
TITULO
AÑO
MES
DIA
CIUDAD
 */

// Heredear de documento

public class EVA2_4_FORMATO_APA {


    public static void main(String[] args) {
    
      Libros lib1 = new Libros();  
        
      lib1.setAutor("Gabriel García Márquez.");
      lib1.setTitulo("100 años de soledad.");
      lib1.setAño(1967);
      lib1.setMes("Mayo");
      lib1.setDia(5);
      lib1.setCiudad("Buenos Aires");
      lib1.setEditorial("Editorial Sudamericana\n");
        
      System.out.println(lib1.getAutor()); 
      System.out.println(lib1.getTitulo()); 
      System.out.println(lib1.getAño());        
      System.out.println(lib1.getMes()); 
      System.out.println(lib1.getDia()); 
      System.out.println(lib1.getCiudad()); 
      System.out.println(lib1.getEditorial()); 
 //------------------------------------------------------------------------------
 
       Sitio_web web1 = new Sitio_web();
 
       web1.setAutor("KeepCoding.");
       web1.setNomWeb("Lenguaje de Programación Go y sus Características.");
       web1.setAño(2017);
       web1.setMes("Abril");
       web1.setDia(25);
       web1.setURL("https://keepcoding.io/blog/lenguaje-de-programacion-go-caracteristicas/#:~:text=El%20Lenguaje%20Go%2C%20al%20igual\n");
       
        System.out.println(web1.getAutor());
        System.out.println(web1.getNomWeb());
        System.out.println(web1.getAño());
        System.out.println(web1.getMes());
        System.out.println(web1.getDia());
        System.out.println(web1.getURL());
       
       
       
       
       
       
       
       
    }
    
}

