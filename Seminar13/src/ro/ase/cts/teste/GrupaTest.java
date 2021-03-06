package ro.ase.cts.teste;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.categorii.ConstructorGrupeCategory;
import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.categorii.TesteUrgenteCategorii;
import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;
import ro.ase.cts.classes.Student;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    @Category(ConstructorGrupeCategory.class)
    public void testConstructorNrGrupaCorect(){
        Grupa grupa=new Grupa(1081);
        assertEquals(1081,grupa.getNrGrupa());
    }
    @Test
    @Category(ConstructorGrupeCategory.class)
    public void testExistenceConstructor(){
        Grupa grupa=new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    @Test
    @Category(ConstructorGrupeCategory.class)
    public void testConstructorBoundaryGrupaLimitaInf(){
        Grupa grupa=new Grupa(1000);
        assertEquals(1000,grupa.getNrGrupa());
    }
    @Test
    @Category(ConstructorGrupeCategory.class)
    public void testConstructorBoundaryGrupaLimitaSup(){
        Grupa grupa=new Grupa(1100);
        assertEquals(1100,grupa.getNrGrupa());
    }


    @Test(expected = IllegalArgumentException.class)
    @Category(ConstructorGrupeCategory.class)
    public void testConstructorExceptieLimitaInf(){
        Grupa grupa=new Grupa(900);

    }
    @Test(expected = IllegalArgumentException.class)
    @Category(ConstructorGrupeCategory.class)
    public void testConstructorExceptieLimitaSup(){
        Grupa grupa=new Grupa(1101);

    }
    @Test(timeout = 500)
    @Category(ConstructorGrupeCategory.class)
    public void testPerformanceConstructor(){
        Grupa grupa=new Grupa(1091);
    }

    @Test
    @Category({GetPromovabilitateCategory.class, TesteUrgenteCategorii.class})
    public void testGetPromovabilitateRight(){
        Grupa grupa=new Grupa(1081);
        for(int i=0;i<10;i++){
            IStudent student=new Student();
            student.adaugaNota(5);
            student.adaugaNota(10);
            student.adaugaNota(8);
            grupa.adaugaStudent(student);
        }

        for(int i=0;i<5;i++){
            IStudent student=new Student();
            student.adaugaNota(3);
            student.adaugaNota(3);
            student.adaugaNota(2);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.66F,grupa.getPromovabilitate(),0.1);

    }
    @Test
    @Category(GetPromovabilitateCategory.class)
    public void testPromovabilitateLimitaInf(){
        Grupa grupa=new Grupa(1001);
        for(int i=0;i<5;i++){
            IStudent student=new Student();
            student.adaugaNota(2);
            grupa.adaugaStudent(student);
        }
        assertEquals(0,grupa.getPromovabilitate(),0.1);

    }
    @Test
    @Category(GetPromovabilitateCategory.class)
    public void testPromovabilitateLimitaSup(){
        Grupa grupa=new Grupa(1091);
        for(int i=0;i<5;i++){
            IStudent student=new Student();
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        }
        assertEquals(1,grupa.getPromovabilitate(),0.1);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    @Category(GetPromovabilitateCategory.class)
    public void testGetPromovabilitateErori(){
        Grupa grupa=new Grupa(1081);
        grupa.getPromovabilitate();
    }

    @Test
    @Category(GetPromovabilitateCategory.class)
    public void testGetPromovabiliatateCardinality1(){
        Grupa grupa=new Grupa(1081);
        IStudent student=new Student();
        student.adaugaNota(10);
        student.adaugaNota(10);
        grupa.adaugaStudent(student);
        assertEquals(1,grupa.getPromovabilitate(),0.1);
    }


}