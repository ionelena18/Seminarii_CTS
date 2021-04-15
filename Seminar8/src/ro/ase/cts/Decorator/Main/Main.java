package ro.ase.cts.Decorator.Main;

import ro.ase.cts.Decorator.Clase.DecoratorAbstract;
import ro.ase.cts.Decorator.Clase.DecoratorCuLaMultiAni;
import ro.ase.cts.Decorator.Clase.DecoratorPaste;
import ro.ase.cts.Decorator.Clase.NotaPlata;

public class Main {
    public static void main(String[] args) {
        NotaPlata notaPlata=new NotaPlata(20);
        notaPlata.printeaza();

        DecoratorCuLaMultiAni decoratorCuLaMultiAni=new DecoratorCuLaMultiAni(notaPlata);
        decoratorCuLaMultiAni.printeazaFelicitare();
        System.out.println("");
        decoratorCuLaMultiAni.printeaza();

        DecoratorPaste decoratorPaste=new DecoratorPaste(notaPlata);

        decoratorPaste.printeaza();


        NotaPlata notaPlata1=new NotaPlata(200);
        DecoratorCuLaMultiAni decoratorCuLaMultiAni1=new DecoratorCuLaMultiAni(notaPlata);
        DecoratorAbstract decoratorPaste2=new DecoratorPaste(decoratorCuLaMultiAni1);
        decoratorPaste2.printeaza();
    }
}
