//Tania Dyane Jimenez Granillo
package Facade;

import DTO.Libros;
import Dao.LibrosDao;
import Servicios.Servicio;
import java.util.ArrayList;

public class LibrosFacade  {
     LibrosDao libroDao = new LibrosDao();
    
    public void agregarLibrosFacade(Libros libro) {
        libroDao.AgregarLibroDao(libro);
    }
    
     public void eliminarLibrosFacade(Libros libro) {
        libroDao.EliminarLibroDao(libro);
    }
     
      public void buscarLibrosFacade(int id) {
        libroDao.BuscarLibroDao(id);
        
    }   
    
    public void imprimirLibrosFacade(ArrayList<Libros> lista) {
        libroDao.ImprimirLibroDao(lista);
        
    }    
    
    public void actualizarLibrosFacade(Libros libro) {
       libroDao.ActualizarLibroDao(libro);
    }
}
