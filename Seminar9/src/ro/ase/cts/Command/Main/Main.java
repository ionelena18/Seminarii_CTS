package ro.ase.cts.Command.Main;

import ro.ase.cts.Command.Clase.*;

public class Main {
    public static void main(String[] args) {
        Masa masa=new Masa(1);
        Masa masa2=new Masa(2);
        Comanda comandaOcupare=new ComandaOcupare(masa);
        Comanda comandaRezervare=new ComandaRezervare(masa2);
        Comanda comandaRezervare1=new ComandaRezervare(masa2);
        Operator operator=new Operator();
        operator.invoca(comandaOcupare);
        operator.invoca(comandaRezervare);
        operator.executaComanda();
        operator.invoca(comandaRezervare1);

        operator.executaComanda();
        operator.executaComanda();

    }
}
