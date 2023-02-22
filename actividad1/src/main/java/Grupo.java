
import java.util.List;


public class Grupo{

    private String nombre;
    private String genero_musical;
    private String nacionalidad;
    private List<Artista>artista;
    private String discografia;
    private List<Album> album;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public List<Artista> getArtista() {
        return artista;
    }

    public void setArtista(List<Artista> artista) {
        this.artista = artista;
    }

    public List<Album> getAlbum() {
        return album;
    }

    public void setAlbum(List<Album> album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Grupo{" + "nombre=" + nombre + ", genero_musical=" + genero_musical + ", nacionalidad=" + nacionalidad + ", artista=" + artista + ", discografia=" + discografia + ", album=" + album + '}';
    }
    


   

}
