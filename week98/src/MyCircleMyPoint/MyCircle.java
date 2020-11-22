package MyCircleMyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.radius=1;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle(int x, int y, int radius) {
        this.center= new MyPoint(x,y);
        this.radius = radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y ){
        this.center.setXY(x,y);
    }

    @Override
    public String toString() {
        return String.format("MyCircle [radius =%d, center=(%s)]",radius,center.toString());
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double distance(MyCircle another){
        double dis=this.center.distance(another.center);
        return dis;
    }
}
