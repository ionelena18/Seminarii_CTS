package ro.ase.cts.eager;

public class ClinicaVeterinaraLazy {
    private String nume;
    private String adresa;
    private int nrMedici;
    private float buget;

    //la lazy nu ne mai intializam instanta la momentul declararii
    //la singleton,constructorul se apeleaza o singura data
    private static ClinicaVeterinaraLazy instanta=null;


    public ClinicaVeterinaraLazy(String nume, String adresa, int nrMedici, float buget) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrMedici = nrMedici;
        this.buget = buget;
    }
    //putem primii drept parametri acum din afara despre
    // cum ne putem creea aaceasta instanta
    public static  ClinicaVeterinaraLazy getInstance(String nume, String adresa, int nrMedici, float buget){
        if(instanta==null){
            instanta=new ClinicaVeterinaraLazy(nume,adresa,nrMedici,buget);
        }
        return instanta;
    }
}
