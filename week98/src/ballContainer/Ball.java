package ballContainer;

public class Ball {
    private float x;
    private float y;
    private float xDelta;
    private float yDelta;
    private int radius;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (speed * Math.cos(direction));
        this.yDelta = (float) (speed * Math.sin(direction));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getXDelta() {
        return xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void move(){
        x+=xDelta;
        y+=yDelta;
    }
    public void reflectHorizontal(){
        xDelta*= (-1*xDelta);
    }
    public void reflectVertical(){
        yDelta*=(-1*yDelta);
    }
    @Override
    public String toString(){
        return String.format("Ball[(%f,%f),speed=(%f,%f)]",x,y,xDelta,yDelta);
    }

}
