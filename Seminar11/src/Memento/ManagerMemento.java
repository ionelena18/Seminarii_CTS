package Memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento> mementoList;

    public ManagerMemento() {
        mementoList=new ArrayList<Memento>();
    }
    public void adaugaMemento(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int index){
        if(index<mementoList.size() && index>=0){
            return mementoList.get(index);
        }
        return null;
    }
    public Memento cereUltimulMemento(){
        return mementoList.get(mementoList.size()-1);
    }
}
