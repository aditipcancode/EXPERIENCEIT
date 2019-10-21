package Area;

public class Area {
    private String color;
    private double radius;
    private double length;
    private double breadth;
    private double Area;
    private double Circumference;
    double pie = 3.14159;

    public Area(double radius, double length, double breadth, String color) {
        this.length = length;
        this.breadth = breadth;
        this.radius = radius;
        this.color = color;
    }

    public Area() {
    }

    public String getColor() {
        return this.color;
    }

    public double getAreaOfCircle() {
        Area = pie * radius * radius;
        return this.Area;
    }

    public double getCircumferenceOfCircle() {
        Circumference = 2 * pie * radius;
        return Circumference;
    }

    public double getAreaOfRectangle() {
        Area = length * breadth;
        return Area;
    }

    public double getCircumferenceOfRectangle() {
        Circumference = 2 * length * breadth;
        return Circumference;
    }


}
