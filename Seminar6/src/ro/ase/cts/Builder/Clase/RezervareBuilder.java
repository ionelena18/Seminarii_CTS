package ro.ase.cts.Builder.Clase;

public class RezervareBuilder implements AbstractBuilder {
    private Rezervare rezervare;
    public RezervareBuilder setCodRezervare(int codRezervare){
        rezervare.setCodRezervare(codRezervare);
        return this;
    }
    public RezervareBuilder setAreMancare(boolean areMancare){
        rezervare.setAreMancare(areMancare);
        return this;
    }

    public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala){
        this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
        return this;
    }
    public RezervareBuilder setAreBautura(boolean areBautura){
        this.rezervare.setAreBautura(areBautura);
        return this;
    }
    public RezervareBuilder setScaunErgonomica(boolean areScaunErgonomic){
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }
    public RezervareBuilder setGenMuzica(String genMuzica){
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    public RezervareBuilder() {
        this.rezervare = new Rezervare(1,true,false,true,true,"Clasica");
    }

    public RezervareBuilder(int cod){
        this.rezervare = new Rezervare(cod,true,false,true,true,"Clasica");
    }
    @Override
    public Rezervare build() {
        return this.rezervare;
    }
}
