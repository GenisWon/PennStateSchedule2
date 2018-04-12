package pennstateschedule;


abstract public class User {

    private String userName;
    private String password;
    private boolean credentialsSaved;
    
    User(String infUserName, String infPassword, boolean infCredentialsSaved) {
        userName = infUserName;
        password = infPassword;
        credentialsSaved = infCredentialsSaved;
    }
    
    abstract boolean hasCredentialsSaved();    
    abstract void setCredentialsSaved(boolean infCredentialsSaved);

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the credentialsSaved
     */
    public boolean isCredentialsSaved() {
        return credentialsSaved;
    }
}