package MyCircleMyPoint;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x=0;
        this.y=0;
    }

    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x=x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
//        int[] xy=new int[2];
        int[] xy = {getX(),getY()};
        return xy;
    }

    public void setXY(int x, int y){
        setX(x);
        setY(y);
        int[] xy= {this.x,this.y};
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)",this.x,this.y);
    }

    public double distance(int x, int y){
        //MyPoint thisPoint= new MyPoint(x,y);
        double distanceSq= Math.pow(this.x-x,2.0) + Math.pow(this.y-y,2.0);
        //double distance= Math.sqrt(distanceSq);
        return Math.sqrt(distanceSq);
    }

    public double distance(MyPoint another){
        int x= another.getX();
        int y=another.getY();
        double func=distance(x,y);
        return func;
    }
    public double distance(){
        int x=0;
        int y=0;
        double func=distance(x,y);
        return func;
        /*
        OR we can use the default no-arg constructor and find the distance
        from myPoint to another point (o,o) being the another point..

        MyPoint origin = new MyPoint();
        return distance(origin);
         */
    }



}