package ro.ase.cts.Facade.clase;

public class VerficaFacade {
    public static boolean esteEligibila(Persoana persoana){
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
