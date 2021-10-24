package cs.ing.software.practica;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class OliverTest {



    @Test
    public void test(){
        var oliver = Oliver.getInstance();

        oliver.registrarAutor(1,"Somerville","29/10/1940");
        EstudiantePreferencia preferenciaEstudiante = new EstudiantePreferencia();
        preferenciaEstudiante.setTipo("Computer Sciense");
        ArrayList<EstudiantePreferencia> preferencias= new ArrayList<EstudiantePreferencia>();
        preferencias.add(preferenciaEstudiante);
        Estudiante estudiante = new Estudiante("Jose Casiano","casia@hot.com","98765432",preferencias);


        oliver.registrarEstudiante(1,estudiante.getNombre(),estudiante.getEmail(),estudiante.getCelular(),estudiante.getPreferencias());





    }
    @Test
    public void main() {
        Aplicacion.main(new String[0]);
        Assert.assertTrue(true);
    }

}
