//Tania Dyane Jimenez Granillo
package Facade;

import DTO.Alumno;
import DTO.Libros;
import DTO.Prestamo;
import DTO.Profesor;
import Dao.AlumnoDao;
import Servicios.Servicio;
import java.util.ArrayList;
import java.util.List;

public class AlumnoFacade {

    AlumnoDao alumnoDao = new AlumnoDao();
    
    public void agregarAlumnoFacade(Alumno alumno) {
        alumnoDao.AgregarAlumnoDao(alumno);
    }
    
     public void eliminarAlumnoFacade(Alumno alumno) {
        alumnoDao.EliminarAlumnoDao(alumno);
    }
     
      public void buscarAlumnoFacade(int id) {
        alumnoDao.BuscarAlumnoDao(id);
        
    }   
    
    public void imprimirAlumnoFacade(ArrayList<Alumno> lista) {
        alumnoDao.ImprimirAlumnoDao(lista);
        
    }    
    
    public void actualizarAlumnoFacade(Alumno alumno) {
        alumnoDao.ActualizarAlumnoDao(alumno);
    }
}
