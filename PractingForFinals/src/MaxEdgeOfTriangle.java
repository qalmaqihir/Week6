public class MaxEdgeOfTriangle {
    /*
    Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.

        Examples
        nextEdge(8, 10) ➞ 17

        nextEdge(5, 7) ➞ 11

        nextEdge(9, 2) ➞ 10
     */
    public static void main(String[] args) {
        nexEdge(8,10);
    }

    private static int nexEdge(int a, int b) {
        int c= a+b;
        return c-1;
    }
}
