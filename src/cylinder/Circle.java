package cylinder;

/**
 * 19. Cylinder (Create package name ‘cylinder’ and create all below classes in this package)
 * 1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of
 * type double.
 * The class needs to have one constructor with parameter radius of type double and it needs to initialize
 * the fields.
 * In case the radius parameter is less than 0 it needs to set the radius field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getRadius without any parameters, it needs to return the value of the radius
 * field.
 * ● Method named getArea without any parameters, it needs to return the calculated area
 * (radius * radius * PI). For PI use Math.PI constant.
 */

public class Circle {

    // initializing instance variable
    double radius;

    //with parameter constructor
    public Circle(double radius) {
        // initialize the value for radius
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    //get method for radius without parameter with return
    public double getRadius() {
        return radius;
    }

    //get method for area without parameter with return
    public double getArea() {
        double area;
        area = radius * radius * Math.PI; // area calculation
        return area;
    }

}
