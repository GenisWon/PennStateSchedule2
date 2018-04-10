/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pennstateschedule;

/**
 *
 * @author djg5596
 */
public class Faculty {
    
    private String id;
    private String fName;
    private String lName;
    private String streetNum;
    private String streetName;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private String workType;
    private String department;
    private String ROOM_id;
    
    //Get the ID of Faculty.
    public String getID(){
        return this.id;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    //Get Faculty's first name.
    public String getfName(){
        return this.fName;
    }
    public void setfName(String fName){
        this.fName = fName;
    }
    
    //Get Faculty's last name.
    public String getlName(){
        return this.lName;
    }
    
    public void setlName(String lName){
        this.lName = lName;
    }
    
    //Get Faculty's street number.
    public String getstreetNum(){
        return this.streetNum;
    }
    
    public void setstreetNum(String streetNum){
        this.streetNum = streetNum;
    }

    //Get Faculty's street name.
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    //Get Faculty's city.
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //Get Faculty's State.
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //Get Faculty's Zip code.
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // Get Faculty's phone number.
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Get Faculty's Email address.
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Get Faculty's full time or part time status.
    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    //Get Faculty's department type.
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Get Faculty's room id.
    public String getROOM_id() {
        return ROOM_id;
    }

    public void setROOM_id(String ROOM_id) {
        this.ROOM_id = ROOM_id;
    }
    
    public Faculty (String id, String fName, String lName, String streetNum, String streetName, String city, String state, String zip, String phone, String email, String workType, String department, String ROOM_id){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.workType = workType;
        this.department = department;
        this.ROOM_id = ROOM_id;
    }
}
