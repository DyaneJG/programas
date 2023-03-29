//Tania Dyane Jimenez Granillo
package test;

import DTO.Alumno;
import DTO.Libros;
import DTO.Prestamo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class test {
    public static void main(String[] args) {
        // TODO code application logic here
        Libros libro1 = new Libros();
        libro1.setId(1);
        libro1.setNombre("Introducción a los algoritmos");
        libro1.setCategoria("programacion");
        libro1.setEditorial("MIT Press");
        libro1.setISBN(9780);
        libro1.setStock(2);

        Libros libro2 = new Libros();
        libro2.setId(2);
        libro2.setNombre("Programación para Principiantes");
        libro2.setCategoria("programacion");
        libro2.setEditorial("Independently ");
        libro2.setISBN(1699);
        libro2.setStock(4);

        Libros libro3 = new Libros();
        libro3.setId(3);
        libro3.setNombre("Hacking Ético");
        libro3.setCategoria("programacion");
        libro3.setEditorial("Independently");
        libro3.setISBN(1702);
        libro3.setStock(1);

        Libros libro4 = new Libros();
        libro4.setId(4);
        libro4.setNombre("Ecuaciones diferenciales");
        libro4.setCategoria("Calculo");
        libro4.setEditorial("Reverte");
        libro4.setISBN(1120);
        libro4.setStock(5);

        Libros libro5 = new Libros();
        libro5.setId(5);
        libro5.setNombre("Ética para ingenieros");
        libro5.setCategoria("programacion");
        libro5.setEditorial("Grupo Editorial Patria");
        libro5.setISBN(4960);
        libro5.setStock(1);

        Libros libro6 = new Libros();
        libro6.setId(6);
        libro6.setNombre("El Libro de Las Matemáticas");
        libro6.setCategoria("calculo");
        libro6.setEditorial("Dorling Kindersley");
        libro6.setISBN(1492);
        libro6.setStock(2);

        Libros libro7 = new Libros();
        libro7.setId(7);
        libro7.setNombre("El cerebro y la mente humana");
        libro7.setCategoria("ciencia");
        libro7.setEditorial("Editorial Ariel");
        libro7.setISBN(0256);
        libro7.setStock(4);

        List<Libros> listaLibros = new ArrayList<>();
        listaLibros.add(libro1);
        listaLibros.add(libro7);
        
        List<Libros> listaLibros1 = new ArrayList<>();
        listaLibros1.add(libro3);
        listaLibros1.add(libro2);
        listaLibros1.add(libro5);
        
        List<Libros> listaLibros2 = new ArrayList<>();
        listaLibros2.add(libro6);
        listaLibros2.add(libro4);

        Alumno alumno1 = new Alumno();
        alumno1.setId(1);
        alumno1.setNombre("Josue");        
        alumno1.setApellido_Paterno("Ugarte");
        alumno1.setApellido_Materno("Alcantara");
        alumno1.setNumeroCuenta(2227105);

        Prestamo prestamo1 = new Prestamo();
        Date fechaIni = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(215470);
        prestamo1.setFecha_inicio(fechaIni);
        prestamo1.setPersona(alumno1);
        prestamo1.setLibros(listaLibros);
        System.out.println(prestamo1);

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setId(1);
        prestamo2.setFolio(215470);
        prestamo2.setFecha_inicio(fechaIni);
        prestamo2.setPersona(alumno1);
        prestamo2.setLibros(listaLibros1);
        System.out.println(prestamo2);

        Alumno alumno2 = new Alumno();
        alumno2.setId(2);
        alumno2.setNombre("Nina");
        alumno2.setApellido_Paterno("Mejia");
        alumno2.setApellido_Materno("Flores");
        alumno2.setNumeroCuenta(2227142);

        Prestamo prestamo3 = new Prestamo();
        prestamo3.setId(2);
        prestamo3.setFolio(215413);
        prestamo3.setFecha_inicio(fechaIni);
        prestamo3.setPersona(alumno2);
        prestamo3.setLibros(listaLibros2);
        System.out.println(prestamo3);

    }
    
}
