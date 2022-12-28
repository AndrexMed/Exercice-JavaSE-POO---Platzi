
import static UI.UIMenu.*;

/**
 *
 * @author giova
 */
public class Main {

    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Giovanni Alzate", "Pedriatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        
        Patient patient = new Patient("Alejandra","aleja@mail.com");
        

    }

}
