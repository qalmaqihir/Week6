package AbstracShapes;


class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side,side);

    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);

    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString(){
        return String.format("Square[%s]",super.toString());
    }
}
