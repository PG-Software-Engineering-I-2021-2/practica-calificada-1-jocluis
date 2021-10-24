package cs.ing.software.practica;

public class Libro {
    private String nombre;
    private String anio;
    private Autor autor;
    private int stockActual;
    public Libro(String nombre,String anio)
    {
        this.nombre=nombre;
        this.anio=anio;
    }

    public int obtenerSotck(String nombre,Autor autor)
    {
        //código para buscar por nombre o autor
        int stock=0;
        if(nombre.equals("Software Engineering 10th Edicion")) stock =0;
        else stock = 100;

        return stock;
    }



    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }


    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }
}
