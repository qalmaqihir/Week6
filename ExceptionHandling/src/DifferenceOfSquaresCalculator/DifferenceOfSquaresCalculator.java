package DifferenceOfSquaresCalculator;

public class DifferenceOfSquaresCalculator {

    public static void main(String[] args) {
        System.out.println("For n=10 the squareOfSum(10) is :");
        int squareOfsum= squareOfSum(10);
        System.out.println(squareOfsum);
        System.out.println("For n=10 the sumOfSquare(10) is :");
        int sumOfsquare= sumOfSqaure(10);
        System.out.println(sumOfsquare);
        System.out.println("The difference between the square of the sum and the sum of squares is:");
        int diff=difference(squareOfsum,sumOfsquare);
        System.out.println(diff);
    }
    public static int squareOfSum(int n){
        int sumOfn= (n*(n+1))/2;
        return(int) Math.pow(sumOfn,2);
    }
    public static int sumOfSqaure(int n){
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            sum+=Math.pow(i,2);
        }
        return sum;
    }
    public static int difference(int squareOfsum, int sumOfsquare){
        return squareOfsum-sumOfsquare;
    }
}
