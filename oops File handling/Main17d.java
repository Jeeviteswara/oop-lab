import java.io.File;

class Main17d {
    public static void main(String[] args) {
        File myFile = new File("example.txt");

        if (myFile.delete()) {
            System.out.println("Deleted the file: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
