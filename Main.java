//Main.java
import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n*** Shape Calculator Menu ***");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Circle
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    circle.calculateArea();
                    circle.calculatePerimeter();
                    break;

                case 2: // Rectangle
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.calculateArea();
                    rectangle.calculatePerimeter();
                    break;

                case 3: // Square
                    System.out.print("Enter side length: ");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    square.calculateArea();
                    square.calculatePerimeter();
                    break;

                case 4: // Sphere
                    System.out.print("Enter radius: ");
                    double sphereRadius = scanner.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    sphere.calculateArea();
                    sphere.calculatePerimeter();
                    sphere.calculateVolume();
                    break;

                case 5: // Cylinder
                    System.out.print("Enter radius: ");
                    double cylRadius = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double cylHeight = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(cylRadius, cylHeight);
                    cylinder.calculateArea();
                    cylinder.calculatePerimeter();
                    cylinder.calculateVolume();
                    break;

                case 6: // Equilateral Pyramid
                    System.out.print("Enter base side length: ");
                    double baseSide = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double pyramidHeight = scanner.nextDouble();
                    EquilateralPyramid pyramid = new EquilateralPyramid(baseSide, pyramidHeight);
                    pyramid.calculateArea();
                    pyramid.calculatePerimeter();
                    pyramid.calculateVolume();
                    break;

                case 7: // Exit
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
