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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechNacimiento() {
        return fechNacimiento;
    }

    public void setFechNacimiento(String fechNacimiento) {
        this.fechNacimiento = fechNacimiento;
    }
}
