package UI;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;
import model.Patient;

/**
 *
 * @author giova
 */
public class UIMenu {
    public static final String [] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
   public static Doctor doctorLogged;
   public static Patient patientLogged;
    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opcion deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }
    
    private static void authUser(int userType){
        // UserType = 1 Doctor
        // UserType = 2 Patient
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Nora Li","nora@mail.com"));
        doctors.add(new Doctor("Maria Fernanda","mafe@mail.com"));
        doctors.add(new Doctor("Juan sebastian","sebas@mail.com"));
        
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Jhon","jhon@mail.com"));
        patients.add(new Patient("Camilo","camilo@mail.com"));
        patients.add(new Patient("Alonso","alonso@mail.com"));
        
        boolean emailCorrect = false;
        do {            
            System.out.println("Insert your email: [abc@efg.com]"); 
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1) { // Si es doctor
                for (Doctor d: doctors){ // ciclo para recorrer arraylist de doctores y buscar correo electronico que recibio
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        //show doctor menu    
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if (userType==2) { // si es Paciente 
                for (Patient p: patients){
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        //Show patient menu
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        } while (!emailCorrect);
    }

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i+". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }
    

}
