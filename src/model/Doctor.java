package model;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author giova
 */
public class Doctor extends User {
    //Atributo
    private String speciality;
    
   public Doctor(String name, String email) {
        super(name,email);
        System.out.println("El nombre del doctor asignado es: " + name);   
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    
    

    
    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointment.add(new Doctor.AvailableAppointment(date, time));
    }
    
    public ArrayList<AvailableAppointment> getAvailableAppointment(){
        return availableAppointment;
    }
    
    @Override
        public String toString() {
            return super.toString() + "\nSpeciality: " +speciality+ "\nAvailable: " + availableAppointment.toString();
        }

    public static class AvailableAppointment {  //Clase Anidada.

        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_availableAppointment() {
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id_availableAppointment) {
            this.id_availableAppointment = id_availableAppointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointment \nDate: "+ date + "\nTime: "+ time;
        }
        
    }
}
