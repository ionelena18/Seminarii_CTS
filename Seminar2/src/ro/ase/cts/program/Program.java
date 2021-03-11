package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.*;
import ro.ase.cts.clase.readers.IReader;
import ro.ase.cts.clase.readers.ReaderAngajati;

public class Program {
	public static List<Aplicant> citesteAplicanti(IReader ireader) throws FileNotFoundException, NumberFormatException {
		// TODO Auto-generated method stub
		return ireader.citesteAplicant();
	}
	public static void main(String[] args) {
		System.out.println("Suma finantata pentru studenti: "+Student.getSumaFinantata());
		System.out.println("Suma finantata pentru elevi: "+Elev.getSUmaFinantata());
		System.out.println("Suma finantata pentru angajati"+Angajat.getSumaFinantata());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new ReaderAngajati("angajati.txt"));
			Proiect proiect = new Proiect(81);
			listaAplicanti =  citesteAplicanti(new ReaderAngajati("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantare());

				aplicant.afisareRaspunsProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
