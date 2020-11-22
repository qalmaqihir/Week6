package ps07;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public static final String[] MONTHS ={"Jan","Feb","Mar","Apr","May","Jun","July","Aug",
    "Sep","Oct","Nov","Dec"};
    public static final String[] DAYS={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public static final int[] DAYS_IN_MONTH={31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeapYear(int year){
        if(year%100!=0 && year%4==0){
            return true;
        }else
        {
            return false;
        }
    }

    public static boolean isValidDate(int year, int month, int day){
        if(year>0 && year <9999 && month >0 && month <13 ){
            if(month==2  && isLeapYear(year)){
                if(day<30){
                    return true;
                }else{
                    return false;
                }
            }
            else if (day>0 && day <= DAYS_IN_MONTH[month-1]){
                //System.out.printf("Month%d, has days &d",MONTHS[month-1],month);
                return true;
            } else{
                return false;
            }
        }
        else {
            return false;
        }
    }
    public static int getDayOfWeek(int year, int month, int day){
        int days=0;
        for (int i = 1800; i <=year ; i++) {
            if(isLeapYear(year)){
                days+=366;
            }else{
                days+=365;
            }
        }
        for (int i = 1; i <=month ; i++) {
            days+=DAYS_IN_MONTH[month-1];
        }
        days+=day;
        return  days%7;
    }

    public MyDate(int year, int month,int day) {
        setDate(year, month,day);
    }
    public void setDate(int year, int month, int day){
        if(!(isValidDate(year,month,day))){
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }else
        {
            this.year=year;
            this.month=month;
            this.day=day;
        }

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if(!(year>0&&year<9999)){
            throw new IllegalArgumentException("Invalid year!");
        }else{
            this.year=year;
        }
    }

    public void setMonth(int month) {
        if(!(month>0&&month<13)){
            throw new IllegalArgumentException("Invalid month!");
        }else{
            this.month = month;
        }
    }

    public void setDay(int day) {
        int dayMax;
        //checking month
        if(getMonth()==2){
            if(isLeapYear(getYear())){
                dayMax=29;
            }else{
                dayMax = 28;
            }
        }else{
            dayMax = DAYS_IN_MONTH[getMonth()-1];
        }
        //verifying the day
        if(!(day>0 && day<=dayMax)){
            throw new IllegalArgumentException("Invalid month!");
        }else{
            this.day=day;
        }

    }


    @Override
    public String toString() {
        return String.format("%s  %d %s %d",DAYS[getDayOfWeek(getYear(),getMonth(),getDay())],getDay(),MONTHS[getMonth()-1],getYear());

    }
    public MyDate nextDay(){
        int month=getMonth();
        int day=getDay();
        if(!(day>0 && day<32)){
            throw new IllegalArgumentException("Invalid day!");
        }else{
            if(day==DAYS_IN_MONTH[month-1]){
                if(month==12){
                    setDay(1);
                    setMonth(1);
                    setYear(nextYear().getYear());
                    MyDate newDate=new MyDate(this.year,this.month,this.day);
                    return newDate;
                }else{
                    if(isLeapYear(year)){
                        setDay(29);
                        MyDate newDate=new MyDate(this.year,this.month,this.day);
                        return newDate;
                    }else{
                        setDay(1);
                        setMonth(nextMonth().getMonth());
                        MyDate newDate=new MyDate(this.year,this.month,this.day);
                        return newDate;
                    }

                }
            }else{
                setDay(day+1);
                MyDate newDate=new MyDate(this.year,this.month,this.day);
                return newDate;
            }

        }
    }

    public MyDate nextMonth(){
        int month=getMonth();
        int day=getDay();
        if(!(month>0 &&month <13)){
            throw new IllegalArgumentException("Invalid month!");

        }else{
            if(day==DAYS_IN_MONTH[month-1]){
                if(month==12){
                    setDay(DAYS_IN_MONTH[month-1]);
                    setDay(1);
                    setMonth(1);
                    setYear(nextYear().getYear());
                    MyDate newDate=new MyDate(this.year,this.month,this.day);
                    return newDate;
                }else{
                    setDay(1);
                    setMonth(month+1);
                    MyDate newDate=new MyDate(this.year,this.month,this.day);
                    return newDate;
                }
            }else{
                if(month!=12){
                    setMonth(month+1);
                    MyDate newDate=new MyDate(this.year,this.month,this.day);
                    return newDate;
                }else{
                    setMonth(1);
                    MyDate newDate=new MyDate(this.year,this.month,this.day);
                    return newDate;
                }
            }

        }
    }

    public MyDate nextYear(){
        int year=getYear();
        if(!(year >0 && year < 10000)){
            throw new IllegalArgumentException("Invalid year");
        }else{

            MyDate newDate= new MyDate(year+1, month,day);
            return newDate;
        }
    }

    public MyDate previousDay(){
        int month=getMonth();
        int day=getDay();
        if(!(day>0 && day<32)){
            throw new IllegalArgumentException("Invalid day!");
        }else{
            if(day==1){
                if(month==1){
                    //setDay(DAYS_IN_MONTH[11]);
                    setDay(31);
                    setMonth(12);
//                    setYear(previousYear().getYear());
                    setYear(getYear()-1);
                    MyDate newDate=new MyDate(this.year,this.month,this.day);
                    return newDate;
                }else{
                    //setMonth(previousMonth().getMonth());
                    setMonth(getMonth()-1);
                    setDay(getDay()-1);
                    MyDate newDate=new MyDate(this.year,this.month,this.day);
                    return newDate;
                }
            }else{
                setDay(day-1);
                MyDate newDate=new MyDate(this.year,this.month,this.day);
                return newDate;
            }

        }
    }

    public MyDate previousMonth(){
        int month=getMonth();
        int day=getDay();
        if(!(month>0 &&month <13)){
            throw new IllegalArgumentException("Invalid month!");

        }else{
            if(day==DAYS_IN_MONTH[month-1]){
                if(month==1){
                    setDay(DAYS_IN_MONTH[0]);
                    setMonth(12);
                    setYear(previousYear().getYear());
                    MyDate newDate=new MyDate(this.year,this.month,this.day);
                    return newDate;
                }else{
                    setDay(DAYS_IN_MONTH[0]);
                    setMonth(month-1);
                    MyDate newDate=new MyDate(this.year,this.month,this.day);
                    return newDate;
                }
            }else{
                if(month!=1){
                    setMonth(month-1);
                    MyDate newDate=new MyDate(this.year,this.month,this.day);
                    return newDate;
                }else{
                    setMonth(12);
                    setYear(previousYear().getYear());
                    MyDate newDate=new MyDate(this.year,this.month,this.day);
                    return newDate;
                }
            }

        }

    }
    public MyDate previousYear(){
        int year=getYear();
        if(!(year >0 && year < 10000)){
            throw new IllegalArgumentException("Invalid year");
        }else{
//
            MyDate newDate= new MyDate(year-1, month,day);
            return newDate;
        }
    }
}
