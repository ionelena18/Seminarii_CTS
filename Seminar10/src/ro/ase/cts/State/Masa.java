package ro.ase.cts.State;

public class Masa {
    private State state;
    private int nrMasa;

    public int getNrMasa() {
        return nrMasa;
    }



    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.state=new StareLibera();
    }

    public State getState() {
        return state;
    }

     void setState(State state) {
        this.state = state;
    }
    public void elibereazaMasa(){
        StareLibera stareLibera=new StareLibera();
        stareLibera.modificaStare(this);
    }
    public void rezervaMasa(){
        StareRezervata stareRezervata=new StareRezervata();
        stareRezervata.modificaStare(this);
    }
    public void ocupaMasa(){
            StareOcupata stareOcupata=new StareOcupata();
            stareOcupata.modificaStare(this);
    }
}
