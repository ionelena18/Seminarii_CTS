package ro.ase.cts.teste;

import org.junit.Test;
import ro.ase.cts.classes.Grupa;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    public void testConstructorNrGrupaCorect(){
        Grupa grupa=new Grupa(1081);
        assertEquals(1081,grupa.getNrGrupa());
    }
    @Test
    public void testExistenceConstructor(){
        Grupa grupa=new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    @Test
    public void testConstructorBoundaryGrupaLimitaInf(){
        Grupa grupa=new Grupa(1000);
        assertEquals(1000,grupa.getNrGrupa());
    }
    @Test
    public void testConstructorBoundaryGrupaLimitaSup(){
        Grupa grupa=new Grupa(1100);
        assertEquals(1100,grupa.getNrGrupa());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testConstructorExceptieLimitaInf(){
        Grupa grupa=new Grupa(900);

    }
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorExceptieLimitaSup(){
        Grupa grupa=new Grupa(1101);

    }
    @Test(timeout = 500)
    public void testPerformanceConstructor(){
        Grupa grupa=new Grupa(1091);

    }
}