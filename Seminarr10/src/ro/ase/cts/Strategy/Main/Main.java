package ro.ase.cts.Strategy.Main;


import ro.ase.cts.Strategy.Clase.Client;
import ro.ase.cts.Strategy.Clase.PlataCard;
import ro.ase.cts.Strategy.Clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Ana");
        client.setPlata(new PlataCash());
        client.plateste(20);

        client.setPlata(new PlataCard());
        client.plateste(30);
    }
}
