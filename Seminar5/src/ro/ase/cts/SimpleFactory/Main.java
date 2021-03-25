package ro.ase.cts.SimpleFactory;

import ro.ase.cts.SimpleFactory.Clase.FactoryPersonal;
import ro.ase.cts.SimpleFactory.Clase.PersonalSpital;
import ro.ase.cts.SimpleFactory.Clase.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal=new FactoryPersonal();
        PersonalSpital asistent=factoryPersonal.createPersonal(TipPersonal.Asistent,"Ion");
        PersonalSpital medic=factoryPersonal.createPersonal(TipPersonal.Medic,"Ana");
        System.out.println(asistent);
        System.out.println(medic);
    }
}
