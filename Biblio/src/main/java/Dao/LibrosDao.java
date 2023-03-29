//Tania Dyane Jimenez Granillo
package Dao;

import DTO.Libros;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Intel
 */
public class LibrosDao {

    public List<Libros> libros = new ArrayList<>();

    public void AgregarLibroDao(Libros libro) {
        libros.add(libro);

    }

    public void EliminarLibroDao(Libros libro) {
        libros.remove(libro);
    }

    public Libros BuscarLibroDao(int id) {
        for (int i = 0; i < libros.size(); i++) {
            Libros a = libros.get(i);
            if (a.getId() == id) {
                System.out.println(a.getId());
                return a;
            }
        }
        return null;

    }

    public void ActualizarLibroDao(Libros libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == libro.getId()) {
                libros.get(i).setNombre(libro.getNombre());
            }
        }
    }

    public void ImprimirLibroDao(ArrayList<Libros> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());

        }
    }
}
