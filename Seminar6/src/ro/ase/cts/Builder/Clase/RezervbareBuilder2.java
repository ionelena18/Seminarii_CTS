package ro.ase.cts.Builder.Clase;

public class RezervbareBuilder2 implements AbstractBuilder{
    private int codRezervare;
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areMuzicaAmbientala;
    private  boolean areBautura;
    private String genMuzica;

    public RezervbareBuilder2() {
        this.codRezervare = 100;
        this.areMancare = false;
        this.areScaunErgonomic = false;
        this.areMuzicaAmbientala = false;
        this.areBautura = false;
        this.genMuzica = "";
    }

    public RezervbareBuilder2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public RezervbareBuilder2 setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
        return this;
    }

    public RezervbareBuilder2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public RezervbareBuilder2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public RezervbareBuilder2 setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
        return this;
    }

    public RezervbareBuilder2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare,areMancare,areScaunErgonomic,areMuzicaAmbientala,areBautura,genMuzica);
    }
}
