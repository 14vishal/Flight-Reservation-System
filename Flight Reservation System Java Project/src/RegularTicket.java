public class RegularTicket extends Ticket {
    //Class Attributes
    private Boolean SpecialServices;

    //Parameterized Constructor
    RegularTicket(Flight flight, Passenger passenger){
    //using the super() keyword to get the methods and attributes of the parent Ticket Class
        super(flight,passenger);
    }

    //Getters and Setters and other Class methods

    //setting the value for SpecialServices if the passenger wants the special services
    public void setSpecialServices( Boolean SpecialServices){
        this.SpecialServices = SpecialServices;
    }
    //function to check whether passenger has availed special services or not
    Boolean getSpecialServices(){
        if(SpecialServices) return true;
        else return false;
    }



}
