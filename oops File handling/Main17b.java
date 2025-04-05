import java.io.FileWriter;
import java.io.IOException;

class Main17b {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Welcome to Java file handling!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
