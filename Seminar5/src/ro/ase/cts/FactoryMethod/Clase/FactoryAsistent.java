package ro.ase.cts.FactoryMethod.Clase;

import ro.ase.cts.FactoryMethod.Clase.Asistent;
import ro.ase.cts.FactoryMethod.Clase.IFactory;
import ro.ase.cts.FactoryMethod.Clase.PersonalSpital;

public class FactoryAsistent implements IFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Asistent(nume);
    }
}
