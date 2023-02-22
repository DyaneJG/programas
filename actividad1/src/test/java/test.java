//tania

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test {

    public static void main(String[] args) {
        // TODO code application logic here

        Artista artista1 = new Artista();
        artista1.setNombre("Juan Gabriel");
        artista1.setNacionalidad("Mexicana");
        artista1.setEdad(66);
        artista1.setGenero_musical("Mariachi, ranchera, bolero, pop latino, balada");
        artista1.setDiscografia("Universal Music Group-Fonovisa");

        Artista artista2 = new Artista();
        artista2.setNombre("Hwasa");
        artista2.setNacionalidad("Sur Coreana");
        artista2.setEdad(28);
        artista2.setGenero_musical("K-pop, Dance, Hip Hop, Pop, Balada, Funk, Blues, Soul");
        artista2.setDiscografia("RBW");

        Artista artista3 = new Artista();
        artista3.setNombre("Solar");
        artista3.setNacionalidad("Sur Coreana");
        artista3.setEdad(32);
        artista3.setGenero_musical("K-pop, Dance, Hip Hop, Pop, Balada, Funk, Blues, Soul");
        artista3.setDiscografia("RBW");

        Artista artista4 = new Artista();
        artista4.setNombre("Moonbyul");
        artista4.setNacionalidad("Sur Coreana");
        artista4.setEdad(31);
        artista4.setGenero_musical("K-pop, Dance, Hip Hop, Pop, Balada, Funk, Blues, Soul");
        artista4.setDiscografia("RBW");

        Artista artista5 = new Artista();
        artista5.setNombre("Wheein");
        artista5.setNacionalidad("Sur Coreana");
        artista5.setEdad(28);
        artista5.setGenero_musical("K-pop, Dance, Hip Hop, Pop, Balada, Funk, Blues, Soul");
        artista5.setDiscografia("RBW");

        Artista artista6 = new Artista();
        artista6.setNombre("Dimash Kudaibergen");
        artista6.setNacionalidad("Kazajo");
        artista6.setEdad(29);
        artista6.setGenero_musical("Pop crossover música tradicional world music");
        artista6.setDiscografia("BG Music");

        Artista artista7 = new Artista();
        artista7.setNombre("Diana Ankudinova");
        artista7.setNacionalidad("Rusa");
        artista7.setEdad(19);
        artista7.setGenero_musical(" Pop, Folk, Rock");
        artista7.setDiscografia("STARSTONE MUSIC");


        List<Artista> listaartista1 = new ArrayList<>();
        listaartista1.add(artista2);
        listaartista1.add(artista3);
        listaartista1.add(artista4);
        listaartista1.add(artista5);

        List<Artista> listaartista2 = new ArrayList<>();
        listaartista2.add(artista1);

        List<Artista> listaartista3 = new ArrayList<>();        
        listaartista3.add(artista7);
        listaartista3.add(artista6);

        canciones cancion1 = new canciones();
        cancion1.setNombre("HIP");
        cancion1.setCompositor("Hwasa junto a Kim Dohoon y Park Woosang");
        cancion1.setAño(2019);
        cancion1.setGenero_musical("Pop");
        cancion1.setArtista(listaartista1);

        canciones cancion2 = new canciones();
        cancion2.setNombre("dingga");
        cancion2.setCompositor("Hwasa");
        cancion2.setAño(2020);
        cancion2.setGenero_musical("Korean Dance, K-Pop");
        cancion2.setArtista(listaartista1);

        canciones cancion3 = new canciones();
        cancion3.setNombre("S.O.S d'un terrien en détresse");
        cancion3.setCompositor("Michel Berger");
        cancion3.setAño(1978);
        cancion3.setGenero_musical("Folk");
        cancion3.setArtista(listaartista3);

        canciones cancion4 = new canciones();
        cancion4.setNombre("Opera 2");
        cancion4.setCompositor("Vitas");
        cancion4.setAño(2017);
        cancion4.setGenero_musical("Clasica");
        cancion4.setArtista(listaartista3);

        canciones cancion5 = new canciones();
        cancion5.setNombre("Side By Sid'");
        cancion5.setCompositor("Brandon Stone");
        cancion5.setAño(2021);
        cancion5.setGenero_musical("Clasica");
        cancion5.setArtista(listaartista2);

        canciones cancion01 = new canciones();
        cancion01.setNombre("Abrázame muy fuerte");
        cancion01.setCompositor("Juan Gabriel.");
        cancion01.setAño(2000);
        cancion01.setGenero_musical("Pop latino");
        cancion01.setArtista(listaartista2);

        canciones cancion02 = new canciones();
        cancion02.setNombre("Amor eterno");
        cancion02.setCompositor("Juan Gabriel");
        cancion02.setAño(1990);
        cancion02.setGenero_musical("Regional Mexicana");
        cancion02.setArtista(listaartista2);

        List<canciones> listacanciones1 = new ArrayList<>();
        listacanciones1.add(cancion01);
        listacanciones1.add(cancion02);

        List<canciones> listacanciones2 = new ArrayList<>();
        listacanciones2.add(cancion1);
        listacanciones2.add(cancion2);

        List<canciones> listacanciones3 = new ArrayList<>();
        listacanciones3.add(cancion3);
        listacanciones3.add(cancion4);
        listacanciones3.add(cancion5);
        
        Album album1 = new Album();
        album1.setNombre("musica de Juan Gabriel");
        album1.setArtista(listaartista3);
        album1.setAño(2023);
        album1.setGenero_musical("mariachi,pop latino");
        album1.setCancion(listacanciones1);
        System.out.println(album1);

        Album album2 = new Album();
        album2.setNombre("musica de Dimash y Diana");
        album2.setGenero_musical("clasica");
        album2.setAño(2020);
        album2.setArtista(listaartista3);
        album2.setCancion(listacanciones3);
        System.out.println(album2);

        Album album3 = new Album();
        album3.setNombre("Mamamoo");
        album3.setGenero_musical("kpop");
        album3.setAño(2020);
        album3.setCancion(listacanciones2);
        
        List<Album> albumG = new ArrayList<>();
        albumG.add(album3);

        Grupo grupo1 = new Grupo();
        grupo1.setNombre("Mamamoo");
        grupo1.setGenero_musical("Kpop");
        grupo1.setNacionalidad("Sur Coreana");
        grupo1.setArtista(listaartista1);
        grupo1.setDiscografia("RBW");
        grupo1.setAlbum(albumG);
        System.out.println(grupo1);

    }

}
