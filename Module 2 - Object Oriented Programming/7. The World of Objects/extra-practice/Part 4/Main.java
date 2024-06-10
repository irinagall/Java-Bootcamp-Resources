import java.util.Scanner;

public class Main {
    //define a scanner at the class level
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // 3. instantiate a ContactManager object with an initial array of Contact objects
        ContactManager contactManager = new ContactManager(contactData());
        displayContacts(contactManager);

        System.out.print("\nYou have 8 contacts. Enter 'continue' to edit them: ");
        String status = scan.nextLine();

        // update ContactManager by editing the contact at the index
        while (status.equals("continue")) {
            System.out.print("\nChoose an index from 0 to 7: ");
            int index = scan.nextInt();
            scan.nextLine(); // throwaway nextLine
            //edit contact at index and update the ContactManager
            contactManager.setContact(editedContact(), index);
            System.out.println("\n\nUPDATED CONTACTS\n\n");
            displayContacts(contactManager);
            System.out.print("Enter 'continue' to make more changes: ");
            status = scan.nextLine();
        }
        scan.close();
    }


//5. create a method editedContact that prompts the user for a name, phone number, and birth date and then return the new Contact object with the provided information
public static Contact editedContact() {
    System.out.println("\tName: ");
    //pick up name
    String name = scan.nextLine();

    System.out.println("\tPhone number: ");
    //pick up phone number
    String phoneNumber = scan.nextLine();

    System.out.println("\tBirth Date: ");
    //pick up birth date
    String birthDate = scan.nextLine();
    return new Contact(name, phoneNumber, birthDate);


}

//4.create a method called displayContacts that takes a ContactManager object as a parameter and displays the contacts
public static void displayContacts(ContactManager contactManager) {
    for (int i = 0; i < 8; i++) {
        Contact contact = contactManager.getContact(i);
        System.out.println(contact);
        System.out.println("\n");
    }
}

/* 2. create a method contactData that returns an array of Contact objects with initial data.
 */
public static Contact[] contactData() {
    return new Contact[]{new Contact("John Doe", "555-123-4567", "1985-01-01"),
            new Contact("Jane Smith", "555-987-6543", "1990-02-14"),
            new Contact("Alice Johnson", "555-345-6789", "1975-03-30"),
            new Contact("Bob Brown", "555-567-8910", "2000-12-25"),
            new Contact("Charlie Davis", "555-111-2222", "1983-07-04"),
            new Contact("Diana White", "555-333-4444", "1997-11-18"),
            new Contact("Ethan Green", "555-555-6666", "1988-05-22"),
            new Contact("Fiona Black", "555-777-8888", "2002-10-31")
    };
}

}
