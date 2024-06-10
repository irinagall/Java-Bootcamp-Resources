public class Main {

    public static void main(String[] args) {

        /* Test the ContactManager class by creating a few Contact objects, initializing a ContactManager object with those contacts,
    and then using the getContact and setContact methods to manipulate the contacts.*/
        Contact contact1 = new Contact("Diana","123-456-7890","1991-07-26");
        Contact contact2 = new Contact("Lozs", "07547371035", "1993-06-16");

        Contact[] contacts = {contact1,contact2};
        ContactManager contactManager = new ContactManager(contacts);

        //test getContact
        Contact contactTest = contactManager.getContact(1);
        System.out.println(contactTest.getName());

        //test setContact
        Contact newContact = new Contact("Alliah", "345-678-9034","1992-02-02");
        contactManager.setContact(newContact,0);

        // verify that the contact was updated
        contactTest = contactManager.getContact(0);
        System.out.println(contactTest.getName());
    }

}
