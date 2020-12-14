public class LeftShilftByPowerOfTwo {
    /*
    The left shift operation is similar to multiplication by powers of two.

        Sample calculation using the left shift operator (<<):

        10 << 3 = 10 * 2^3 = 10 * 8 = 80
        -32 << 2 = -32 * 2^2 = -32 * 4 = -128
        5 << 2 = 5 * 2^2 = 5 * 4 = 20
        Write a function that mimics (without the use of <<) the left shift operator and returns the result from the two given integers.

        Examples
        shiftToLeft(5, 2) ➞ 20

        shiftToLeft(10, 3) ➞ 80
     */
    public static void main(String[] args) {
       // shiftToleft(5,2);
        System.out.println("Checking for shiftToleft(5,2)");
        System.out.println(shiftToleft(5,2));
    }

    private static int shiftToleft(int x, int y) {
        double ans=x* Math.pow(y,2);
        return (int)ans;
    }
}
