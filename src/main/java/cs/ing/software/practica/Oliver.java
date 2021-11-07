package cs.ing.software.practica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Oliver {

    private static Oliver instance;

    private Map<Integer, Libro> libros = new HashMap<>();
    private Map<Integer, Estudiante> estudiantes = new HashMap<>();

    public Oliver()
    {}

    public static Oliver getInstance() {
        if(instance == null){
            instance = new Oliver();
        }
        return instance;
    }

    public String registrarEstudiante(Integer id,String nombre,String email,String celular, List<String> preferencias){
        Estudiante estudianteEntidad = new Estudiante(nombre, email,celular,preferencias);
        estudiantes.put(id, new Estudiante(nombre, email,celular,preferencias));
        return "Se registro con exito el estudiante: "+estudianteEntidad.getNombre()+"-"+estudianteEntidad.getEmail()+"-"+estudianteEntidad.getCelular();
    }

    public String registrarLibro(Integer id,String nombre,String anio,Autor autor,int stockActual){
        Libro entidadLibro= new Libro(nombre,anio,autor,stockActual);
        libros.put(id,entidadLibro);
        return "Se registro con exito el libro: "+entidadLibro.getNombre()+"-"+entidadLibro.getAnio()+"-"+entidadLibro.getStockActual();
    }

    public String obtenerStock(String nombre,Autor autor)
    {
        int stockActual=0;
        for (Map.Entry<Integer, Libro> entry : libros.entrySet()) {
            if(entry.getValue().getAutor().equals(autor))
                stockActual=libros.get(entry.getKey()).getStockActual();
        }
        return stockActual+" del "+nombre;
    }



    public List<Estudiante> noitificarEstudiantes() {
        ArrayList<Estudiante> estudiantesNotificar = new ArrayList<>();

        for (Map.Entry<Integer, Estudiante> entry : estudiantes.entrySet()) {

                Estudiante estudiante = estudiantes.get(entry.getKey());
                estudiante.enviarNotificacion(entry.getValue().getPreferencias());
                estudiantesNotificar.add(estudiante);

        }

        return estudiantesNotificar;
    }


}
