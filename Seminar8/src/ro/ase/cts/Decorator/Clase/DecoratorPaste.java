package ro.ase.cts.Decorator.Clase;

public class DecoratorPaste extends DecoratorAbstract{

    public DecoratorPaste(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felcitare:Paste fericit");
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("Paste Fericit");
    }

}
