package Clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private Zookeper zookeper;
	private List<Animal> animale;

	public Zoo() {
		animale = new ArrayList<Animal>();
		zookeper = new Zookeper("Ion");
	}

	public Zoo(Zookeper zookeper, List<Animal> animale) {
		super();
		this.zookeper = zookeper;
		this.animale = animale;
	}

	public void adaugaAnimal(Animal animal) {
		animale.add(animal);
	}

	public void feedAllAnimal() {
		for (Animal a : animale) {
			this.zookeper.feed(a);
		}
		;
	}
}
