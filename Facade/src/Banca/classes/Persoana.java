package Banca.classes;

public class Persoana {
    private String nume;
    private String CNP;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public Persoana(String nume, String CNP) {
        this.nume = nume;
        this.CNP = CNP;
    }
    public int getVarsta(){
        int an=0;
        if(CNP.charAt(0)=='1'|| CNP.charAt(0)=='2')
            an=(1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
        if(CNP.charAt(0)=='3'|| CNP.charAt(0)=='4')
            an=(1800 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
        if(CNP.charAt(0)=='5'|| CNP.charAt(0)=='6')
            an=(2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
        return 2021-an;
    }
}
