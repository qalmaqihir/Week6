

class testMyDate2 {
    public static final String[] MONTHS ={"Jan","Feb","Mar","Apr","May","Jun","July","Aug",
            "Sep","Oct","Nov","Dec"};
    public static final String[] DAYS={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public static final int[] DAYS_IN_MONTH={31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {


        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);             // Tuesday 28 Feb 2012
        System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
        System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
        System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
        System.out.println(d1.nextYear());  // Monday 1 Apr 2013

        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);                 // Monday 2 Jan 2012
        System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
        System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
        System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
        System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010

        MyDate d3 = new MyDate(2012, 2, 28);
        System.out.println(d3);
        System.out.println(d3.previousYear());  // Monday 28 Feb 2011

        MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
 MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
    }
}


