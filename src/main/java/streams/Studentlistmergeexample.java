package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Studentlistmergeexample {
public static void main(String[] args) {
    List<Integer> csrollnos = Arrays.asList(101,107,103,109,105);
    List<Integer> csarollnos= Arrays.asList(106,103,108,104,110);
    List<Integer> allrollnos=Stream.concat(csrollnos.stream(), csarollnos.stream()).sorted().toList();
    System.out.println( allrollnos);
}
    
}
