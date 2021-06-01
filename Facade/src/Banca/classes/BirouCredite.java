package Banca.classes;

public class BirouCredite {
    public static boolean areCredite(Persoana persoana){
        return Integer.parseInt(""+persoana.getCNP().charAt(11))%2==0;
    }
}
