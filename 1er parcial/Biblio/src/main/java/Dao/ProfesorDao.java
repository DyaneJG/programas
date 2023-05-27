/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Intel
 */
public class ProfesorDao {

    public List<Profesor> profesores = new ArrayList<>();

    public void AgregarProfesorDao(Profesor profesor) {
        profesores.add(profesor);

    }

    public void EliminarProfesorDao(Profesor profesor) {
        profesores.remove(profesor);
    }

    public Profesor BuscarProfesorDao(int id) {
        for (int i = 0; i < profesores.size(); i++) {
            Profesor a = profesores.get(i);
            if (a.getId() == id) {
                System.out.println(a.getId());
                return a;
            }
        }
        return null;

    }

    public void ActualizarProfesorDao(Profesor profesor) {
        for (int i = 0; i < profesores.size(); i++) {
            if (profesores.get(i).getId() == profesor.getId()) {
                profesores.get(i).setNombre(profesor.getNombre());
                profesores.get(i).setApellido_Materno(profesor.getApellido_Materno());
            }
        }
    }

    public void ImprimirProfesorDao(ArrayList<Profesor> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());

        }
    }
}
