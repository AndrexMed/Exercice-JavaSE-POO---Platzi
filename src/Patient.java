/**
 *
 * @author giova
 */
public class Patient {
    //Atributos
    int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String Blood;
    
    Patient(String name, String email){
        this.name=name;
        this.email=email;
        this.weight=80.5;
        System.out.println(weight + "Kg.");
    }
    
}
