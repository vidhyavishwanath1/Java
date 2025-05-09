import java.util.Scanner;

public class ShapeArea {

    void calculateArea(float a) {
        System.out.println("\nArea of the square = " + a * a);
    }

    void calculateArea(int l, int b) {
        System.out.println("\nArea of the rectangle = " + l * b);
    }

    void calculateArea(double r) {
        double area = 3.14 * r * r;
        System.out.println("\nArea of the circle = " + area);
    }

    public static void main(String[] args) {
        ShapeArea obj = new ShapeArea();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nENTER SIDE OF SQUARE:");
        float side = sc.nextFloat();
        obj.calculateArea(side);

        System.out.println("\nENTER RADIUS OF CIRCLE:");
        double rad = sc.nextDouble();
        obj.calculateArea(rad);

        System.out.println("\nENTER SIDES OF RECTANGLE:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        obj.calculateArea(side1, side2);

        sc.close();
    }
}
