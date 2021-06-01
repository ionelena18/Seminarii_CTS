package Banca.classes;

public class VerificaFacade {
    public static boolean esteEligibilPtCredit(Persoana persoana){
        if(persoana.getVarsta()>=18){
            if(!Politie.esteUrmarit(persoana)){
                if(!BirouCredite.areCredite(persoana)){
                    return true;
                }
            }
        }

            return false;

    }
}
