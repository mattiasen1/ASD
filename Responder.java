public class Responder extends User{
    
    public Responder(int userID, String username, String password, String firstname, String lastname, int SSN, String email, int phonenumber, String adress, String usertype) {
        super(userID, username, password, firstname, lastname, SSN, email, phonenumber, adress, usertype);
    }
    
    public boolean sendResponse() {
        return(true);
    }
}