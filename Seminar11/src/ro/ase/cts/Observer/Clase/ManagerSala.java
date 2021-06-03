package ro.ase.cts.Observer.Clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSala {
        private List<IObservator> colectieObservatori;

    public ManagerSala() {
        colectieObservatori=new ArrayList<>();
    }

    public void adaugaObservator(IObservator observator){
        colectieObservatori.add(observator);
    }
    public void stergeObservator(IObservator observator){
        colectieObservatori.remove(observator);
    }

    public void notificaObservator(String mesaj){
        for(IObservator observator:colectieObservatori){
            observator.primesteMesaj(mesaj);
        }
    }
}
