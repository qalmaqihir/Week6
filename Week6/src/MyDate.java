import java.time.Month;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public static final String[] MONTHS= {"Jan","Feb","Mar","Apr",
    "May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    public static final String[] DAYS ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    public static final int[] DAYS_IN_MONTHS={31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate(int year ,int month, int day){
        //Invoking setDate define later...
        setDate(year, month, day);
//        if(day>0 && day<32){
//            this.day=day;
//        }else{
//            System.out.println("Wrong Day");
//        }
//        if(month>0 && month<13){
//            this.month=month;
//        }else{
//            System.out.println("Wrong Month");
//        }
//        if(year>0 && year <9999){
//            this.year=year;
//
//        }else{
//            System.out.println("Wrong Year");
//        }
    }
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 || year % 400 == 0) && year % 100 != 0;
    }
    public static boolean isValidDate(int year,int month, int day){
        boolean byear=false;
        boolean bmonth=false;
        boolean bday=false;

        if(year>0 && year<=9999){
            byear=true;
        }
        if (month >0 && month <13){
            bmonth=true;
        }
        if (day>0 && day<32){
            bday=true;
        }
        // Overall Validation
        return bday && bmonth && bday;
    }
    public static int getDayOfWeek(int year, int month, int day){
        /*Write the code here as well*/
        //Left here................................
        return 0;
    }
    public void setDate(int year,int month, int day){
        if (!isValidDate(year,month,day)){
            throw new IllegalArgumentException("Invalid year, month or day!");
        }else{
            this.year=year;
            this.month=month;
            this.day=day;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        int dayMax=1;
        if(isLeapYear(getYear())){
            DAYS_IN_MONTHS[1]=29;
            dayMax=DAYS_IN_MONTHS[getMonth()];
            if(day>0 && day<=dayMax){
                this.day=day;
            }else{
                throw new IllegalArgumentException("Invalid month!");
            }
        }else{
            dayMax=DAYS_IN_MONTHS[getMonth()];
            if(day>0 && day<=dayMax){
                this.day=day;
            }else{
                throw new IllegalArgumentException("Invalid month!");
            }
        }
    }

    public void setMonth(int month) {
        if(month>0 && month<13){
            this.month=month;
        }else{
            throw new IllegalArgumentException("Invalid month!")
        }
    }

    public void setYear(int year) {
        if (year>0 && year<=9999){
            this.year=year;
        }else {
            throw new IllegalArgumentException("Invalid year!")
        }
    }


    @Override
    public String toString() {
        //Day is wrong (DAYS[Day%7])...
        return String.format("%s %02d %d %d",DAYS[day%7],day,MONTHS[month],year);
    }
    //Left here..........
    /* Start from here*/
    public MyDate nextDay(){
        setDay(getDay()+1);
        MyDate newDate=new MyDate(this.year ,this.day,this.day);
        return newDate;
    }
    public MyDate nextMonth(){
        setMonth(getMonth()+1);
        MyDate newDate=new MyDate(this.year ,this.day,this.day);
        return newDate;
    }
    public MyDate nextYear(){
        setYear(getYear()+1);
        MyDate newDate=new MyDate(this.year ,this.day,this.day);
        return newDate;
    }
    public MyDate previousDay(){
        setDay(getDay()-1);
        MyDate newDate=new MyDate(this.year ,this.day,this.day);
        return newDate;
    }
    public MyDate previousMonth(){
        setMonth(getMonth()-1);
        MyDate newDate=new MyDate(this.year ,this.day,this.day);
        return newDate;
    }
    public MyDate previousYear(){
        setYear(getYear()-1);
        MyDate newDate=new MyDate(this.year ,this.day,this.day);
        return newDate;
    }
}


