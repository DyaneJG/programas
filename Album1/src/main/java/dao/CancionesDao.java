//Tania Dyane Jimenez Granillo
package dao;

import dto.Canciones;
import java.util.ArrayList;
import java.util.List;

public class CancionesDao {

    public List<Canciones> cancions = new ArrayList<>();

    public void AgregarCancionesDao(Canciones cancion) {
        cancions.add(cancion);
    }

    public void EliminarCancionesDao(Canciones cancion) {
        cancions.remove(cancion);
    }

    public Canciones BuscarCancionesDao(int id) {
        for (int i = 0; i < cancions.size(); i++) {
            Canciones a = cancions.get(i);
            if (a.getId_canciones() == id) {
                System.out.println(a.getId_canciones());
                return a;
            }
        }
        return null;
    }

    public void ActualizarCancionesDao(Canciones cancion) {
        for (int i = 0; i < cancions.size(); i++) {
            if (cancions.get(i).getId_canciones() == cancion.getId_canciones()) {
                cancions.get(i).setNombre(cancion.getNombre());
                cancions.get(i).setCompositor(cancion.getCompositor());
                cancions.get(i).setArtista(cancion.getArtista());
                cancions.get(i).setAño(cancion.getAño());
                 cancions.get(i).setGenero_musical(cancion.getGenero_musical());
            }

        }
    }
    
    public void ImprimirArtistaDao(ArrayList<Canciones> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());

        }
    }

}
