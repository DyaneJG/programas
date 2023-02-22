
import java.util.Date;
import java.util.List;

public class Prestamo extends Persona{

    private List<Libros> libros;
    private int id;
    private int Folio;
    private Date Fecha_inicio;
    private Date Fecha_entrega;
    private String status;
    private Persona Persona;

    public List<Libros> getLibros() {
        return libros;
    }

    public void setLibros(List<Libros> libros) {
        this.libros = libros;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFolio() {
        return Folio;
    }

    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    public Date getFecha_inicio() {
        return Fecha_inicio;
    }

    public void setFecha_inicio(Date Fecha_inicio) {
        this.Fecha_inicio = Fecha_inicio;
    }

    public Date getFecha_entrega() {
        return Fecha_entrega;
    }

    public void setFecha_entrega(Date Fecha_entrega) {
        this.Fecha_entrega = Fecha_entrega;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }

    
    @Override
    public String toString() {
        return "Prestamo{" + "libros=" + 
                libros + ", id=" + id + ", "
                + "Folio=" + Folio + ", Fecha_inicio="
                + Fecha_inicio + ", Fecha_entrega=" + 
                Fecha_entrega + ", status=" + status + 
                ", Persona=" + Persona + '}';
    }
    
    
}
