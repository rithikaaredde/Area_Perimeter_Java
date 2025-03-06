# Shape Calculator Program

This program calculates the **area**, **perimeter**, and **volume** (for 3D shapes) of different geometric shapes. The program uses an abstract class `Shape`, interfaces, and inheritance to handle various shapes like **Circle**, **Rectangle**, **Square**, **Sphere**, **Cylinder**, and **Equilateral Pyramid**.

---

## Classes and Methods

### **1. `Shape.java` (Abstract Class)**  
The abstract class `Shape` defines the basic structure for all shapes:

#### Methods:
- **`Shape`**: Constructor to initialize the shape's name.
- **`abstract void calculateArea()`**: Abstract method to calculate the area of the shape.
- **`abstract void calculatePerimeter()`**: Abstract method to calculate the perimeter of the shape.

---

### **2. `Circle.java`**  
The `Circle` class extends the `Shape` class and implements methods to calculate the area and perimeter of a circle.

#### Methods:
- **`Circle(double radius)`**: Constructor that initializes the radius of the circle.
- **`void calculateArea()`**: Calculates the area of the circle using the formula: `π * radius²`.
- **`void calculatePerimeter()`**: Calculates the perimeter (circumference) of the circle using the formula: `2 * π * radius`.

---

### **3. `Rectangle.java`**  
The `Rectangle` class extends the `Shape` class and implements methods to calculate the area and perimeter of a rectangle.

#### Methods:
- **`Rectangle(double length, double width)`**: Constructor that initializes the length and width of the rectangle.
- **`void calculateArea()`**: Calculates the area of the rectangle using the formula: `length * width`.
- **`void calculatePerimeter()`**: Calculates the perimeter of the rectangle using the formula: `2 * (length + width)`.

---

### **4. `Square.java`**  
The `Square` class extends the `Shape` class and implements methods to calculate the area and perimeter of a square.

#### Methods:
- **`Square(double side)`**: Constructor that initializes the side length of the square.
- **`void calculateArea()`**: Calculates the area of the square using the formula: `side²`.
- **`void calculatePerimeter()`**: Calculates the perimeter of the square using the formula: `4 * side`.

---

### **5. `Sphere.java`**  
The `Sphere` class extends the `Shape` class and implements the `Volume` interface to calculate the area and volume of a sphere.

#### Methods:
- **`Sphere(double radius)`**: Constructor that initializes the radius of the sphere.
- **`void calculateArea()`**: Calculates the surface area of the sphere using the formula: `4 * π * radius²`.
- **`void calculateVolume()`**: Calculates the volume of the sphere using the formula: `(4/3) * π * radius³`.

---

### **6. `Cylinder.java`**  
The `Cylinder` class extends the `Shape` class and implements the `Volume` interface to calculate the area and volume of a cylinder.

#### Methods:
- **`Cylinder(double radius, double height)`**: Constructor that initializes the radius and height of the cylinder.
- **`void calculateArea()`**: Calculates the surface area of the cylinder using the formula: `2 * π * radius * (radius + height)`.
- **`void calculateVolume()`**: Calculates the volume of the cylinder using the formula: `π * radius² * height`.

---

### **7. `EquilateralPyramid.java`**  
The `EquilateralPyramid` class extends the `Shape` class and implements the `Volume` interface to calculate the area and volume of an equilateral pyramid.

#### Methods:
- **`EquilateralPyramid(double baseLength, double height)`**: Constructor that initializes the base length and height of the pyramid.
- **`void calculateArea()`**: Calculates the surface area of the pyramid using the formula: `baseArea + 4 * (0.5 * baseLength * slantHeight)`, where `slantHeight` is calculated using Pythagoras' theorem.
- **`void calculateVolume()`**: Calculates the volume of the pyramid using the formula: `(1/3) * baseArea * height`.

---

## `Main.java` (Entry Point)

 - The `Main.java` file contains the **main method** that interacts with the user through a menu and provides the option to calculate area, perimeter, and volume for different shapes. The menu options are all the shapes and an exit option.
 - Each option prompts the user to input the necessary dimensions (like radius, length, or height) and then calculates and displays the area, perimeter, or volume.

---

