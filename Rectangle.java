// Rectangle.java
class Rectangle extends Shape
{
    double length, width;

    public Rectangle(double length, double width)
    {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea()
    {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    void calculatePerimeter()
    {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}
