public class WarOfNumbers {
    /*
    There's a great war between the even and odd numbers. Many numbers already lost their life in this war
    and it's your task to end this. You have to determine which group sums larger: the even, or the odd.
    The larger group wins.

    Create a function that takes an array of integers, sums the even and odd numbers separately,
    then returns the difference between sum of even and odd numbers.

        Examples
        warOfNumbers([2, 8, 7, 5]) ➞ 2
        // 2 + 8 = 10
        // 7 + 5 = 12
        // 12 is larger than 10
        // So we return 12 - 10 = 2

        warOfNumbers([12, 90, 75]) ➞ 27

        warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168
     */

    public static void main(String[] args) {

        int[] arr={2,3,7,5};
        int[] arr1={12,90,75};
        int[] arr2={5,9,45,6,2,7,34,8,6,90,5,243};
        System.out.println("Checking for warOfNumbers([2,3,7,5]) ");
        System.out.println(warOfNumbers(arr));
        System.out.println("Checking for warOfNumbers([12,90,75])");
        System.out.println(warOfNumbers(arr1));
        System.out.println("Checking for warOfNumbers([5,9,45,6,2,7,34,8,6,90,5,243])");
        System.out.println(warOfNumbers(arr2));

    }
    public static int warOfNumbers(int[] numbers){
        int diff;
        int evenSum=0;
        int oddSum=0;
        for (int number:numbers) {
            if(number%2==0){
                evenSum+=number;
            }else {
                oddSum+=number;
            }
        }
        if(evenSum>=oddSum){
            diff=evenSum-oddSum;
        }else {
            diff=oddSum-evenSum;
        }
        return diff;
    }

}
