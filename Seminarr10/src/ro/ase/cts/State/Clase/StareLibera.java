package ro.ase.cts.State.Clase;

public class StareLibera implements State{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getState() instanceof StareLibera){
            System.out.println("Nu putem sa eliberam masa");
        }
        else {
            masa.setState(this);
            System.out.println("Masa cu numarul "+ masa.getNrMasa() +" a fost eliberata");

        }
    }
}
