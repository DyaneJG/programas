//Tania Dyane Jimenez Granillo
package facade;

import dao.ArtistaDao;
import dto.Artista;
import java.util.ArrayList;
public class ArtistaFacade {
     ArtistaDao artistaDao = new ArtistaDao();
    
    public void agregarArtistaFacade(Artista artista) {
        artistaDao.AgregarArtistaDao(artista);
    }
    
     public void eliminarArtistaFacade(Artista artista) {
        artistaDao.EliminarArtistaDao(artista);
    }
     
      public void buscarArtistaFacade(int id) {
        artistaDao.BuscarArtistaDao(id);
        
    }   
    
    public void imprimirArtistaFacade(ArrayList<Artista> lista) {
       artistaDao.ImprimirArtistaDao(lista);
        
    }    
    
    public void actualizarArtistaFacade(Artista artista) {
        artistaDao.ActualizarArtistaDao(artista);
    }
}
