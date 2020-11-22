public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    public Ball(float x, float y, int radius,int speed,int direction){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x=x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(float xDelta,float yDelta){
        this.x+=xDelta;
        this.y+=yDelta;
    }
    public void reflectHorizontal(float xDelta){
        this.xDelta=xDelta*-1;
    }
    public void reflectVertical(float yDelta){
        this.yDelta=yDelta*-1;
    }
    @Override
    public String toString(){
        return String.format("Ball[(x=%f,y=%f),speed=(%f,%f)]",x,y,xDelta,yDelta);

    }
}
