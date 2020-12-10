package Point2Dpoint3D;

import javax.xml.transform.sax.SAXResult;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] xyz={super.getX(),super.getY(),getZ()};
        return xyz;
    }

    public void setXYZ(float x,float y, float z){
        super.setX(x);
        super.setY(y);
        setZ(z);
    }

    @Override
    public String toString() {
        return String.format("(%s,z)",super.toString(),z);
    }
}
