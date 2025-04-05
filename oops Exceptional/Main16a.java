public class Main16a {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[5]);        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range!");
        }
        finally {
            System.out.println("Array example finished.");
        }
    }
}
