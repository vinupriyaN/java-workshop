package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddspliexample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean,List<Integer>> groupMap = numbers.stream()
        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even numbers: " + groupMap.get(true));
        System.out.println("Odd numbers: " + groupMap.get(false));
    }
    
}
