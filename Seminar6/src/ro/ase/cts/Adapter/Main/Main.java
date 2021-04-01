package ro.ase.cts.Adapter.Main;

import ro.ase.cts.Adapter.Clase.Bilet;
import ro.ase.cts.Adapter.Clase.BiletAdapter;
import ro.ase.cts.Adapter.Clase.BiletAdaptorClase;
import ro.ase.cts.Adapter.Clase.EBiletOnline;

public class Main {
    public static void rezervaSiVindeBiletOnline(EBiletOnline eBiletOnline){
        eBiletOnline.rezervaBiletOnline();
        eBiletOnline.vindeBiletOnline();
    }
    private static void rezervaSiVindeBiletLaCasa(Bilet bilet){
        bilet.rezervare();
        bilet.vanzare();
    }
    public static void main(String[] args) {
        Bilet bilet=new Bilet(25.5F);
        rezervaSiVindeBiletLaCasa(bilet);

        EBiletOnline eBiletOnline=new BiletAdapter(bilet);

        eBiletOnline.rezervaBiletOnline();
        eBiletOnline.vindeBiletOnline();

        EBiletOnline eBiletOnline1=new BiletAdaptorClase(25);
        eBiletOnline.rezervaBiletOnline();
        eBiletOnline.vindeBiletOnline();

    }
}
