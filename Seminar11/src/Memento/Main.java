package Memento;

public class Main {
    public static void main(String[] args) {
        Meci meci=new Meci("Gazda","Oaspteti",200,180,12,5);
        ManagerMemento managerMemento=new ManagerMemento();
        managerMemento.adaugaMemento(meci.creareMemento());

        meci.setNrSpectatori(300);

        managerMemento.adaugaMemento(meci.creareMemento());

        System.out.println(meci);

        meci.seteazaMemento(managerMemento.getMemento(0));
        System.out.println(meci);


    }
}
