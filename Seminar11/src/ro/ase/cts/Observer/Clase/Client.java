package ro.ase.cts.Observer.Clase;

public class Client implements IObservator{

    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.nume+" a primit mesajul "+mesaj);
    }
}
