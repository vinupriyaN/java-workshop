package streams;

import java.util.Arrays;
import java.util.stream.IntStream;


public class Arraystream {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88, 76, 95};
        long noofsubjectedpassed=Arrays.stream(marks)
        .filter(mark -> mark > 40).count();
        System.out.println("Number of subjects passed: " + noofsubjectedpassed);
        IntStream markStream = Arrays.stream(marks);
        noofsubjectedpassed = markStream.filter(mark -> mark > 40).count();
        System.out.println("Number of subjects passed: " + noofsubjectedpassed);
    }
    
}
