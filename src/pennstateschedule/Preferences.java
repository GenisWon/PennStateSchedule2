/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pennstateschedule;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author djg5596
 */
public class Preferences {
    
    String id;
    String COURSE_id;
    String TIMESLOT_id;
    String FACULTY_id;
    String addendum;
    
    //Get ID of preference.
    public String getID(){
        return this.id;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    //Get ID of course.
    public String COURSE_id(){
        return this.COURSE_id;
    }
    
    public void setCOURSE_id(String COURSE_id){
        this.COURSE_id = COURSE_id;
    }
    
    //Get ID of Timeslot.
    public String TIMESLOT_id(){
        return this.TIMESLOT_id;
    }
    
    public void setTIMESLOT_id(String TIMESLOT_id){
        this.TIMESLOT_id = TIMESLOT_id;
    }
    
    //Get ID of Faculty.
    public String FACULTY_id(){
        return this.FACULTY_id;
    }
    
    public void setFACULTY_id(String FACULTY_id){
        this.FACULTY_id = FACULTY_id;
    }
    
    //Get ID of addendum.
    public String addendum_id(){
        return this.addendum;
    }
    
    public void setaddendum_id(String addendum_id){
        this.addendum = addendum;
    }
    public Preferences (String id, String COURSE_id, String TIMESLOT_id, String FACULTY_id, String addendum){
   this.id = id;
   this.COURSE_id = COURSE_id;
   this.FACULTY_id = FACULTY_id;
   this.TIMESLOT_id = TIMESLOT_id;
   this.addendum = addendum;
    
    }
}