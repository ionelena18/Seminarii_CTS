package ro.ase.cts.Facade.clase;

import ro.ase.cts.Facade.clase.Persoana;

class BirouCredite {
    public static boolean areCredite(Persoana persoana){
        return Integer.parseInt(""+persoana.getCNP().charAt(11))%2==0;
    }
}
