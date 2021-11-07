package cs.ing.software.practica;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OliverTest {

    @Test
    public void testOliverEsSingleton(){
        var oliver = Oliver.getInstance();
        Assert.assertEquals(oliver, Oliver.getInstance());
    }

    @Test
    public void testRegistrarEstudiantes(){
        var oliver = Oliver.getInstance();

        Assert.assertEquals("Se registro con exito el estudiante: Jose Casiano-jose@utec.edu.pe-987654321", oliver.registrarEstudiante(1,"Jose Casiano", "jose@utec.edu.pe", "987654321",null));
        Assert.assertEquals("Se registro con exito el estudiante: Juan Perez-juan@utec.edu.pe-93456789", oliver.registrarEstudiante(2,"Juan Perez", "juan@utec.edu.pe", "93456789",null));

    }

    @Test
    public void testRegistrarLibros(){
        var oliver = Oliver.getInstance();

        Autor autor = new Autor("Somerville", "11/11/1959");

        Assert.assertEquals("Se registro con exito el libro: Software Engineering 8th edition-2009-10", oliver.registrarLibro(1,"Software Engineering 8th edition", "2009",  autor,10));
        Assert.assertEquals("Se registro con exito el libro: Software Engineering 9th edition-2010-10", oliver.registrarLibro(2,"Software Engineering 9th edition", "2010", autor,10));
        Assert.assertEquals("Se registro con exito el libro: Software Engineering 10th edition-2010-0", oliver.registrarLibro(3,"Software Engineering 10th edition", "2010", autor,0));
    }

    @Test
    public void testBuscarLibrosStock(){
        var oliver = Oliver.getInstance();

        Autor autor = new Autor("Somerville", "11/11/1959");

        Assert.assertEquals("0 del Software Engineering 9th edition", oliver.obtenerStock("Software Engineering 9th edition",autor));
        Assert.assertEquals("0 del Software Engineering 10th edition", oliver.obtenerStock("Software Engineering 10th edition",autor));

    }

    @Test
    public  void testNotificarEstudiantes(){
        var oliver = Oliver.getInstance();

        Autor autor = new Autor("Somerville", "11/11/1959");

        Assert.assertEquals("Se registro con exito el libro: Software Engineering 8th edition-2009-10", oliver.registrarLibro(1,"Software Engineering 8th edition", "2009",  autor,10));
        Assert.assertEquals("Se registro con exito el libro: Software Engineering 9th edition-2010-10", oliver.registrarLibro(2,"Software Engineering 9th edition", "2010", autor,10));

        List<String> preferencias = new ArrayList<String>();

        preferencias.add("Software Engineering");
        preferencias.add("Computer Science");

        Assert.assertEquals("Se registro con exito el estudiante: Jose Casiano-jose@utec.edu.pe-987654321", oliver.registrarEstudiante(1,"Jose Casiano", "jose@utec.edu.pe", "987654321",preferencias));
        Assert.assertEquals(1, oliver.noitificarEstudiantes().size());

    }




}
