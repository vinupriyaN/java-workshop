public class Wordcount {
    public static void main(String[] args)
    {
        String  sentence= "this program show how can we split a string into multiple strings.we need find sentence,word and letter count in a string";
        String words[]=sentence.split(" ");
        int wordCount = words.length;
        System.out.println(wordCount);
        String sen[]=sentence.split("");
        int sentenceCount=sen.length;
        System.out.println(sentenceCount);
        String letter[]=sentence.split("\\.");
        int letterCount=letter.length;
        System.out.println(letterCount);


    }
}
