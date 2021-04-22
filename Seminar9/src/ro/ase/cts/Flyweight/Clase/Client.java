package ro.ase.cts.Flyweight.Clase;

public class Client implements  Flyweight{
    private String nume;
    private String nrTelefon;
    private  String email;

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println("Client"+this.toString()+"Rezervare"+rezervare.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Client(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }
}
