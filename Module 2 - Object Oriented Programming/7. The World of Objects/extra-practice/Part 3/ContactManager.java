public class ContactManager {
    private Contact[] contacts;

    //create a constuctor that takes an array of Contact objects
    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact[contacts.length]; //1. set field equal to a new array with the same length as the parameter
        // 2. Set each element in the field equal to a deep copy of an object in the contacts parameter
        for (int i = 0; i < contacts.length; i++) {
            this.contacts[i] = new Contact(contacts[i]);

        }
    }

    //3.Create a getContact method that takes an index as a parameter and returns a deep copy of the Contact object at that index.
    public Contact getContact(int index) {
        return new Contact(contacts[index]);
    }


    // 4. Create a setContact method that takes a Contact object and an index and
    // sets the Contact object at the specified index to a deep copy of the given object.
    public void setContact(Contact contact, int index) {
        this.contacts[index]= new Contact(contact);
    }


}
