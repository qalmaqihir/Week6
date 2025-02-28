package AbstracShapes;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //Abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape[%s,%b]",color,filled);
    }
}
