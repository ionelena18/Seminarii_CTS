package ro.ase.cts.Builder.Main;

import ro.ase.cts.Builder.Clase.Rezervare;
import ro.ase.cts.Builder.Clase.RezervareBuilder;
import ro.ase.cts.Builder.Clase.RezervbareBuilder2;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        Rezervare rezervare1=rezervareBuilder.setCodRezervare(2)
                .setGenMuzica("Rock").build();
        System.out.println(rezervare1);

        Rezervare rezervare2=new RezervareBuilder().setCodRezervare(3)
                .setAreBautura(true)
                .setAreMuzicaAmbientala(true)
                .build();

        Rezervare rezervare3=new Rezervare(5,true,false,true,false,"Pop");
        Rezervare rezervare4=rezervareBuilder.build();
        rezervare4.setAreScaunErgonomic(true);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
        System.out.println(rezervare4);


        RezervbareBuilder2 rezervbareBuilderV2=new RezervbareBuilder2().setAreMancare(true).setAreScaunErgonomic(true).setAreMuzicaAmbientala(true);

        Rezervare rezervare5=rezervbareBuilderV2.setCodRezervare(200).build();
        Rezervare rezervare6=rezervbareBuilderV2.setCodRezervare(201).build();
    }


}
