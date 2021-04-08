package ro.ase.cts.Facade.Main;

import ro.ase.cts.Facade.clase.Persoana;
import ro.ase.cts.Facade.clase.VerficaFacade;

public class Main {
    public static void main(String[] args) {
        Persoana persoana=new Persoana("Alin","1951015252675");
       if( VerficaFacade.esteEligibila(persoana)){
           System.out.println("Persoana este eligibila pt credit");

       }
       else
       {
           System.out.println("Persoana nu este eligibila pt credit" +
                   "");
       }
    }
}
