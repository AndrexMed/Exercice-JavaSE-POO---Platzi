package UI;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import model.Doctor;

/**
 *
 * @author giova
 */
public class UIPatientMenu {
    
    public static void showPatientMenu(){
        int response = 0;
        do {            
            
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome " + UIMenu.patientLogged);
            System.out.println("1. Book and Appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");
            
            Scanner sc = new Scanner(System.in);
            response=Integer.valueOf(sc.nextLine());
            
            switch (response){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 0:
                UIMenu.showMenu(); //Regresar al menu
                break;
            }
        } while (response != 0);
    }
    
    private static void showBookAppointmentMenu(){
        int response = 0;
        do {            
            System.out.println("::Book an appointment");
            System.out.println("::Select a date");
            //numeracion de la lista de fechas
            //Indice de fecha seleccionada
            //[doctors] lista de doctores traida de la clase Doctor
            //doctor 1
            //doctor 2
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) { // For i busca las fechas discponibles y los almacena en esta collection.
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
           
            Map<Integer, Doctor> doctorAppointment = new TreeMap<>();
            
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointment.put(Integer.valueOf(j), UI.UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointment);
                }
            }
            
            Scanner sc = new Scanner(System.in);
            int responseDataSelected=Integer.valueOf(sc.nextLine());
            
        } while (response != 0);
    }
}
