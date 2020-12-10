public class SpaceAge {
    private double age;

    public SpaceAge(double age) {
        this.age = age;
    }
    public double onEarth(){
        double years=age/31557600;
        return years;
    }
    public double onMercury(){
        double years=age/31557600;
        return years*0.2408467;
    }
    public double onVenus(){
        double years=age/31557600;
        return years*0.61519726;
    }
    public double onMars(){
        double years=age/31557600;
        return years*1.8808158;
    }
    public double onSaturn(){
        double years=age/31557600;
        return years*29.447498;
    }
    public double onUranus(){
        double years=age/31557600;
        return years*84.016846;
    }
    public double onNeptune(){
        double years=age/31557600;
        return years*164.79132;
    }
}
