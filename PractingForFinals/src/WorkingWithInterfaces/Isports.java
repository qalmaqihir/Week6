package WorkingWithInterfaces;

public interface Isports {

      //By default abstract
    public void setHomeTeam(String name);
    public void SetVisitingTeam(String name);
    public String getPrice();
    public void setVenue(String name);

    //FINAL- given the value
    public int defaultNumberOfPlayers=15;

    //cant create object of interface,
    //can't have a construct-- as fields are already final....

}
