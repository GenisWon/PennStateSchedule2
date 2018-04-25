package pennstateschedule;


import java.util.ArrayList;


public class UserList {
     
    private ArrayList<User> userList;
    private String[] credentials;
    
    public UserList() 
    {
        userList = new ArrayList<>();
        credentials = new String[2];
    } // constructor
    
    public void initializeTestUsers()
    {
        User newPart;
        
        System.out.println("in iTU");
        String[] userName = {"mkeller", "cdelvecchio", "dgerman", "jjiang", ""};
        
        for (int i = 0; i < userName.length; i++)
        {
            newPart = new Participant(userName[i], "", false);
            userList.add(newPart);
            
            System.out.println(userList.get(i).getUserName() + " " 
                    + userList.get(i).getPassword());
        } // add user from userName[array] to userList<ArrayList>
    } // initializeTestUsers
    
    public ArrayList<User> getUserList()
    {
        return userList;
    } // getUserList

    public String[] getCredentials() 
    {
        return credentials;
    } // getCredentials
    
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
    
} // UserList
