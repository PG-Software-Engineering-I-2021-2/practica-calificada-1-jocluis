package cs.ing.software.practica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Oliver {

    private static Oliver instance;

    private Map<Integer, Libro> libros = new HashMap<>();
    private Map<Integer, Autor> autores = new HashMap<>();
    private Map<Integer, Estudiante> estudiantes = new HashMap<>();

    public Oliver()
    {}

    public void registrarEstudiante(Integer id,String nombre,String email,String celular, ArrayList<EstudiantePreferencia> preferencias){
        estudiantes.put(id, new Estudiante(nombre, email,celular,preferencias));
    }

    public void registrarAutor(Integer id,String nombre,String fechNacimiento){
        autores.put(id, new Autor(nombre,fechNacimiento));
    }



    public ArrayList<Libro> buscarLibrosxAutor(String autor)
    {
            ArrayList<Libro> libros = new ArrayList<Libro>();
            if("Somerville".equals(autor))
            {
                libros.add(new Libro("Software Engineering 6th edition","2000"));
                libros.add(new Libro("Software Engineering 7th edition","2001"));
            }

            return libros;
    }


    public int obtenerStock(String nombre,String anio,Autor autor)
    {
        Libro libroxBuscar= new Libro(nombre,anio);
        return libroxBuscar.obtenerSotck(nombre,autor);

    }




    public static Oliver getInstance() {
        if(instance == null){
            instance = new Oliver();
        }
        return instance;
    }
}
