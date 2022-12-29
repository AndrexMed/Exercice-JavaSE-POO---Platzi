
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
        Doctor myDoctor = new Doctor("Giovanni Alzate", "Pedriatria");
        myDoctor.addAvailableAppointment(new Date(), "7am");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "2pm");

        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointment()) {
            System.out.println(aA.getDate() + "" + aA.getTime());
        }

        System.out.println("");
        Patient patient = new Patient("Alejandra", "aleja@mail.com");
        Patient patient2 = new Patient("Andres", "andres@mail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Julieta");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

    }

}
