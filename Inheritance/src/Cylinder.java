public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        this.height=1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height=1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        //todo : Add formula
        return super.getArea()*height;
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(getRadius(),2)*height;
    }
    @Override
    public String toString(){
        return String.format("Cylinder[radius=%f,height=%f,color=%s",getRadius(),height,getColor());
    }

}
