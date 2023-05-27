//Tania Dyane Jimenez Granillo
package facade;

import dao.AlbumDao;
import dto.Album;
import java.util.ArrayList;
import java.util.List;
public class AlbumFacade {
     AlbumDao albumDao = new AlbumDao();
    
    public void agregarAlbumFacade(Album album) {
        albumDao.AgregarAlbumDao(album);
    }
    
     public void eliminarAlbumFacade(Album album) {
        albumDao.EliminarAlbumDao(album);
    }
     
      public void buscarAlbumFacade(int id) {
        albumDao.BuscarAlbumDao(id);
        
    }   
    
    public void imprimirAlbumFacade(List<Album> albums) {
       albumDao.ImprimirAlbumDao(albums);
        
    }    
    
    public void actualizarAlbumFacade(Album album) {
        albumDao.ActualizarAlbumDao(album);
    }
}
