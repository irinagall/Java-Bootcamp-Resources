import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    //    Task3 Create a getMagazine method that takes an index as a parameter and returns a deep copy of the Magazine object at that index.
//    Hint: You must return to the Magazine class and give it a copy constructor.
    public Magazine getMagazine(int index) {
      /*  Magazine magazineCopyToFetch = this.magazines.get(index);
        return new Magazine(magazineCopyToFetch); <-- inline */
        Magazine magazineToFetchCopy = new Magazine(this.magazines.get(index));
        return magazineToFetchCopy;

    }

    //  Task4  Create a setMagazine method that takes a Magazine object and an index as parameters and sets the Magazine object at the specified index to a deep copy of the given object.
    public void setMagazine(Magazine inputMagazine, int index) {
      // this.magazines.set(index, new Magazine(inputMagazine)); <-- inline alternative
        Magazine magazineToSetCopy = new Magazine(inputMagazine);
        this.magazines.set(index, magazineToSetCopy);
    }

    // Task 5 Create an addMagazine method that takes a Magazine object as a parameter and adds a deep copy of the object to the magazines ArrayList.
    public void addMagazine(Magazine magazineToAdd){
        //this.magazines.add(new Magazine(magazineToAdd)); <-- inline
        Magazine magazineToAddCopy = new Magazine(magazineToAdd);
        this.magazines.add(magazineToAddCopy);
    }
}
