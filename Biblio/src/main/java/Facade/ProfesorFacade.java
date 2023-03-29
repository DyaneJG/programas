//Tania Dyane Jimenez Granillo
package Facade;


import DTO.Alumno;
import DTO.Libros;
import DTO.Prestamo;
import DTO.Profesor;
import Dao.ProfesorDao;
import Servicios.Servicio;
import java.util.ArrayList;
import java.util.List;

public class ProfesorFacade{
     ProfesorDao profesorDao = new ProfesorDao();
    
    public void agregarProfesorFacade(Profesor profesor) {
        profesorDao.AgregarProfesorDao(profesor);
    }
    
     public void eliminarProfesorFacade(Profesor profesor) {
        profesorDao.EliminarProfesorDao(profesor);
    }
     
      public void buscarProfesorFacade(int id) {
        profesorDao.BuscarProfesorDao(id);
        
    }   
    
    public void imprimirProfesorFacade(ArrayList<Profesor> lista) {
        profesorDao.ImprimirProfesorDao(lista);
        
    }    
    
    public void actualizarProfesorFacade(Profesor profesor) {
       profesorDao.ActualizarProfesorDao(profesor);
    }

    
    
}
