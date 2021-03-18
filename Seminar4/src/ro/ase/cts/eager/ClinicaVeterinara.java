package ro.ase.cts.eager;

public class ClinicaVeterinara {
    private String nume;
    private String adresa;
    private int nrMedici;
    private float buget;
    //eager-intialization--presupune ca initializare se face la momentul declararii
    private static final ClinicaVeterinara clinicaVeterinara=new ClinicaVeterinara("VET","Strada Dorobanti",
            25,255.6F);

    //constructorul obligatoriu trebuie sa fie private
    private ClinicaVeterinara(String nume, String adresa, int nrMedici, float buget) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrMedici = nrMedici;
        this.buget = buget;
    }

    //metoda statica care va returna instanta
    public static ClinicaVeterinara getInstance(){
        return clinicaVeterinara;
    }

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

    @Override
    public String toString() {
        return "ClinicaVeterinara{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", nrMedici=" + nrMedici +
                ", buget=" + buget +
                '}';
    }


}
