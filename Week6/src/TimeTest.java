public class TimeTest {
    public static void main(String[] args) {
//        Time now= new Time(12,11,00);
//        System.out.println(now.toString());
//        System.out.println(now.previousSecond());
//        System.out.println(now.nextSecond());

        Time kal= new Time(23,45,58);
        System.out.println(kal.nextSecond());
        System.out.println(kal.previousSecond());
    }
}
