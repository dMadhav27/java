
public class Java_28_11_2026_Q1 {

    static double area(double radius) {
        return 3.14 * radius * radius;
    }

    static double area(double length, double breadth) {
        return length * breadth;
    }

    static int area(int side) {
        return side * side;
    }

    public static void main(String[] args) {

        System.out.println("Circle Area: " + area(5.0));
        System.out.println("Rectangle Area: " + area(6.0, 4.0));
        System.out.println("Square Area: " + area(5));
    }
}
