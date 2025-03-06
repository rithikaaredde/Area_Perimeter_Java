//Square.java
class Square extends Shape
{
    double side;

    public Square(double side) 
    {
        super("Square");
        this.side = side;
    }

    @Override
    void calculateArea() 
    {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    void calculatePerimeter() 
    {
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
    }
}
