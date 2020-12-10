import java.util.Arrays;

public class RaindropConverter {

    public static void main(String[] args) {
        System.out.println(converter(28));
    }
    public static String converter(int n){
        int[] count= new int[n];
        String output="";
        int index =0;
        for(int i=1; i<=n;i++){
            //System.out.printf("Checking for %d mod %d\n",n,i);
            if(n%i==0){
                count[index]=i;
                //System.out.printf("Checking for %d mod %d= %d\n",n,i,n%i);
                index++;
            }
        }
        System.out.println("Printing Array:");
        System.out.println(Arrays.toString(count));
        boolean a = Arrays.asList(count).contains(3);
        boolean b = Arrays.asList(count).contains(5);
        boolean c = Arrays.asList(count).contains(7);
        System.out.println("Checking a= 3, b= 5 and c=7, if array contian them or NOt");
        System.out.printf("a=%b, b=%b,c=%b\n",!a,!b,!c);
        if((!a==true||!b==true||!c==true)){
            System.out.println("Inside if Block");
            if(!a){
                System.out.println(3);
                output+="Pling";
            }
            if(!b){
                output+="Plang";
                System.out.println(5);
            }
            if(!c){
                output+="Plong";
                System.out.println(7);
            }
        }else{
            System.out.println("Inside else Block");
            output+=Integer.toString(n);
        }
        return output;
    }
    //todo check the contains methods else logic is accordering to it...
}
