// Shape.java
abstract class Shape
{
    String shapeName;

    public Shape(String shape)
    {
        this.shapeName = shape;
    }

    abstract void calculateArea();
    abstract void calculatePerimeter();
}
