package ro.ase.cts.main;

import ro.ase.cts.clase.ClinicaVeterinaraLazy;

public class Program {
    public static void main(String[] args) {
//        ClinicaVeterinara clinicaVeterinara1=ClinicaVeterinara.getInstance();
//        ClinicaVeterinara clinicaVeterinara2=ClinicaVeterinara.getInstance();
//        System.out.println(clinicaVeterinara1);
//        System.out.println(clinicaVeterinara2);

        ClinicaVeterinaraLazy clinicaVeterinara1=ClinicaVeterinaraLazy.getInstance("ClinVet","Strada Independenti",42,455.25F);
        ClinicaVeterinaraLazy clinicaVeterinara2=ClinicaVeterinaraLazy.getInstance("Sante","Libertatii",50,500.5F);
        System.out.println(clinicaVeterinara1);
        System.out.println(clinicaVeterinara2);
    }
}
