package ro.ase.cts.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements ISediu {
    List<ISediu> listaSedii ;

    public Agentie() {
        this.listaSedii=new ArrayList<>();
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Este o agentie cu filiale");
        for (ISediu sediu : listaSedii) {
            sediu.afiseazaDescriere();
        }
    }

    @Override
    public void addNod(ISediu sediu) {
        this.listaSedii.add(sediu);
    }

    @Override
    public void stergeNod(ISediu sediu) {
        this.listaSedii.remove(sediu);

    }

    @Override
    public ISediu getNod(int position) {
        return this.listaSedii.get(position);
    }
}
