//Tania Dyane Jimenez Granillo
package Facade;

import DTO.Alumno;
import DTO.Libros;
import DTO.Prestamo;
import DTO.Profesor;
import Dao.PrestamoDao;
import Servicios.Servicio;
import java.util.ArrayList;
import java.util.List;

public class PrestamoFacade {

    PrestamoDao prestamoDao = new PrestamoDao();

    public void agregarPrestamoFacade(Prestamo prestamo) {
        prestamoDao.AgregarPrestamoDao(prestamo);
    }

    public void eliminarPrestamoFacade(Prestamo prestamo) {
        prestamoDao.EliminarPrestamoDao(prestamo);
    }

    public void buscarPrestamoFacade(int id) {
        prestamoDao.BuscarPrestamoDao(id);

    }

    public void actualizarPrestamoFacade(Prestamo prestamo) {
        prestamoDao.ActualizarPrestamoDao(prestamo);
    }
    
    public List<Prestamo> imprimirtListaPrestamosFacade(){
        List<Prestamo> imprimirtListaPrestamos = prestamoDao.imprimirtListaPrestamos();        
        return null;
    }    

}
