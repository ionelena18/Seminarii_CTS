package ro.ase.cts.teste;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.categorii.TesteUrgenteCategorii;
import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;
import ro.ase.cts.classes.Student;

import static org.junit.Assert.*;

public class TesteGrupaCuFixture {
    private Grupa grupa;
    @Before
    public void setUp(){
        this.grupa=new Grupa(1001);
        for(int i=0;i<15;i++){
            IStudent student=new Student();
            student.adaugaNota(3);
            this.grupa.adaugaStudent(student);
        }
        for(int i=0;i<20;i++){
            IStudent student=new Student();
            student.adaugaNota(5);
            this.grupa.adaugaStudent(student);
        }
    }
    @Test(timeout = 500)
    @Category({GetPromovabilitateCategory.class, TesteUrgenteCategorii.class})
    public void testGetPromovabilitate35Studenti(){
        this.grupa.getPromovabilitate();
    }
}