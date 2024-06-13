import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        System.out.println("\n************Task 1 names to gretting**************************");
        names.stream().map(name->"Hello, " + name + "!").forEach(greeting -> System.out.println(greeting));
            
   
        System.out.println("\n************Task 2 find first neon_ninja ***********************");
        
        List<String> usernames = Arrays.asList("sparklingunicorn", "galactic_goddess", "neon_ninja", "purplepixiedust");
     
        String username =  usernames.stream().filter(usrName -> usrName.equals("neon_ninja")).findFirst().orElse(null);
     
        System.out.println("Found you: " + username);

        System.out.println("\n**********Task 3 found the even number & count them ****************************");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        long numEven = numbers.stream().filter(num -> num % 2 == 0).count();
        
        System.out.println("There are " + numEven + " even numbers in this list");
        
    }   
    
}


