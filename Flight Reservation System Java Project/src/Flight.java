public class Flight {

    //Class Attributes
    private int FlightNumber ;
    private String AirlineName ;
    private int FlightCapacity;
    private int NumberOfSeatsBooked;


    //Constructor
    public Flight(int FlightNumber, String AirlineName, int FlightCapacity, int NumberOfSeatsBooked ){
        this.FlightNumber = FlightNumber;
        this.AirlineName = AirlineName;
        this.FlightCapacity = FlightCapacity;
        this.NumberOfSeatsBooked = NumberOfSeatsBooked;
    }


    //Getters and Setters and other Class methods

    //getting AirlineName
    public String getAirlineName(){
        return AirlineName;
    }

    //getting flight details and check availability of seats;
    public void getFlightDetails(){
        System.out.println(FlightNumber);
        System.out.println(AirlineName);
        System.out.println(FlightCapacity);
        System.out.println(NumberOfSeatsBooked);
    }
    public int getNumberOfSeats(){
       return NumberOfSeatsBooked;
    }

    //booking a seat
    public void BookASeat() {
        if(this.NumberOfSeatsBooked < 100) {
            this.NumberOfSeatsBooked++;
            System.out.println("Your Seat is Booked! Enjoy your Flight");
        }
        else System.out.println("Sorry there are no available Seats on this Flight");
    }

}
