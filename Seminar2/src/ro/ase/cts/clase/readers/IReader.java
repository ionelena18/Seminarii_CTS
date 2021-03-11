package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class IReader {
	protected String filePath;
	public IReader(String filePath)
	{
		this.filePath=filePath;
	}
	public abstract List<Aplicant> citesteAplicant() throws FileNotFoundException,NumberFormatException;
	public void citireAplicant(java.util.Scanner input,Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[nr];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();

		aplicant.setNume(nume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setPrenume(prenume);
		aplicant.setNr_proiecte(nr);
		aplicant.setDenumiriProiecte(vect, nr);

	}
}
