
import model.Patient;
import model.Doctor;
import static UI.UIMenu.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import model.AppointmentDoctor;
import model.ISchedulable;
import model.User;

/**
 *
 * @author giova
 */
public class Main {

    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Giovanni Alzate", "gioandrex@mail.com");
        myDoctor.addAvailableAppointment(new Date(), " 7am");
        myDoctor.addAvailableAppointment(new Date(), " 10am");
        myDoctor.addAvailableAppointment(new Date(), " 2pm");
        
        System.out.println(myDoctor);
        
        User user = new Doctor("Alejandra","aleja@mail.com");
        user.showDataUser();
        
        User userPa = new Patient("Julieta","julieta@mail.com");
        userPa.showDataUser();
        
        User user1 = new User("Morgan","morgan@mail.com"){
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatria");
            }   
    };
        
        user1.showDataUser();
        
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {
                
            }
        };
        /*
        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointment()) {
            System.out.println(aA.getDate() + "" + aA.getTime());
        }
        *//*
        System.out.println("");
        Patient patient = new Patient("Alejandra", "aleja@mail.com");
        System.out.println(patient);*/
    }

}
