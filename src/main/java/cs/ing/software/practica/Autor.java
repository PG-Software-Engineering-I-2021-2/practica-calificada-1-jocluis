package cs.ing.software.practica;

public class Autor {
    private String nombre;
    private String fechNacimiento;
    public Autor(String nombre,String fechNacimiento){
        this.nombre = nombre;
        this.fechNacimiento=fechNacimiento;
    }


    public String getNombre() {
        return nombre;
    }


    public String getFechNacimiento() {
        return fechNacimiento;
    }

}
