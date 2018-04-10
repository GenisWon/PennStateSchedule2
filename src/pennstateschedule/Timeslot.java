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
public class Timeslot {
    private String id;
    private String beginTime;
    private String endTime;
    private String weekday;

    //Get the id of the timeslot.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Get the beginning time of each class.
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    //Get the end time of each class.
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    //get the specific days of the week for each class.
    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
    
    public Timeslot (String id, String beginTime, String endTime, String weekday){
        this.id = id;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.weekday = weekday;
    }
}
