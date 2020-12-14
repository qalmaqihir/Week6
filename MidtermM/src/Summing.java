public class Summing {
    /*
    Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100.
     Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily.
      Also compute and display the average. The output shall look like:
    The sum of 1 to 100 is 5050
    The average is 50.5
     */
    public static void main(String[] args) {
        double avg=0;
        int lowerBound=1;
        int upperBound=100;
        int total=0;
//        for (int i = lowerBound; i <=upperBound ; i++) {
//            total+=i;
//        }
//        System.out.println(total);
//        avg=(total)/(upperBound-lowerBound);
//        System.out.println(avg);
//        //using while loop
//        int sum=0;
//        int number= lowerBound;
//        while(number<=upperBound){
//            sum+=number;
//            number++;
//        }
//        System.out.println(sum);
        int number=lowerBound;
        int sum=0;
        do {
            sum+=number;
            number++;
        }while(number<=upperBound);
        System.out.println(sum);


    }
}
