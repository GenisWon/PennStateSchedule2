package pennstateschedule;


public class Participant extends User{

    Participant(String infUserName, String infPassword, boolean infCredentialsSaved){
        
        super(infUserName, infPassword, infCredentialsSaved);

    }

    @Override
    boolean hasCredentialsSaved() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setCredentialsSaved(boolean infCredentialsSaved) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
