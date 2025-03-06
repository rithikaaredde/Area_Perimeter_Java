// Sphere.java
class Sphere extends Shape implements Volume
{
    double radius;

    public Sphere(double radius)
    {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    void calculateArea()
    {
        double surfaceArea = 4 * Math.PI * radius * radius;
        System.out.println("Surface Area of Sphere: " + surfaceArea);
    }

    @Override
    void calculatePerimeter()
    {
        System.out.println("Sphere does not have a perimeter.");
    }

    @Override
    public void calculateVolume()
    {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere: " + volume);
    }
}
