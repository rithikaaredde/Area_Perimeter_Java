// Circle.java
class Circle extends Shape 
{
    double radius;

    public Circle(double radius)
    {
        super("Circle");
        this.radius = radius;
    }

    @Override
    void calculateArea()
    {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    @Override
    void calculatePerimeter() 
    {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}
