import java.util.Comparator;
import java.util.TreeSet;

public class Orden_peliculas {

    public static void main(String[] args) {
    // Crear comparadores para ordenar por nombre, año, director o puntaje imdb
    Comparator<peliculas> porNombre = Comparator.comparing(p -> p.getNombre());
    Comparator<peliculas> porAño = Comparator.comparing(p -> p.getAño());
    Comparator<peliculas> porDirector = Comparator.comparing(p -> p.getDirector());
    Comparator<peliculas> porIMDb = Comparator.comparing(p -> p.getIMDb());
        
    //Se crean 4 TreeSet diferentes, cada uno usa un comparador diferente
    //TreeSet ordenado por nombre
    TreeSet<peliculas> listaPorNombre = new TreeSet<>(porNombre);
    listaPorNombre.add(new peliculas("Donnie Darko",2001,"Richard Kelly",8.0));
    listaPorNombre.add(new peliculas("Trainspotting",1996,"Danny Boyle",8.1));
    listaPorNombre.add(new peliculas("Hereditary",2018,"Ari Aster",7.3));
    listaPorNombre.add(new peliculas("The Machinist",2004,"Brad Anderson",7.6));
    listaPorNombre.add(new peliculas("Shutter Island",2010,"Martin Scorsese",8.2));
    
    // TreeSet ordenado por año
    TreeSet<peliculas> listaPorAño = new TreeSet<>(porAño.reversed()); //Uso el reversed para que vaya de mayor a menor
    listaPorAño.addAll(listaPorNombre); //se añaden todos los elementos del TreeSet listaPorNombre al nuevo TreeSet listaPorAño
    
    // TreeSet ordenado por director
    TreeSet<peliculas> listaPorDirector = new TreeSet<>(porDirector);
    listaPorDirector.addAll(listaPorNombre);
        
    // TreeSet ordenado por IMDb
    TreeSet<peliculas> listaPorIMDb = new TreeSet<>(porIMDb.reversed());
    listaPorIMDb.addAll(listaPorNombre);

    // Imprimir lista ordenada por nombre
    System.out.println("Peliculas ordenadas por nombre:");
    for (peliculas i : listaPorNombre) { //itera sobre el TreeSet y cada vez que obtiene una película la imprimime
        System.out.println(i);
    }

    // Imprimir lista ordenada por año
    System.out.println("\nPeliculas ordenadas por año:");
    for (peliculas i : listaPorAño) {
        System.out.println(i);
    }

    // Imprimir lista ordenada por director
    System.out.println("\nPeliculas ordenadas por director:");
    for (peliculas i : listaPorDirector) {
        System.out.println(i);
    }

    // Imprimir lista ordenada por IMDb
    System.out.println("\nPeliculas ordenadas por IMDb:");
    for (peliculas i : listaPorIMDb) {
        System.out.println(i);
    }

    }
    
}