package streams;
import java.util.ArrayList;
import java.util.List;

public class Namestartwithscount {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("shahana");
        names.add("Eve");
        names.add("Frank");
        names.add("Suba");
        names.stream()
        .filter(name -> name.startsWith("S")|| name.startsWith("s"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);
        
    }    
    
}
    

