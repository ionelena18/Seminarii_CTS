package ro.ase.cts.Chain.Main;


import ro.ase.cts.Chain.Clase.Client;
import ro.ase.cts.Chain.Clase.Notificator;
import ro.ase.cts.Chain.Clase.NotificatorEmail;
import ro.ase.cts.Chain.Clase.NotificatorSMS;

public class Main {
    public static void main(String[] args) {
        Client client1=new Client("Ion",null,null);
        Client client2=new Client("Maria","072257893",null);
        Client client3=new Client("Ana",null,"ana2@gmail.com");

        NotificatorSMS notificatorSMS=new NotificatorSMS();
        NotificatorEmail notificatorEmail=new NotificatorEmail();
        notificatorSMS.setNotificator(notificatorEmail);
        notificatorSMS.trimiteNotificare(client2,"Mesaj1");
    }
}
