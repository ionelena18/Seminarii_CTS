package ro.ase.cts.exercitiu;

public class Proiect {
    private String denumire;
    private String departament;
    private int puncte;
    private static Proiect instance=null;

    private Proiect(String denumire, String departament, int puncte) {
        this.denumire = denumire;
        this.departament = departament;
        this.puncte = puncte;
    }

    public static synchronized Proiect getInstance(String denumire, String departament, int puncte){
        if(instance==null){
            instance=new Proiect(denumire,departament,puncte);
        }
        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getPuncte() {
        return puncte;
    }

    @Override
    public String toString() {
        return "Proiect{" +
                "denumire='" + denumire + '\'' +
                ", departament='" + departament + '\'' +
                ", puncte=" + puncte +
                '}';
    }
}
