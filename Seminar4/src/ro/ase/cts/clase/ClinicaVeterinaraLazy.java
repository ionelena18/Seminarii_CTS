package ro.ase.cts.clase;

public class ClinicaVeterinaraLazy {
    private String nume;
    private String adresa;
    private int nrMedici;
    private float buget;

    //la lazy nu ne mai intializam instanta la momentul declararii
    //la singleton,constructorul se apeleaza o singura data
    private static ClinicaVeterinaraLazy instanta=null;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getNrMedici() {
        return nrMedici;
    }

    public void setNrMedici(int nrMedici) {
        this.nrMedici = nrMedici;
    }

    public float getBuget() {
        return buget;
    }

    public void setBuget(float buget) {
        this.buget = buget;
    }

    public ClinicaVeterinaraLazy(String nume, String adresa, int nrMedici, float buget) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrMedici = nrMedici;
        this.buget = buget;
    }
    //putem primii drept parametri acum din afara despre
    // cum ne putem creea aaceasta instanta
    public static synchronized ClinicaVeterinaraLazy getInstance(String nume, String adresa, int nrMedici, float buget){
        if(instanta==null){
            instanta=new ClinicaVeterinaraLazy(nume,adresa,nrMedici,buget);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "ClinicaVeterinaraLazy{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", nrMedici=" + nrMedici +
                ", buget=" + buget +
                '}';
    }
}
