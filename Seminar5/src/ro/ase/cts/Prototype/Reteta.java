package ro.ase.cts.Prototype;

public class Reteta implements PrototipAbstract{
    private String denumireSolutie;
    private int canitateSolutie;

    public Reteta(String denumireSolutie, int canitateSolutie) {
        //validari
        this.denumireSolutie = denumireSolutie;
        this.canitateSolutie = canitateSolutie;
    }

    private Reteta() {
        //nu mai face validari
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireSolutie='").append(denumireSolutie).append('\'');
        sb.append(", canitateSolutie=").append(canitateSolutie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public PrototipAbstract copiaza() {
        Reteta copie=new Reteta();
        copie.canitateSolutie=this.canitateSolutie;
        copie.denumireSolutie=this.denumireSolutie;
        return copie;
    }
}
