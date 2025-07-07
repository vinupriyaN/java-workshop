

public class Appending {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder();
        sentence.append("java");
        sentence.append(" is ");
        sentence.append("the ");
        sentence.append("most ");
        sentence.append("used ");
        sentence.append("language ");
        sentence.append("for ");
        sentence.append("enterprise");
        sentence.append(" applications.");
        System.out.println(sentence.toString());
    }
}