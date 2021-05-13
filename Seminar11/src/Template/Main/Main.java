package Template.Main;

import Template.Clase.Spectator;
import Template.Clase.SpectatorAbstract;
import Template.Clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        SpectatorAbstract spectator=new Spectator("Ionescu");
        spectator.intrareInStadion();
        System.out.println("------");
        SpectatorAbstract spectatorVIP=new SpectatorVIP("Elena ");
        spectatorVIP.intrareInStadion();
    }
}
