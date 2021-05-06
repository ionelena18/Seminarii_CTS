package ro.ase.cts.State;

public class StareOcupata implements State{
    @Override
    public void modificaStare(Masa masa) {
            if(masa.getState() instanceof StareRezervata || masa.getState() instanceof StareLibera){
                masa.setState(this);
                System.out.println("Masa cu numarul "+masa.getNrMasa() +"este ocupata");
            }
            else {
                System.out.println("Nu putem ocupa masa");
            }
    }
}
