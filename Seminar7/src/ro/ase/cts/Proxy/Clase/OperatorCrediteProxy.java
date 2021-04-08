package ro.ase.cts.Proxy.Clase;

public class OperatorCrediteProxy implements IOperatorCredit {
    OperatorCredite operatorCredite;

    public OperatorCrediteProxy(OperatorCredite operatorCredite) {
        this.operatorCredite = operatorCredite;
    }

    @Override
    public void creareCredit(Moneda moneda, int suma) {
        if (moneda == Moneda.RON) {
            operatorCredite.creareCredit(moneda, suma);
        } else {
            System.out.println("Banca in acest moment ofera credite doar in RON");
        }
    }
}
