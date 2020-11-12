import java.util.Scanner;

class ResistorColor {
    private static int value;
    private static String[] a;

    public ResistorColor(String[] a) {
        ResistorColor.a =a;
    }
    public ResistorColor(){

    }
    public String[] getA(){
        return a;
    }
    static int colorCode(String color){
        //add code
        //String[] colors={"Black","Brown","Red","Orange","Yellow","Greeen","Blue","Violet","Grey","White"};
        switch (color.toLowerCase()){
            case "black":
               value= 0;
                break;
            case "brown":
                value=1;
                break;
            case "red":
               value=2;
                break;
            case "orange":
                value=3;
                break;
            case "yellow":
                value= 4;
                break;
            case "green":
                value=5;
                break;
            case "blue":
                value=6;
                break;
            case "violet":
                value=7;
                break;
            case "grey":
                value=8;
                break;
            case "white":
                value=9;
                break;
        }
        return value;
    }
    static String[]  color(ResistorColor a){
        //add code
//        Scanner input=new Scanner(System.in);
//        String colorInput=input.nextLine().strip();
//        String[] a=colorInput.split(" ");
        System.out.println(colorCode(a.getA()[0]));
        String first2Bands="";
        String powerOf10="";
        String toleranceBand="";
        for (int i = 0; i < 2 ; i++) {
            first2Bands+=Integer.toString(colorCode(a.getA()[i]));
        }
        powerOf10+=colorCode(a.getA()[2]);
        toleranceBand+=colorCode(a.getA()[3]);
        System.out.printf("%s x %s Ohms\n",first2Bands,powerOf10);
        System.out.printf("Tolerance band  %s0 %%\n",toleranceBand);
        return  a.getA();
    }

    public static void main(String[] args) {
        String[] array={"Orange","Orange","Yellow","red"};
        ResistorColor myresistor= new ResistorColor(array);
        color(myresistor);
    }
}
