package ro.ase.cts.Composite.Main;

import ro.ase.cts.Composite.clase.Agentie;
import ro.ase.cts.Composite.clase.Filiala;

public class Main {
    public static void main(String[] args) {
        Agentie agentie1 = new Agentie();
        Agentie agentie2 = new Agentie();
        Agentie agentie3=new Agentie();

        Filiala filiala1 = new Filiala("filiala1");
        Filiala filiala2 = new Filiala("filiala2");
        Filiala filiala3 = new Filiala("filiala3");
        Filiala filiala4 = new Filiala("filiala4");
        agentie1.addNod(filiala1);
        agentie1.addNod(filiala2);

        agentie2.addNod(filiala3);
        agentie3.addNod(filiala4);
        agentie1.addNod(agentie3);


        agentie3.stergeNod(filiala4);
        agentie1.stergeNod(agentie3);
        agentie1.addNod(filiala4);


        System.out.println("Agentie1");
        agentie1.afiseazaDescriere();
        System.out.println("Agentia2");
        agentie2.afiseazaDescriere();


    }




}
