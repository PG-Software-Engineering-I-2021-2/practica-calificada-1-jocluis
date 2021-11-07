package cs.ing.software.practica;

public class Libro {
    private String nombre;
    private String anio;
    private Autor autor;
    private int stockActual;
    public Libro(String nombre,String anio,Autor autor,int stockActual)
    {
        this.nombre=nombre;
        this.anio=anio;
        this.autor=autor;
        this.stockActual=stockActual;
    }


    public Autor getAutor() {
        return autor;
    }


    public String getNombre() {
        return nombre;
    }

    public String getAnio() {
        return anio;
    }


    public int getStockActual() {
        return stockActual;
    }


}
