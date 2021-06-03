package ro.ase.cts.Template.Clase;

public class SpectatorVIP extends SpectatorAbstract{

    private String nume;

    public SpectatorVIP(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println(this.nume+"nu a mai stat la coada pt ca e VIP");
    }

    @Override
    public void prezentareBilet() {
        System.out.println(this.nume+" a prezentat biletul VIP");

    }

    @Override
    public void realizareControlCorporal() {
        System.out.println(this.nume+" e controlat");

    }

    @Override
    public void ocupaLoc() {
        System.out.println(this.nume+"ocupa locul de VIP");
    }
}
