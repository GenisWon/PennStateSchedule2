package pennstateschedule;


import java.util.ArrayList;


public class UserList {
     
    private ArrayList<User> userList;
    private String[] credentials;
    
    UserList() {
        userList = new ArrayList<>();
        credentials = new String[2];
    } 
    
    public void initializeTestUsers(){
        System.out.println("in iTU");
        String[] userName = {"mkeller", "cdelvecchio", "dgerman", "jjiang"};
        
        for (int i = 0; i < 4; i++)
        {
            User newPart;
            newPart = new Participant(userName[i], "testpass", false);
            userList.add(newPart);
        }
        for (int i = 0; i < 4; i++)
        {
            System.out.println(userList.get(i).getPassword());
            System.out.println(userList.get(i).getUserName());
        }
    }
    
    public ArrayList<User> getUserList(){
        return userList;
    }

    public String[] getCredentials() {
        return credentials;
    }
    
    /* Future feature for adding and removing users requiring XML or some database connection
    public void addUser(String infUserName, String infPassword){
        if(!userList.contains(infUserName))
        {
            userList.add(infUserName);
            passList.add(infPassword);
        } else { System.out.println("User already exists"); } //Console test case to be replaced with popup.
    }
    
    public void removeUser(String infUserName){   
        int i = userList.indexOf(infUserName);
        userList.remove(i);
    }
    
    public void resetPassword(String infUserName){
        passList.set(userList.indexOf(infUserName), "password");
    }
    */
    
}
