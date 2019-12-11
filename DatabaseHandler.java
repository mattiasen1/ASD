public class DatabaseHandler{



    public User findUser(){
        return(new User(1, "bert123", "asd", "bert", "bertsson", 1738281, "asd@asd.se", 72137912, "väg2", "requester"));
    }
    public Feedback getFeedback(){
        return(new Feedback(2, "Sämst"));
    }
    public boolean insertUser(){
        return(true);
    }
    public boolean insertFeedback(){
        return(true);
    }
    public Preferences getPreferences(){
        return(new Preferences(14, "Helikopter", "Hjälp med allt"));
    }

}