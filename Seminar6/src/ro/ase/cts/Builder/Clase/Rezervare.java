package ro.ase.cts.Builder.Clase;

public class Rezervare {
    private int codRezervare;
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areMuzicaAmbientala;
    private  boolean areBautura;
    private String genMuzica;


    public Rezervare(int codRezervare, boolean areMancare, boolean areScaunErgonomic, boolean areMuzicaAmbientala, boolean areBautura, String genMuzica) {
        this.codRezervare = codRezervare;
        this.areMancare = areMancare;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.areBautura = areBautura;
        this.genMuzica = genMuzica;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    public void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancare=").append(areMancare);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areMuzicaAmbientala=").append(areMuzicaAmbientala);
        sb.append(", areBautura=").append(areBautura);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
