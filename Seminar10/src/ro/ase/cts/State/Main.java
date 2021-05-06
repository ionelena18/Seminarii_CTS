package ro.ase.cts.State;

public class Main {
    public static void main(String[] args) {
        Masa masa=new Masa(25);
        masa.elibereazaMasa();

        masa.rezervaMasa();

        masa.rezervaMasa();
        masa.ocupaMasa();

    }
}
