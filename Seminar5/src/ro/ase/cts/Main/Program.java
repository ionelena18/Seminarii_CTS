package ro.ase.cts.Main;

import ro.ase.cts.Clase.Asistent;
import ro.ase.cts.Clase.FactoryPersonal;
import ro.ase.cts.Clase.PersonalSpital;
import ro.ase.cts.Clase.TipPersonal;

public class Program {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal=new FactoryPersonal();
        Asistent asistent= (Asistent) factoryPersonal.createPersona(TipPersonal.Asistent,"Ionel");
        PersonalSpital medic=factoryPersonal.createPersona(TipPersonal.Medic,"Vasile");
        System.out.println(asistent);
        System.out.println(medic);
    }
}
