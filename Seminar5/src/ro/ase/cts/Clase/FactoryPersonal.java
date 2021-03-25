package ro.ase.cts.Clase;

public class FactoryPersonal {

    public PersonalSpital createPersona(TipPersonal tipPersonal,String numeAngajat){
        switch (tipPersonal){
            case Brancardier:
                return new Brancardier(numeAngajat);
            case Asistent:
                return new Asistent(numeAngajat);
            case Medic:
                return new Medic(numeAngajat);
            default:
                 throw new IllegalArgumentException();
        }
    }

}
