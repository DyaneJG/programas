//Tania Dyane Jimenez Granillo
package dao;

import dto.Album;
import java.util.ArrayList;
import java.util.List;

public class AlbumDao {

    public List<Album> albums = new ArrayList<>();

    public void AgregarAlbumDao(Album album) {
        albums.add(album);
    }

    public void EliminarAlbumDao(Album album) {
        albums.remove(album);
    }

    public Album BuscarAlbumDao(int id) {
        for (int i = 0; i < albums.size(); i++) {
            Album a = albums.get(i);
            if (a.getId_album() == id) {
                System.out.println(a.getId_album());
                return a;
            }
        }
        return null;

    }

    public void ActualizarAlbumDao(Album album) {
        for (int i = 0; i < albums.size(); i++) {
            if (albums.get(i).getId_album() == album.getId_album()) {
                albums.get(i).setId_album(album.getId_album());
                albums.get(i).setNombre(album.getNombre());
                albums.get(i).setArtista(album.getArtista());
                albums.get(i).setAño(album.getAño());
                albums.get(i).setGenero_musical(album.getGenero_musical());
                albums.get(i).setCancion(album.getCancion());
            }

        }
    }
    
    public void ImprimirAlbumDao(List<Album> albums){
         for (int i = 0; i < albums.size(); i++) {
            System.out.println(albums.get(i).toString());

        }
    }
}
