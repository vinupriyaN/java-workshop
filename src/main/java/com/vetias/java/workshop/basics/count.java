public class count {
    public static void main(String[] args) {
        String  sentence= "this program show how can we split a string into multiple strings";
        String[] words = sentence.split(" ");
        int num=words.length;
        System.out.println(num);
    }

}
