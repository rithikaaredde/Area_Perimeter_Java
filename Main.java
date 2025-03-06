import java.util.Scanner;

class ShapeCalculator {  // Remove 'public' modifier
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
                case 1:
                    System.out.print("Enter radius of the Circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    circle.calculateArea();
                    circle.calculatePerimeter();
                    break;

                case 2:
                    System.out.print("Enter length of the Rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the Rectangle: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.calculateArea();
                    rectangle.calculatePerimeter();
                    break;

                case 3:
                    System.out.print("Enter side length of the Square: ");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    square.calculateArea();
                    square.calculatePerimeter();
                    break;

                case 4:
                    System.out.print("Enter radius of the Sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    sphere.calculateArea();
                    sphere.calculateVolume();
                    break;

                case 5:
                    System.out.print("Enter radius of the Cylinder: ");
                    double cylRadius = scanner.nextDouble();
                    System.out.print("Enter height of the Cylinder: ");
                    double cylHeight = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(cylRadius, cylHeight);
                    cylinder.calculateArea();
                    cylinder.calculateVolume();
                    break;

                case 6:
                    System.out.print("Enter base length of the Equilateral Pyramid: ");
                    double baseLength = scanner.nextDouble();
                    System.out.print("Enter height of the Equilateral Pyramid: ");
                    double pyramidHeight = scanner.nextDouble();
                    EquilateralPyramid pyramid = new EquilateralPyramid(baseLength, pyramidHeight);
                    pyramid.calculateArea();
                    pyramid.calculateVolume();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
