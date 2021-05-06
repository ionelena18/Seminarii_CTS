package ro.ase.cts.Strategy.Clase;

public class PlataCash implements IPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("A fost realizata cash plata pt suma de "+suma+" lei");
    }
}
