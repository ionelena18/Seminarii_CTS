package ro.ase.cts.Decorator.Clase;

public abstract class DecoratorAbstract implements INota {
    private INota nota;

    public DecoratorAbstract(INota nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }
    public abstract void printeazaFelicitare();
}
