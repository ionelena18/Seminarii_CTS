package ro.ase.cts.Flyweight.Main;

import ro.ase.cts.Flyweight.Clase.Client;
import ro.ase.cts.Flyweight.Clase.FlyweightFactory;
import ro.ase.cts.Flyweight.Clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1=new Rezervare(10,5,12);
        Rezervare rezervare2=new Rezervare(42,6,22);
        Rezervare rezervare3=new Rezervare(19,4,15);
        Rezervare rezervare4=new Rezervare(15,2,13);

        FlyweightFactory flyweightFactory =new FlyweightFactory();
        Client client1= (Client) flyweightFactory.getFactory("07225647");
        client1.printeazaRezervare(rezervare1);
        flyweightFactory.getFactory("07225647").printeazaRezervare(rezervare2);

        flyweightFactory.getFactory("0788888").printeazaRezervare(rezervare3);
        flyweightFactory.getFactory("0788888").printeazaRezervare(rezervare4);
    }
}
