
import java.util.List;

public class Album{

    private String nombre;
    private int año;
    private String genero_musical;
    private List<canciones> cancion;
    private List<Artista> artista;

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

    public List<canciones> getCancion() {
        return cancion;
    }

    public void setCancion(List<canciones> cancion) {
        this.cancion = cancion;
    }

    public List<Artista> getArtista() {
        return artista;
    }

    public void setArtista(List<Artista> artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album{" + "nombre=" + nombre + ", a\u00f1o=" + año + ", genero_musical=" + genero_musical + ", cancion=" + cancion + ", artista=" + artista + '}';
    }

    

}
