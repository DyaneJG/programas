//Tania Dyane Jimenez Granillo
package dao;

import dto.Album;
import dto.Artista;
import java.util.ArrayList;
import java.util.List;

public class ArtistaDao {
    
    public List<Artista> artis=new ArrayList<>();
    
    public void AgregarArtistaDao(Artista artista){
        artis.add(artista);
    }
    public void EliminarArtistaDao(Artista artista){
        artis.remove(artista);
    }
     
    public Artista BuscarArtistaDao(int id){
        for(int i=0;i<artis.size(); i++) {
            Artista a = artis.get(i);
            if (a.getId() == id) {
                System.out.println(a.getId());
                return a;
            }
        }
        return null;
         }
    
   public void ActualizarArtistaDao(Artista artista){
        for (int i = 0; i < artis.size(); i++) {
            if (artis.get(i).getId() == artista.getId()) {
                artis.get(i).setNombre(artista.getNombre());
                artis.get(i).setApellido_Materno(artista.getApellido_Materno());
                artis.get(i).setApellido_Paterno(artista.getApellido_Paterno());
                artis.get(i).setEdad(artista.getEdad());
                artis.get(i).setDiscografia(artista.getDiscografia());
                artis.get(i).setGenero_musical(artista.getGenero_musical());
                artis.get(i).setNacionalidad(artista.getNacionalidad());
                artis.get(i).setSexo(artista.getSexo());
            }
        }
   }
   
   public void ImprimirArtistaDao(ArrayList<Artista> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());

        }
    }
}
