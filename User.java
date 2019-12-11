public class User{
    private int userID;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private int SSN;
    private String email;
    private int phonenumber;
    private String adress;
    private String usertype;


    public User(int userID, String username, String password, String firstname, String lastname, int SSN, String email, int phonenumber, String adress, String usertype) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname; 
        this.SSN = SSN;
        this.email = email;
        this.phonenumber = phonenumber;
        this.adress = adress;
        this.usertype = usertype;
    }
    public void getUser() {
    }
    public boolean changePassword() {    
        return(true);
    }
    public boolean disableAccount() {
        return(true);
    }
    public Feedback createFeedback() {
        return(new Feedback(2, "Sämst"));
    }
    public boolean updateUserinfo() {
        return(true);
    }
}