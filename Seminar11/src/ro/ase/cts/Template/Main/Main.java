package ro.ase.cts.Template.Main;

import ro.ase.cts.Template.Clase.Spectator;
import ro.ase.cts.Template.Clase.SpectatorAbstract;
import ro.ase.cts.Template.Clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        SpectatorAbstract spectator=new Spectator("Ionescu");
        spectator.intrareInStadion();
        System.out.println("------");
        SpectatorAbstract spectatorVIP=new SpectatorVIP("Elena ");
        spectatorVIP.intrareInStadion();
    }
}
