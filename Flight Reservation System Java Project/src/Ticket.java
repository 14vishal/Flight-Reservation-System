public abstract class Ticket {

    //Class Attributes
    private int PNR;
    private String DepartureLocation;
    private String Destination;
    private String FlightName;
    private String Departuredate;
    private String DepartureTime;
    private String ArrivalDate;
    private String ArrivalTime;
    private int FlightDuration;

    private Flight flight;
    private Passenger passenger;

    private int SeatNumber;
    private int TicketPrice;
    private Boolean TicketStatus;


    //Parameterized Constructor
    public Ticket(Flight flight, Passenger passenger){
        this.flight = flight;
        this.passenger = passenger;
        this.FlightName = flight.getAirlineName();
        this.PNR = passenger.getPassengerID();

        //here we can assign atribute values while creating the ticket object according to the name of the flight
        //for example: here if the name of the flight equals a certain value , the constructor will assign specific values
        if(flight.getAirlineName().equals("AirIndia")){
            this.DepartureLocation = "Delhi";
            this.Destination = "Chandigarh";
            this.Departuredate = "26th february 2022";
            this.DepartureTime = "09:00";
            this.ArrivalDate = "26th february 2022";
            this.ArrivalTime = "10:00";
            this.FlightDuration = 30;
        }

    }
    //Getters and Setters and other Class methods

    //getting details of passenger
    public void getPassengerDetails(){
        passenger.getContactDetails();
        passenger.getAddressDetails();
    }

    //getting the ticketStatus
    public String getTicketStatus(Boolean TicketStatus){
        if(TicketStatus) return "Confirmed";
        else return "Cancelled";
    }
    //getting PNR
    public void getPNR(){
        System.out.println(PNR);
    }

    //Cancelling the ticket
    public void CancelTicket(){
            System.out.println("Sorry to see you go");
            this.flight = null;
            this.passenger = null;

    }

}
