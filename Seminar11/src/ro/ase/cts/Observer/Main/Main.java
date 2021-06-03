package ro.ase.cts.Observer.Main;

import ro.ase.cts.Observer.Clase.Client;
import ro.ase.cts.Observer.Clase.IObservator;
import ro.ase.cts.Observer.Clase.Manager;

public class Main {
    public static void main(String[] args) {
        IObservator client=new Client("Ion");
        IObservator client2=new Client("Elena");
        IObservator client3=new Client("Cristina");
        Manager manager=new Manager();
        manager.adaugaObservator(client);
        manager.adaugaObservator(client2);
        manager.adaugaObservator(client3);
        manager.anuntaMeci("Fotbal");

        manager.stergeObservator(client3);
        System.out.println("--Dupa ce am dezabonat-o pe cristina");
        manager.anuntaMeci("Volei");
    }
}
