// Cylinder.java
class Cylinder extends Shape implements Volume
{
    double radius, height;

    public Cylinder(double radius, double height)
    {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    void calculateArea()
    {
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface Area of Cylinder: " + surfaceArea);
    }

    @Override
    void calculatePerimeter()
    {
        System.out.println("Cylinder does not have a perimeter.");
    }

    @Override
    public void calculateVolume()
    {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}
