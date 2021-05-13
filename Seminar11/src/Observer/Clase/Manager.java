package Observer.Clase;

public class Manager extends ManagerSala {

    public void anuntaMeci(String tipSport){
        String mesaj="Are loc un meci de "+tipSport;
        super.notificaObservator(mesaj);
    }
}
