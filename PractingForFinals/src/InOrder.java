public class InOrder {
    /*
    Create a function that takes a string and returns true or false, depending on whether the characters are in order or not.

        Examples
        isInOrder("abc") ➞ true

        isInOrder("edabit") ➞ false

        isInOrder("123") ➞ true

        isInOrder("xyzz") ➞ true
     */
    public static void main(String[] args) {
        System.out.println("Checking for isOrder(\"abc\");");
        System.out.println(isOrder("abc"));
        System.out.println("Checking for isOrder(\"123\");");
        System.out.println(isOrder("123"));
        System.out.println("Checking for isOrder(\"edabit\");");
        System.out.println(isOrder("edabit"));
        System.out.println("Checking for isOrder(\"axyzz\");");
        System.out.println(isOrder("axyzz"));

    }

    private static boolean isOrder(String str) {
        //String[] arr= str.split("");
        boolean flag=true;
        int index=0;
        while(flag&&index<str.length()-1){
            if(str.charAt(index)<=str.charAt(index+1)){
                flag=true;
                index++;
            }
            else {
                flag=false;
            }
        }
        return flag;
    }
}
