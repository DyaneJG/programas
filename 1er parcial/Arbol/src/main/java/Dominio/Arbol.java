//Tania Dyane Jimenez Granillo
package Dominio;
public class Arbol {
     private Integer numero;
    private Integer numeroFrutas;
    private Integer alturaCm;
    private Integer pesoPromedioFruta;

    public Arbol(Integer numero, Integer numeroFrutas, Integer alturaCm, Integer pesoPromedioFruta) {
        this.numero = numero;
        this.numeroFrutas = numeroFrutas;
        this.alturaCm = alturaCm;
        this.pesoPromedioFruta = pesoPromedioFruta;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumeroFrutas() {
        return numeroFrutas;
    }

    public void setNumeroFrutas(Integer numeroFrutas) {
        this.numeroFrutas = numeroFrutas;
    }

    public Integer getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(Integer alturaCm) {
        this.alturaCm = alturaCm;
    }

    public Integer getPesoPromedioFruta() {
        return pesoPromedioFruta;
    }

    public void setPesoPromedioFruta(Integer pesoPromedioFruta) {
        this.pesoPromedioFruta = pesoPromedioFruta;
    }

    @Override
    public String toString() {
        return "Arbol{" + "numero=" + numero + ", numeroFrutas=" + numeroFrutas + ", alturaCm=" + alturaCm + ", pesoPromedioFruta=" + pesoPromedioFruta + '}';
    }
    
}
