import java.util.Arrays;

public class Person {


    String name = "Diana";
    String nationality = "Romanian";
    String dateOfBirth = "26.07.1991";
    String[] passport = { "Dob", "Suceava" };
    int seatNumber = 5;


    public Person(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = passport;
        this.seatNumber = seatNumber;


        System.out.println(this.name);
        System.out.println(this.nationality);
        System.out.println(this.dateOfBirth);
        System.out.println(this.seatNumber);
        System.out.println(Arrays.toString(this.passport));

    }
}
