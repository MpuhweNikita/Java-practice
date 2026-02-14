import java.util.ArrayList;
public class Admin extends User{
    public Admin(String username,String password){
        super(username,password);
    }

    public void addTourismPlace(ArrayList<TourismPlace> places , TourismPlace place){
        places.add(place);
        System.out.println(getUsername()+" added a new tourism place: "+place.getName());
    }

    public void removeTourismPlace(ArrayList<TourismPlace> places, String placeName){
        places.removeIf(p -> p.getName().equalsIgnoreCase(placeName));
        System.out.println(getUsername()+" removed a tourism place: "+placeName);
    }

    @Override
    public void accessSystem(){
        System.out.println("Admin accessing the system...");
    }

}
