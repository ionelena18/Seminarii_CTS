package ro.ase.cts.State.Clase;

public class StareRezervata implements State{
    @Override
    public void modificaStare(Masa masa) {
            if(masa.getState() instanceof StareLibera){
                System.out.println("Masa cu numarul"+masa.getNrMasa()+ "este " +"rezervata");
                masa.setState(this);
            }
            else {
                System.out.println("Nu putem rezerva masa cu numarul "+masa.getNrMasa() );
            }
    }
}
