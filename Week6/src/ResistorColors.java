public class ResistorColors {
    public int colorCode(String color){
        int x = 0;
        String[] rColors = colors();
        for(int i=0;i<10;i++){
            if(rColors[i].equals(color)){
                x = i;
            }
        }
        return x;
    }
    public String[] colors(){
        String[] rColors = {"black","brown","red", "orange","yellow", "green", "blue", "violet", "grey", "white"};
        return rColors;
    }

}
