package ro.ase.cts.Adapter.Clase;

public class BiletAdapter implements EBiletOnline{
    private Bilet bilet;
    public BiletAdapter(Bilet bilet){
        this.bilet=bilet;
    }
    @Override
    public void vindeBiletOnline() {
        this.bilet.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
        this.bilet.vanzare();
    }
}
