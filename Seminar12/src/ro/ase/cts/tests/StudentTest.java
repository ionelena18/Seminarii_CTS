package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.clase.Student;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class StudentTest {
    @Test
    public void testConstructorCuUnParametru(){
        //verificam daca un student a fost construit prin nume
        String nume="Gigel";
        Student student=new Student(nume);
        assertEquals(nume,student.getNume());

        //verificam daca are note
        assertNotNull(student.getNote());
        //sau
        //assertNotEquals(null,student.getNote());
    }

    @Test
    public void testConstructorFaraParametru(){
        Student student=new Student();
        assertNotNull(student.getNote());
        assertNotNull(student.getNume());
    }

    @Test
    public void testAdaugaNota(){
        Student student=new Student();
        int nota=5;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));

    }

    @Test
    public void testDimensiuneNote(){
        Student student=new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);
        assertEquals(2,student.getNote().size());
    }

    @Test
    public void testCalculeazaMedie(){
        Student student=new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);
        assertEquals(6.5F,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testCalculeazaMedieFaraNote(){
        Student student=new Student();
        assertEquals(0F,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testCalculeazaMedieCuONota(){
        Student student=new Student();
        student.adaugaNota(5);
        assertEquals(5,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testAreRestante(){
        Student student=new Student();
        student.adaugaNota(9);
        student.adaugaNota(3);
        assertTrue(student.areRestante());
    }

    @Test
    public void testNuAreRestante(){
        Student student=new Student();
        student.adaugaNota(9);
        student.adaugaNota(10);
        assertFalse(student.areRestante());
    }
}