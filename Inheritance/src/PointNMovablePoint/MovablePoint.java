package PointNMovablePoint;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }

    public float[] setSpeed(){
        float[] speed= {getXSpeed(),getYSpeed()};
        return speed;
    }

    public MovablePoint move(){
        float xx=super.getX()+getXSpeed();
        float yy=super.getY()+getYSpeed();

        MovablePoint newMovedPoint= new MovablePoint(xx,yy);
        return newMovedPoint;
    }

    @Override
    public String toString() {
        return String.format("(%s),speed=(%f,%f)",super.toString(),xSpeed,ySpeed);
    }
}
