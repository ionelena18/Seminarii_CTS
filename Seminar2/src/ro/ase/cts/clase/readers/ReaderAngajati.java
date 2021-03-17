package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class ReaderAngajati extends IReader {
	
	
	public ReaderAngajati(String filePath) {
		super(filePath);
		// TODO Auto-generated constructor stub
	}

	



	@Override
	public List<Aplicant> citesteAplicant() throws FileNotFoundException, NumberFormatException {
	
		Scanner inputAplicant = new Scanner(new File(super.filePath));
		inputAplicant.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<>();

		while (inputAplicant.hasNext()) {
			String nume = inputAplicant.next();
			String prenume = inputAplicant.next();
			int varsta = inputAplicant.nextInt();
			int punctaj = inputAplicant.nextInt();
			int nr = inputAplicant.nextInt();
			String[] vect = new String[5];
			for (int i = 0; i < nr; i++)
				vect[i] = inputAplicant.next();
			int salariu = inputAplicant.nextInt();
			String ocupatie = inputAplicant.next();
			Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
			angajati.add(a);
		}
		inputAplicant.close();
		return angajati;
	}
}
