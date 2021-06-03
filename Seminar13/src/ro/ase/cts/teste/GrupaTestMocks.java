package ro.ase.cts.teste;

import org.junit.Test;
import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;
import ro.ase.cts.classes.Student;
import ro.ase.cts.mocks.DummyStudent;
import ro.ase.cts.mocks.FakeStudent;
import ro.ase.cts.mocks.StubStudent;

import static org.junit.Assert.*;

public class GrupaTestMocks {

    @Test
    public void testAdaugaStudent(){
        IStudent student=new DummyStudent();
        Grupa grupa=new Grupa(1081);
        grupa.adaugaStudent(student);
        assertEquals("Adaugare student",1,grupa.getStudenti().size());
    }
    @Test
    public void testGetPromovabilitate(){
        IStudent student=new StubStudent();
        Grupa grupa=new Grupa(1081);
        grupa.adaugaStudent(student);
        assertEquals(1,grupa.getPromovabilitate(),0.1);
    }

    @Test
    public void testPromovabilitateFakeStudent(){
        Grupa grupa=new Grupa(1081);
        for (int i=0;i<8;i++){
            FakeStudent fakeStudent=new FakeStudent();
            fakeStudent.setAreRestante(false);
            grupa.adaugaStudent(fakeStudent);
        }
        for (int i=0;i<2;i++){
            FakeStudent fakeStudent=new FakeStudent();
            fakeStudent.setAreRestante(true);
            grupa.adaugaStudent(fakeStudent);
        }
        assertEquals(0.8,grupa.getPromovabilitate(),0.01);

    }
}