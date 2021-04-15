package ro.ase.cts.Decorator.Clase;

public class NotaPlata implements INota{
    private int sumaDePlata;

    public NotaPlata(int sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
    }

    @Override
    public void printeaza() {
        System.out.println(String.format("S-a printat nota de plata cu suma:%d",sumaDePlata));

    }
}
