

public class Artista extends Persona {

    private String nombre;
    private int edad;
    private String genero_musical;
    private String nacionalidad;
    private String discografia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero_musical() {
        return genero_musical;
    }

    public void setGenero_musical(String genero_musical) {
        this.genero_musical = genero_musical;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", edad=" + edad + ", genero_musical=" + genero_musical + ", nacionalidad=" + nacionalidad + ", discografia=" + discografia + '}';
    }

   
    
}
