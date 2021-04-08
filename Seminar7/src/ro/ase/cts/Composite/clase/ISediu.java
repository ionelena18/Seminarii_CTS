package ro.ase.cts.Composite.clase;

public interface ISediu {
    public void afiseazaDescriere();
    public void addNod(ISediu sediu);
    public void stergeNod(ISediu sediu);
    public ISediu getNod(int position);
}
