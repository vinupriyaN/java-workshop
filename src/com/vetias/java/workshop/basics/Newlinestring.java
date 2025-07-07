public class Newlinestring {
    public static void main(String[] args)
    {
        String  sentence= "this program show how can we split a string into multiple strings";
        String words[]=sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
