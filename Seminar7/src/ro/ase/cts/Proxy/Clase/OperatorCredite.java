package ro.ase.cts.Proxy.Clase;

public class OperatorCredite implements  IOperatorCredit{

    @Override
    public void creareCredit(Moneda moneda, int suma) {
        System.out.println("A fost oferit creditul in suma de" + suma+""+moneda);

    }
}
