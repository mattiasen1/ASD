public class Requester extends User{

    public Requester(int userID, String username, String password, String firstname, String lastname, int SSN, String email, int phonenumber, String adress, String usertype) {
        super(userID, username, password, firstname, lastname, SSN, email, phonenumber, adress, usertype);
    }
    public JobRequest createJob() {
        return(new JobRequest(1, "Jaha", true, 666, "Uppsala"));
    }
}