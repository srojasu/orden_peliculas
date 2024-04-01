public class peliculas {
    
 private String nombre;      //Atributos de la pelicula
 private int año;
 private String director;
 private double IMDb;

    //COnstructor
    public peliculas(String nombre, int año, String director, double IMDb) {
        this.nombre = nombre;
        this.año = año;
        this.director = director;
        this.IMDb = IMDb;
    }

 @Override
 /*Se usa el toString para que cuando use un System.out.println() Java automáticamente invoque
 el método toString() de esa instancia para obtener una representación en cadena*/
    public String toString(){  
        return "Pelicula: " + nombre + ", Año: " + año + ", Director: " + director + ", IMDb: " + IMDb + ")";
    }
    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public String getDirector() {
        return director;
    }

    public double getIMDb() {
        return IMDb;
    }
    
 
}