/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import Dao.AlumnoDao;
import Dao.LibrosDao;
import Dao.PrestamoDao;
import Dao.ProfesorDao;
import DTO.Alumno;
import DTO.Libros;
import DTO.Prestamo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Intel
 */
public class testfuncionamiento {
    
    AlumnoDao alumnoDao = new AlumnoDao();
    LibrosDao libroDao = new LibrosDao();
    PrestamoDao prestamoDao = new PrestamoDao();
    ProfesorDao profesorDao = new ProfesorDao();
    private ArrayList<Prestamo> lista;

    public void testCrearPrestamo(Prestamo prestamo) {
        prestamoDao.AgregarPrestamoDao(prestamo);
        System.out.println("Fin agregar prestamo");

        
    }

    public void testCrearLibro(Libros libro) {
        libroDao.AgregarLibroDao(libro);
        System.out.println("Fin agregar");

    }
    
    
    public void testCrearAlumno(Alumno alumno){
        alumnoDao.AgregarAlumnoDao(alumno);
        System.out.println("agregoalumno");
    }

    public void consultarPrestamo() {

        //si es diferente de nulo que se imprima
        Prestamo p = prestamoDao.BuscarPrestamoDao(2);
        System.out.println("Bsqueda por id  " + p.toString());
    }

    public void consultarTodos() {
        List<Prestamo> prestamos = prestamoDao.imprimirtListaPrestamos();
        // forech  NombreClase nombreVariaTemporal : nombre de la lista que se recorre
        for (Prestamo p : prestamos) {
            System.out.println(p.toString());
        }

    }
}
