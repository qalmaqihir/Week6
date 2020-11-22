package ballContainer;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1=x;
        this.y1=y;
        this.x2=x+width-1;
        this.y2=y+height-1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }
    public int getWidth(){
        int width=x2-x1+1;
        return width;
    }
    public int getHeight(){
        int height=y2-y1+1;
        return height;
    }
    public boolean collides(Ball ball){
        if(ball.getX()- ball.getRadius()<=this.x1 ||ball.getX()-ball.getRadius()>=this.x2)

            ball.reflectVertical();
            return true;
        }

    @Override
    public String toString(){
        return String.format("Container[(%d,%d),(%d,%d)]",x1,y1,x2,y2);
    }

}
