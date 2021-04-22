package ro.ase.cts.Command.Clase;

public abstract class Comanda {
    public Comanda(Masa masa) {
        this.masa = masa;
    }

    protected Masa masa;
    public abstract void executa();

}
