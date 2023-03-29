//Tania Dyane Jimenez Granillo
package servicios;

import dto.Album;
import dto.Artista;
import dto.Canciones;
import dto.Grupo;
import facade.AlbumFacade;
import facade.ArtistaFacade;
import facade.CancionesFacade;
import facade.GrupoFacade;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Intel
 */
public class Servicio {
    AlbumFacade albumFacade = new AlbumFacade();
    ArtistaFacade artistaFacade = new ArtistaFacade();
    CancionesFacade cancionesFacade = new CancionesFacade();
    GrupoFacade grupoFacade = new GrupoFacade();

    //parte Album
    public void agregarAlbum(Album album) {
      albumFacade.agregarAlbumFacade(album);
    }    
     public void actualizarAlbum(Album album) {
        albumFacade.actualizarAlbumFacade(album);
    }  
    
    public void eliminarAlbum(Album album) {
        albumFacade.eliminarAlbumFacade(album);
    }    
    
    public void bucarAlbum(int id) {
        albumFacade.buscarAlbumFacade(id);
    }    
    
    public void imprimirAlbum(List<Album> albums) {
        albumFacade.imprimirAlbumFacade(albums);
    }

    //parte Artista
    public void agregarArtista(Artista artista) {
        artistaFacade.agregarArtistaFacade(artista);
    }    
    public void actualizarArtista(Artista artista) {
        artistaFacade.actualizarArtistaFacade(artista);
    } 
    
    public void eliminarArtista(Artista artista) {
        artistaFacade.eliminarArtistaFacade(artista);
    }    
    
    public void bucarArtista(int id) {
       artistaFacade.buscarArtistaFacade(id);
    }    
    
    public void imprimirArtista(ArrayList<Artista> lista) {
        artistaFacade.imprimirArtistaFacade(lista);
    }

    //parte Canciones
    public void agregarCanciones(Canciones cancion) {
       cancionesFacade.agregarCancionesFacade(cancion);
    }    
    
    public void actualizarCanciones(Canciones cancion) {
        cancionesFacade.actualizarCancionesFacade(cancion);
    }    
    
    public void eliminarCanciones(Canciones cancion) {
        cancionesFacade.eliminarCancionesFacade(cancion);
    }    
    
    public void bucarCanciones(int id) {
       cancionesFacade.buscarCancionesFacade(id);
    }    
    
    public void imprimirCanciones(ArrayList<Canciones> lista) {
        cancionesFacade.imprimirCancionesFacade(lista);
    }

    //parte Grupo
    public void agregarGrupo(Grupo grupos) {
        grupoFacade.agregarGrupoFacade(grupos);
    }    
    public void actualizarGrupo(Grupo grupos) {
        grupoFacade.actualizarGrupoFacade(grupos);
    }  
    
    public void eliminarGrupo(Grupo grupos) {
        grupoFacade.eliminarGrupoFacade(grupos);
    }    
    
    public void bucarGrupo(int id) {
        grupoFacade.buscarGrupoFacade(id);
    }    
    
    public void imprimirGrupo(ArrayList<Grupo> lista) {
        grupoFacade.imprimirGrupoFacade(lista);
    }
}
