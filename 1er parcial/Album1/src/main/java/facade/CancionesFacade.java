//Tania Dyane Jimenez Granillo
package facade;

import dao.CancionesDao;
import dto.Canciones;
import java.util.ArrayList;

public class CancionesFacade {

    CancionesDao cancionDao = new CancionesDao();

    public void agregarCancionesFacade(Canciones cancion) {
        cancionDao.AgregarCancionesDao(cancion);
    }

    public void eliminarCancionesFacade(Canciones cancion) {
        cancionDao.EliminarCancionesDao(cancion);
    }

    public void buscarCancionesFacade(int id) {
        cancionDao.BuscarCancionesDao(id);

    }

    public void imprimirCancionesFacade(ArrayList<Canciones> lista) {
        cancionDao.ImprimirArtistaDao(lista);

    }

    public void actualizarCancionesFacade(Canciones cancion) {
        cancionDao.ActualizarCancionesDao(cancion);
    }
}
