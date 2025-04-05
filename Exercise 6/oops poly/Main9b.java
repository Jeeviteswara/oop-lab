class Pen {
    String color;
    String type;
    Pen() {
        color = "Blue";
        type = "Ballpoint";
    }
    Pen(String c) {
        color = c;
        type = "Ballpoint";
    }
    Pen(String c, String t) {
        color = c;
        type = t;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("------------");
    }
}
    public class Main9b{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen("Black");
        Pen p3 = new Pen("Red", "Gel");

        p1.display();
        p2.display();
        p3.display();
    }
}
