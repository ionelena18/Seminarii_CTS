package Pachet1;

import Clase.Girafa;
import Clase.Zoo;

public class Program {

	public static void main(String[] args) {
		
		Zoo zoo=new Zoo();
		Girafa girafa1=new Girafa("G1");
		Girafa girafa2=new Girafa("G2");
		zoo.adaugaAnimal(girafa2);
		zoo.adaugaAnimal(girafa1);
		zoo.feedAllAnimal();
	}
	

}
