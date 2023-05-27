//Tania Dyane Jimenez Granillo
package dao;

import dto.Grupo;
import java.util.ArrayList;
import java.util.List;

public class GrupoDao {

    public List<Grupo> grups = new ArrayList<>();

    public void AgregarGrupoDao(Grupo grupos) {
        grups.add(grupos);
    }

    public void EliminarGrupoDao(Grupo grupos) {
        grups.remove(grupos);
    }

    public Grupo BuscarGrupoDao(int id) {
        for (int i = 0; i < grups.size(); i++) {
            Grupo a = grups.get(i);
            if (a.getId_grupo() == id) {
                System.out.println(a.getId_grupo());
                return a;
            }
        }
        return null;
    }

    public void ActualizarGrupoDao(Grupo grupos) {
        for (int i = 0; i < grups.size(); i++) {
            if (grups.get(i).getId_grupo() == grupos.getId_grupo()) {
                grups.get(i).setNombre(grupos.getNombre());
                grups.get(i).setArtista(grupos.getArtista());
                grups.get(i).setAlbum(grupos.getAlbum());
                grups.get(i).setDiscografia(grupos.getDiscografia());
                grups.get(i).setNacionalidad(grupos.getNacionalidad());
                grups.get(i).setGenero_musical(grupos.getGenero_musical());

            }

        }
    }

    public void ImprimirGrupoDao(ArrayList<Grupo> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());

        }
    }
}
