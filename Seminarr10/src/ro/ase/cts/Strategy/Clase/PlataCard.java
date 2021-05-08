package ro.ase.cts.Strategy.Clase;

public class PlataCard implements IPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("A fost realizata cu cardul plata cu cardul pt suma de"+suma +" lei");
    }
}
