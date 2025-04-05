public class Main16d {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20};
            System.out.println(arr[2]); 
            int result = 10 / 0; 
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }
        catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());
        }
        finally {
            System.out.println("Multiple catch example finished.");
        }
    }
}
