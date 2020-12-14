public class TestTime1 {
    public static void main(String[] args) {
        Time1 time= new Time1();
        displayTime("After time object is created",time);

        time.setTime(13,27,6);
        displayTime("After time object is set ",time);
    }
    public static void displayTime(String header, Time1 t){
        System.out.printf("%s%nUniversal time: %s%nStandard Time: %s%n",header,t.toUniversalString(),t.toString());

    }
}
