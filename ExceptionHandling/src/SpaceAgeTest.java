public class SpaceAgeTest {
    public static void main(String[] args) {
        SpaceAge age= new SpaceAge(1000000000);
        System.out.println(age.onEarth());
        System.out.println(age.onNeptune());
        System.out.println(age.onVenus());
        System.out.println(ageOnEarth(1000000000));

    }
    public static double ageOnEarth(int age){
        double years=age/31557600;
        return years;
    }
}
