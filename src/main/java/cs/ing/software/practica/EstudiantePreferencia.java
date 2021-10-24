package cs.ing.software.practica;

public class EstudiantePreferencia {

    private String tipo; //ejemplo  Computer Science
    private Estudiante estudiante;
    public EstudiantePreferencia()
    {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
