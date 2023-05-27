//Tania Dyane Jimenez Granillo
package facade;

import dao.GrupoDao;
import dto.Grupo;
import java.util.ArrayList;

public class GrupoFacade {

    GrupoDao grupoDao = new GrupoDao();

    public void agregarGrupoFacade(Grupo grupo) {
        grupoDao.AgregarGrupoDao(grupo);
    }

    public void eliminarGrupoFacade(Grupo grupo) {
        grupoDao.EliminarGrupoDao(grupo);
    }

    public void buscarGrupoFacade(int id) {
        grupoDao.BuscarGrupoDao(id);

    }

    public void imprimirGrupoFacade(ArrayList<Grupo> lista) {
        grupoDao.ImprimirGrupoDao(lista);

    }

    public void actualizarGrupoFacade(Grupo grupo) {
        grupoDao.ActualizarGrupoDao(grupo);
    }
}
