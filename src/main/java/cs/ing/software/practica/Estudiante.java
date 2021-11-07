package cs.ing.software.practica;

import java.util.List;
import java.util.logging.Logger;


public class Estudiante {
    private static Logger logger = Logger.getLogger(Estudiante.class.getName());
    private String nombre;
    private String email;
    private String celular;
    private List<String> preferencias;

    public Estudiante(String nombre,String email,String celular, List<String> preferencias)
    {
        this.nombre=nombre;
        this.email=email;
        this.celular=celular;
        this.preferencias=preferencias;
    }

    public List<String> getPreferencias() {
        return preferencias;
    }


    public String getNombre() {
        return nombre;
    }



    public String getEmail() {
        return email;
    }



    public String getCelular() {
        return celular;
    }



    public void enviarNotificacion(List<String> preferencias){
        logger.info("Segun su lista de preferencia se envía la siguiente oferta..."+preferencias.size());
    }
}
