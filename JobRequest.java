public class JobRequest{
    int requestID;
    String description;
    boolean status;
    int duration;
    String location;


    public JobRequest(int requestID, String description, boolean status, int duration, String location){
        this.requestID = requestID;
        this.description = description;
        this.status = status;
        this.duration = duration;
        this.location = location;
    }
    public void findResponder(){
    }
    public void requestFeedback(){
    }
    public void requestPayment(){
    }
}