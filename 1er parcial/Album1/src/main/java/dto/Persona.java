//tania Dyane Jimenez Granillo
package dto;
public class Persona {
      private int id;
    private String nombre;
    private String apellido_Paterno;
    private String apellido_Materno;
    private String Sexo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_Paterno() {
        return apellido_Paterno;
    }

    public void setApellido_Paterno(String apellido_Peterno) {
        this.apellido_Paterno = apellido_Peterno;
    }

    public String getApellido_Materno() {
        return apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", "
                + "apellido_Peterno=" + apellido_Paterno + ","
                + " apellido_Materno=" + apellido_Materno + ", Sexo=" + Sexo + '}';
    }
    
    
}
