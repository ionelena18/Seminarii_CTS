package ro.ase.cts.Proxy.Main;

import ro.ase.cts.Proxy.Clase.Moneda;
import ro.ase.cts.Proxy.Clase.OperatorCredite;
import ro.ase.cts.Proxy.Clase.OperatorCrediteProxy;

public class Main {
    public static void main(String[] args) {
        OperatorCredite operatorCredite=new OperatorCredite();
        operatorCredite.creareCredit(Moneda.EUR,15000);

        OperatorCrediteProxy operatorCrediteProxy=new OperatorCrediteProxy(operatorCredite);
        operatorCrediteProxy.creareCredit(Moneda.EUR,1200);
        operatorCrediteProxy.creareCredit(Moneda.RON,5000);
    }
}
