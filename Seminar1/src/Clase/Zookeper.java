package Clase;

public class Zookeper {
	private String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void feed(Animal animal)
	{
		System.out.println(this.getNume()+" hraneste "+animal.getNume());
	}

	public Zookeper(String nume) {
		super();
		this.nume = nume;
	}
	
	
}
