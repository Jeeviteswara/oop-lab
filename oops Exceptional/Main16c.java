public class Main16c {
    public static void main(String[] args) {
        String text = null;

        try {
            System.out.println(text.length());
        }
        catch (NullPointerException e) {
            System.out.println("Error: Cannot access length of null!");
        }
        finally {
            System.out.println("Null pointer example finished.");
        }
    }
}
