package cs.ing.software.practica;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String email;
    private String celular;
    private ArrayList<EstudiantePreferencia> preferencias;

    public Estudiante(String nombre,String email,String celular, ArrayList<EstudiantePreferencia> preferencias)
    {
        this.nombre=nombre;
        this.email=email;
        this.celular=celular;
        this.preferencias=preferencias;
    }

    public ArrayList<EstudiantePreferencia> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(ArrayList<EstudiantePreferencia> preferencias) {
        this.preferencias = preferencias;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }


}
