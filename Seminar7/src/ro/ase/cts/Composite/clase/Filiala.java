package ro.ase.cts.Composite.clase;

public class Filiala implements ISediu {
    private  String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sediu "+this.nume);
    }

    @Override
    public void addNod(ISediu sediu) {
        throw new IllegalArgumentException();
    }

    @Override
    public void stergeNod(ISediu sediu) {
        throw new IllegalArgumentException();
    }

    @Override
    public ISediu getNod(int position) {
        throw new IllegalArgumentException();
    }
}
