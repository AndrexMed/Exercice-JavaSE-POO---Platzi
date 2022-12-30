
import model.Patient;
import model.Doctor;
import static UI.UIMenu.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
        /*
        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointment()) {
            System.out.println(aA.getDate() + "" + aA.getTime());
        }
        */
        System.out.println("");
        Patient patient = new Patient("Alejandra", "aleja@mail.com");
        System.out.println(patient);
    }

}
