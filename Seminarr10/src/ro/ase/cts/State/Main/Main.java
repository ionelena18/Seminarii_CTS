package ro.ase.cts.State.Main;

import ro.ase.cts.State.Clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa=new Masa(25);
        masa.elibereazaMasa();

        masa.rezervaMasa();

        masa.rezervaMasa();
        masa.rezervaMasa();
        masa.ocupaMasa();

    }
}
