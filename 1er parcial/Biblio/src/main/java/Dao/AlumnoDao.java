//Tania Dyane Jimenez Granillo
package Dao;

import DTO.Alumno;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDao {

    public List<Alumno> alumnos = new ArrayList<>();

    public void AgregarAlumnoDao(Alumno alumno) {
        alumnos.add(alumno);

    }

    public void EliminarAlumnoDao(Alumno alumno) {
        alumnos.remove(alumno);
    }

    public Alumno BuscarAlumnoDao(int id) {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a = alumnos.get(i);
            if (a.getId() == id) {
                System.out.println(a.getId());
                return a;
            }
        }
        return null;

    }

    public void ActualizarAlumnoDao(Alumno alumno) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getId() == alumno.getId()) {
                alumnos.get(i).setNombre(alumno.getNombre());
                alumnos.get(i).setApellido_Materno(alumno.getApellido_Materno());
            }
        }
    }

    public void ImprimirAlumnoDao(ArrayList<Alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());

        }
    }
}
