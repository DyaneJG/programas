/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.Prestamo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Intel
 */
public class PrestamoDao {

    public List<Prestamo> prestamos = new ArrayList<>();

    public void AgregarPrestamoDao(Prestamo prestamo) {
        prestamos.add(prestamo);

    }

    public void EliminarPrestamoDao(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }

    public Prestamo BuscarPrestamoDao(int id) {
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo a = prestamos.get(i);
            if (a.getId() == id) {
                System.out.println(a.getId());
                return a;
            }
        }
        return null;

    }

    public void ActualizarPrestamoDao(Prestamo prestamo) {
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getId() == prestamo.getId()) {
                prestamos.get(i).setFolio(prestamo.getFolio());
            }
        }
    }

    public List<Prestamo> imprimirtListaPrestamos() {
        return prestamos;

    }

}
