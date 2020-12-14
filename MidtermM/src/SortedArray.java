import java.util.*;
public class SortedArray {
    public static void main(String[] arg)
    {
        Scanner input= new Scanner(System.in);

        String n=input.next().strip();
        int n1= Integer.parseInt(n);

        int[] list=new int[n1];
        for (int noi=0;noi<n1;noi++){
            int num = input.nextInt();
            list[noi]=num;
        }


        String n2=input.next().strip();
        int n3=Integer.parseInt(n2);

        int[] list2=new int[n3];
        for (int no=0;no<n3;no++){
            int num2 = input.nextInt();
            list2[no]=num2;
        }


        int[] result= new int[list.length+list2.length];

        if (n1 >= 0) System.arraycopy(list, 0, result, 0, n1);
        int len=0;
        for (int ii =n1;ii<result.length;ii++){
            result[ii]=list2[len];
            len++;
        }

        Arrays.sort(result);

        StringBuilder answer=new StringBuilder();
        for (int c:result){
            answer.append(c);
            answer.append(" ");
        }
        String final_answer=answer.toString();
        System.out.println(final_answer.substring(0,final_answer.length()-1));

    }
}
