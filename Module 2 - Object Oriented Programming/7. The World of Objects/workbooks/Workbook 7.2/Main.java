import java.util.Arrays;
 
public class Main {
  
    public static void main(String[] args) {
        String[] passport = new String[]{"Ray", "dob","Canadian"};
        Person person = new Person("Rayan Slim","Canadian","01/01/1111",5);
 
//        person.name = "Rayan Slim";
//        person.nationality = "Canadian";
//        person.dateOfBirth = "01/01/1111";
//        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
//        person.seatNumber = 5;
        
        System.out.println("Name: " + person.name + "\n" + "Nationality: "
                + person.nationality + "\n" + "Date of Birth: " + person.dateOfBirth +
                "\n" + "Seat Number: " + person.seatNumber + "\n"
        );
    }
  
  
}
