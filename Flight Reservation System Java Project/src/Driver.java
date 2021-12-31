import java.util.Scanner;

public class Driver {
    public static void printTicketDetails(Ticket ticket){
    ticket.getPNR();
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        //creating objects for flight class which will store the available flights
        Flight flight1 = new Flight(0001, "AirIndia", 100, 0);
        Flight flight2 = new Flight(0002, "KingFisher", 100, 0);
        Flight flight3 = new Flight(0003, "JetAirways", 100, 0);
        Flight flight4 = new Flight(0004, "SpiceJet", 100, 0);
        Flight flight5 = new Flight(0005, "Indigo", 100, 0);

        //allowing the user to first register and book a ticket
        System.out.println("Welcome to Online Flight Reservation System ");
        System.out.println("kindly register : ");
        System.out.println("Enter Name : ");
        String Name = sc.next();
        System.out.println("Enter PhoneNumber : ");
        int PhoneNumber = sc.nextInt();
        System.out.println("Enter Email : ");
        String Email = sc.next();
        System.out.println("Enter Street : ");
        String Street = sc.next();
        System.out.println("Enter City : ");
        String City = sc.next();
        System.out.println("Enter State : ");
        String State = sc.next();

        //using the data from the user and creating a passenger object p1
        Passenger p1 = new Passenger(Name, PhoneNumber, Email, Street, City, State);
        //creating another object of passenger and giving pre-defined values
        Passenger p2 = new Passenger("Nitish",45654,"ng@gmail.com","HS","Chandigarh","UT");

        //booking a regular or tourist ticket
        //booking a regular ticket for passenger p1
        RegularTicket t1 = new RegularTicket(flight1, p1);
        //booking a tourist ticket for passenger p2
        TouristTicket t2 = new TouristTicket(flight1, p2);

        //calling the printTicketDetails() function which prints the PNR Number of the given ticket
        printTicketDetails(t1);
        printTicketDetails(t2);

    //We can define the functionality of the main function accordingly, either by taking values from the user or by giving pre-defined values as required.


    }
}
