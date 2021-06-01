package Banca.main;

import Banca.classes.Persoana;
import Banca.classes.VerificaFacade;

public class Main {
    public static void main(String[] args) {
        Persoana persoana=new Persoana("Elena","2990817521011");
        if(VerificaFacade.esteEligibilPtCredit(persoana)){
            System.out.println("Persoana este eligibila pentru credit");
        }
        else {
            System.out.println("Persoana nu este eligibila pentru credit");
        }

    }
}
