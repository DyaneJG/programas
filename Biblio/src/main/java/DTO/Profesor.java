//Tania Dyane Jimenez Granillo
package DTO;
public class Profesor extends Persona{
     private int id;
    private int numeroEmpleado;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ","
                + " numeroEmpleado=" + numeroEmpleado + '}';
    }
}
