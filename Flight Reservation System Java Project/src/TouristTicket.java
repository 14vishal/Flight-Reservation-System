public class TouristTicket extends Ticket {

    //Class Attributes
    private String HotelStreet;
    private String HotelCity;
    private String HotelState;
    private String[] touristlocations = new String[]{"RockGarden", "SukhnaLake" , "newlake", "secondlake" , "Elante Mall" , "Sector 17 Market" , "IT Park" , };
    private String[] SelectedTouristLocations = new String[5];


    //Parameterized Constructor
    TouristTicket(Flight flight, Passenger passenger){
        //using the super() keyword to get the methods and attributes of the parent Ticket Class
        super(flight,passenger);

    }


    //Getters and Setters and other Class methods

    //selecting hotel address
    public void selectHotel(String Street , String City , String State){
        this.HotelStreet = Street;
        this.HotelCity = City;
        this.HotelState = State;
    }
    //getting hotel details
    public void getHotelDetails(){
        System.out.println(HotelStreet);
        System.out.println(HotelCity);
        System.out.println(HotelState);
    }

    //getting all tourist Locations
    void getTouristLocations(){
            System.out.println("You can select any 5 locations : ");
            for( int i=0 ; i < touristlocations.length ; i++){
                System.out.println(touristlocations[i]);
            }
    }
    //selecting the 5 tourist locations after calling this method in the main class and passing a string array with 5 locations
    void setTouristLocations(String[] SelectedTouristLocations){
        this.SelectedTouristLocations = SelectedTouristLocations;
    }

}
