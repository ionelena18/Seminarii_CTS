package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ReaderElevi extends IReader {

	public ReaderElevi(String filePath) {
		super(filePath);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public List<Aplicant> citesteAplicant() throws FileNotFoundException, NumberFormatException {
		Scanner input2 = new Scanner(new File(super.filePath));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<>();

		while (input2.hasNext()) {
			String nume = input2.next();
			String prenume = input2.next();
			int varsta = input2.nextInt();
			int punctaj = input2.nextInt();
			int nr = input2.nextInt();
			String[] vect = new String[5];
			for (int i = 0; i < nr; i++)
				vect[i] = input2.next();
			int clasa = input2.nextInt();
			String tutore = input2.next();
			Aplicant e =new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, tutore);
			elevi.add(e);
		}

		input2.close();
		return elevi;
	}
}
