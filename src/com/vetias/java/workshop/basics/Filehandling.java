
import java.io.File;

public class Filehandling {
    public static void main(String[] args) {
        File file = new File("src");
        if (file.exists()) {
            System.out.println("The file exists.");
            if (file.isDirectory()) {
                System.out.println("It is a directory.");
                File[] files = file.listFiles();
                if (files != null) {
                    System.out.println("Files in the directory:");
                    for (File f : files) {
                        System.out.println(f.getName());
                    }
                } else {
                    System.out.println("The directory is empty.");
                }
            } else {
                System.out.println("It is a file.");
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }   
}
