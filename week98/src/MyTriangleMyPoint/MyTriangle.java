package MyTriangleMyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1,int y1, int x2, int y2, int x3, int y3) {
        this.v1=new MyPoint(x1,y1);
        this.v2=new MyPoint(x2,y2);
        this.v3=new MyPoint(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return String.format("My Triangle[v1=%s,v2=%s,v3=%s",v1.toString(),v2.toString(),v3.toString());
    }
    public double getPerimeter(){
        double perimeter= v1.distance(v2)+ v1.distance(v3)+v2.distance(v3);
        return perimeter;
    }
    public String printType(){
        double distance1= v1.distance(v2);
        double distance2=v1.distance(v3);
        double distance3= v3.distance(v2);
//        switch ()
        if(distance1== distance2 && distance2==distance3){
            return "Equilateral";
        }else if(distance1== distance2 || distance1==distance3 || distance2==distance3 ){
            return "Isosceles";
        }else{
            return "Scalene";
        }
    }
}
