/**
 *
 * @author giova
 */
public class Doctor {
    static int id=0; //Increment
    String name;
    String email;
    String speciality;
    
    Doctor(){
  
    }
    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor asignado es: "+name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: "+id);
    }
}
