public class MyPointDriver {
    public static void main(String[] args) {
        MyPoint[] myArrayPoint= new MyPoint[10];
        for (int i = 0; i <10 ; i++) {
            MyPoint add=new MyPoint(i,i);
            myArrayPoint[i]=add;
        }
        for (MyPoint point:myArrayPoint) {
            System.out.println(point.toString());
        }
    }
}
