public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius=1.0;
        this.color="red";

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return Math.PI*(Math.pow(radius,2));
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%f,color=%s",radius,color);
    }
}
