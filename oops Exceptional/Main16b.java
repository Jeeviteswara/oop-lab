public class Main16b {
    public static void main(String[] args) {
        String str = "abc";
         try {
            int num = Integer.parseInt(str); 
            System.out.println("Number: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }
        finally {
            System.out.println("Number format example finished.");
        }
    }
}
