// EquilateralPyramid.java
class EquilateralPyramid extends Shape implements Volume {
    double baseSide, height;

    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    void calculateArea() {
        double baseArea = baseSide * baseSide;
        double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height);
        double lateralArea = 2 * baseSide * slantHeight;
        double totalArea = baseArea + lateralArea;
        System.out.println("Surface Area of Equilateral Pyramid: " + totalArea);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 4 * baseSide;
        System.out.println("Perimeter of Pyramid's Base: " + perimeter);
    }

    @Override
    public void calculateVolume() {
        double volume = (1.0 / 3.0) * (baseSide * baseSide) * height;
        System.out.println("Volume of Equilateral Pyramid: " + volume);
    }
}
