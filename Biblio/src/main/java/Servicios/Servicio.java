//Tania Dyane Jimenez Granillo
package Servicios;

import DTO.Alumno;
import DTO.Libros;
import DTO.Prestamo;
import DTO.Profesor;
import Facade.AlumnoFacade;
import Facade.LibrosFacade;
import Facade.PrestamoFacade;
import Facade.ProfesorFacade;
import java.util.ArrayList;
import java.util.List;

public class Servicio {
    
    AlumnoFacade alumnoFacade = new AlumnoFacade();
    LibrosFacade libroFacade = new LibrosFacade();
    PrestamoFacade prestamoFacade = new PrestamoFacade();
    ProfesorFacade profesorFacade = new ProfesorFacade();

    //parte Alumno
    public void agregarAlumno(Alumno alumno) {
        alumnoFacade.agregarAlumnoFacade(alumno);
    }    

    public void actualizarAlumno(Alumno alumno) {
        alumnoFacade.actualizarAlumnoFacade(alumno);
    }    
    
    public void eliminarAlumno(Alumno alumno) {
        alumnoFacade.eliminarAlumnoFacade(alumno);
    }    
    
    public void bucarAlumno(int id) {
        alumnoFacade.buscarAlumnoFacade(id);
    }    
    
    public void imprimirAlumno(ArrayList<Alumno> lista) {
        alumnoFacade.imprimirAlumnoFacade(lista);        
    }

    //parte Libros
    public void agregarLibros(Libros libro) {
        libroFacade.agregarLibrosFacade(libro);
    }    

    public void actualizarLibros(Libros libro) {
        libroFacade.actualizarLibrosFacade(libro);
    }    
    
    public void eliminarLibros(Libros libro) {
        libroFacade.eliminarLibrosFacade(libro);
    }    
    
    public void bucarLibros(int id) {
        libroFacade.buscarLibrosFacade(id);
    }    
    
    public void imprimirLibros(ArrayList<Libros> lista) {
        libroFacade.imprimirLibrosFacade(lista);
    }

    //parte Profesor
    public void agregarProfesor(Profesor profesor) {
        profesorFacade.agregarProfesorFacade(profesor);
    }    

    public void actualizarProfesor(Profesor profesor) {
        profesorFacade.actualizarProfesorFacade(profesor);
    }    
    
    public void eliminarProfesor(Profesor profesor) {
        profesorFacade.eliminarProfesorFacade(profesor);
    }    
    
    public void bucarProfesor(int id) {
        profesorFacade.buscarProfesorFacade(id);
    }    
    
    public void imprimirProfesor(ArrayList<Profesor> lista) {
        profesorFacade.imprimirProfesorFacade(lista);
    }

    //parte Prestamo
    public void agregarPrestamo(Prestamo prestamo) {
        prestamoFacade.agregarPrestamoFacade(prestamo);
    }    

    public void actualizarPrestamo(Prestamo prestamo) {
        prestamoFacade.actualizarPrestamoFacade(prestamo);
    }    
    
    public void eliminarPrestamo(Prestamo prestamo) {
        prestamoFacade.eliminarPrestamoFacade(prestamo);
    }    
    
    public void bucarPrestamo(int id) {
        prestamoFacade.buscarPrestamoFacade(id);
    }    
    
    public List<Prestamo> imprimirProfesor() {
        prestamoFacade.imprimirtListaPrestamosFacade();
        return null;
    }    
}
