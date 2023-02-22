
public class Libros extends Prestamo{

    private String nombre;
    private int id;
    private int ISBN;
    private String editorial;
    private String categoria;
    private int stock;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Libros{" + "nombre=" + nombre + 
                ", id=" + id + ", ISBN=" + ISBN +
                ", editorial=" + editorial + ", "
                + "categoria=" + categoria + ", "
                + "stock=" + stock + '}';
    }

}
