package ro.ase.cts.mocks;

import ro.ase.cts.classes.IStudent;

import java.util.List;

public class StubStudent implements IStudent {

    @Override
    public String getNume() {
        return "Gigel";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 6.7F;
    }

    @Override
    public int getNota(int index) {
        return 0;
    }

    @Override
    public boolean areRestante() {
        return false;
    }
}
