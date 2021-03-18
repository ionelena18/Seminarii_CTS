package ro.ase.cts.main;

import ro.ase.cts.clase.ClinicaVeterinaraLazy;

import ro.ase.cts.exercitiu.Proiect;

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


        clinicaVeterinara1.setNume("Clinica 1");
        clinicaVeterinara2.setNrMedici(45);
        System.out.println(clinicaVeterinara1);
        System.out.println(clinicaVeterinara2);

        Proiect proiect1=Proiect.getInstance("VIP","Marketing",25);
        Proiect proiect2=Proiect.getInstance("TedTalks","IT",35);

        System.out.println(proiect1);
        System.out.println(proiect2);

        proiect1.setDepartament("Finante");
        proiect2.setDenumire("LocalBuget");

        System.out.println(proiect1);
        System.out.println(proiect2);


    }
}
