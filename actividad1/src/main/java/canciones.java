
import java.util.List;


public class canciones{

    private String nombre;
    private int año;
    private String genero_musical;
    private List<Artista>artista;
    private String compositor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero_musical() {
        return genero_musical;
    }

    public void setGenero_musical(String genero_musical) {
        this.genero_musical = genero_musical;
    }

    public List<Artista> getArtista() {
        return artista;
    }

    public void setArtista(List<Artista> artista) {
        this.artista = artista;
    }
    
    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    @Override
    public String toString() {
        return "canciones{" + "nombre=" + nombre 
                + ", a\u00f1o=" + año + ", genero_musical=" 
                + genero_musical + ", artista=" + artista
                + ", compositor=" + compositor + '}';
    }

}
