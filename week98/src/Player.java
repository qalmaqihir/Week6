import java.security.SecureRandom;

public class Player {
    private float x;
    private float y;
    private float z;

    public Player(int number,float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Player(){
        this.z= 0.0f;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void move(int number, float x, float y){
        setX(number*(this.x+x));
        setY(number*(this.y+y));
    }
    public void jump(float zDisp){
        setZ(zDisp);
    }
    public boolean near(Ball ball){
        double distance = Math.sqrt(Math.pow(this.x- ball.getX(),2)+Math.pow(this.y- ball.getY(),2)+Math.pow(this.z- ball.getZ(),2));
        if(distance<8){
            return true;
        }else{
            return false;
        }
    }
    public void kick(Ball ball){
        SecureRandom random = new SecureRandom();
        float randomFloat = random.nextFloat();
        ball.setXYZ(randomFloat,randomFloat,randomFloat);
    }
}
