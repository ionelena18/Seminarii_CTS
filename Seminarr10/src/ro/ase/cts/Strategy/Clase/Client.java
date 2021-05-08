package ro.ase.cts.Strategy.Clase;

public class Client {
    private IPlata plata;
    private String nume;

    public Client(String nume) {
        this.nume = nume;
        this.plata=new PlataCard();
    }


    public void setPlata(IPlata plata) {
        this.plata = plata;
    }


    public void plateste(float suma) {
        plata.plateste(suma);
    }
}
