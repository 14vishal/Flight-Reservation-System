public class Passenger {

    //Class Attributes

    private static int idCounter = 100;
    private int passengerID;
    private Address address;
    private Contact contact;

    //Nested Classes
    //Nested Class Contact
    private static class Contact {
        private String Name;
        private int PhoneNumber;
        private String Email;
        Contact(String Name , int PhoneNumber , String Email){
            this.Name = Name;
            this.PhoneNumber = PhoneNumber;
            this.Email = Email;
        }
    }

    //Nested Address Class
    private static class Address {
        private String Street;
        private String City;
        private String State;
        Address(String Street,String City,String State){
            this.Street = Street;
            this.City = City;
            this.State = State;
        }
    }


    //Parameterized constructor
    public Passenger( String Name, int PhoneNumber, String Email , String Street,String City,String State){

        this.contact = new Contact(Name,PhoneNumber,Email);
        this.address = new Address(Street,City,State);
        idCounter++;
        this.passengerID = idCounter;
    }


    //Getters and Setters and other Class methods

    //getting PassengerID
    public int getPassengerID(){
        return passengerID;
    }
    //getting PassengerCount
    public int getPassengerCount(){
        return idCounter;
    }

    //getting contact and address details from the address and contact object
    public void getContactDetails(){
        System.out.println(contact.Name);
        System.out.println(contact.PhoneNumber);
        System.out.println(contact.Email);
    }
    public void getAddressDetails(){
        System.out.println(address.Street);
        System.out.println(address.City);
        System.out.println(address.State);

    }

    //updating or setting the contact and address details of the address and contact object
    public void setContactDetails(String Name , int PhoneNumber , String Email){
        contact.Name = Name;
        contact.PhoneNumber = PhoneNumber;
        contact.Email = Email;

    }
    public void setAddressDetails(String Street , String City , String State){
        address.Street = Street;
        address.City = City;
        address.State = State;

    }


}
