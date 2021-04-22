package ro.ase.cts.Command.Clase;

public class Masa {
    private int numarMasa;
    private Boolean esteOcupata;
    private Boolean esteRezervata;

    public Masa(int numarMasa) {
        this.numarMasa = numarMasa;
        this.esteOcupata = false;
        this.esteRezervata = false;
    }

    public void ocupaMasa(){
        if(!this.esteOcupata)
        {
            this.esteOcupata=true;
            System.out.println("Ocupam masa");
        }
        else {
            System.out.println("Masa nu poate fi ocupata");
        }
    }

    public void  rezervaMasa(){
        if(!this.esteRezervata)
        {
            System.out.println("Masa poate fi rezervata");
            this.esteRezervata=true;
        }
        else {
            System.out.println("Masa nu poate fi rezervata");
        }
    }

}
