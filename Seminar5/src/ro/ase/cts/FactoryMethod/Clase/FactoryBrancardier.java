package ro.ase.cts.FactoryMethod.Clase;

public class FactoryBrancardier implements IFactory{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Brancardier(nume);
    }

}
