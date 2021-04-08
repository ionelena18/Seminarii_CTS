package ro.ase.cts.Facade.clase;

import ro.ase.cts.Facade.clase.Persoana;

class Politie {
    public static boolean esteUrmarit(Persoana persoana){
        if(Integer.parseInt(persoana.getCNP().charAt(12)+"")%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
