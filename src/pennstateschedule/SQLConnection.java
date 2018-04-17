/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pennstateschedule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jqj5405
*
*Modified Class Template
 */

/************************MODIFICATION LOG ************************************


*****************************************************************************/

public class SQLConnection 
{    
    public static void main(String[] args) throws SQLException 
    {
        SQLConnection sc = new SQLConnection();
        sc.getData(); 
    } // main
    
    private Connection connect;
    private Statement stment;
    private ResultSet result;
    
    private String strHost = "istdata.bk.psu.edu";
    private String strPort = "3306";
    private String strUser = "jqj5405";
    private String strPassword = "berks1649";
    private String strDB = "jqj5405";
    
    public SQLConnection() throws SQLException
    {
        connectDatabase();
    } // constructor
    
    
/////////////////////////CONNECT TO DATABASE////////////////////////////////////       
    public void connectDatabase() throws SQLException 
    {
        try {
            StringBuilder sbConnection = new StringBuilder();
            sbConnection.append("jdbc:mysql://" + strHost);
            sbConnection.append(":" + strPort);
            sbConnection.append("/" + strDB);
            sbConnection.append("?user=" + strUser);
            sbConnection.append("&password=" + strPassword);

            System.out.println("Connecting to: " + sbConnection.toString());
            connect = DriverManager.getConnection(sbConnection.toString());
            //connect = DriverManager.getConnection("jdbc:mysql://istdata.bk.psu.edu:3306/jqj5405", strUser, strDB);
        } // try
        catch (SQLException ex) 
        {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } // catch
        
        System.out.println("Connected to product:  " + connect.getMetaData().getDatabaseProductName());
    } // connectDatabase
    
    
/////////////////////////DISPLAY DATA FROM QUERY////////////////////////////////        
    public void getData()
    {
        try 
        {
            //PreparedStatement ps = connect.prepareStatement("select * from course");
            //result = ps.executeQuery();
            
            stment = connect.createStatement();
            String query = "select * from course";
            result = stment.executeQuery(query);
            
            // hide column starting from left most column
            int[] intColsToHide = new int[0];

            // sends data to tablepanel
            TablePanel table = new TablePanel(result, 0,intColsToHide);

            // display tablepanel on JFrame
            JFrame frame = new JFrame();
            frame.add(table);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(400, 300, 1000, 300);
            frame.setVisible(true);

            
//            // output out to output console
//            System.out.println("Available Courses");
//            while (result.next())
//            {
//                String id = result.getString("id");
//                String program = result.getString("program");
//                System.out.println("ID: " + id + "\tProgram: " + program);
//            } // while
        } // try
        catch (SQLException ex) 
        {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } // catch
    } // getData
    
    
       public List getPreferences()
    {
        List prefList = new ArrayList();
        try 
        {
            PreparedStatement ps = connect.prepareStatement("select * from course");
            result = ps.executeQuery();
            
            stment = connect.createStatement();
            String query = "select * from preference";
            result = stment.executeQuery(query);
            
        
            while (result.next())
            {
                String FACULTY_id = result.getString("FACULTY_id");
                String id = result.getString("id");
                String TIMESLOT_id = result.getString("TIMESLOT_id");
                String addendum = result.getString("addendum");
                String COURSE_id = result.getString("COURSE_id");
                Preferences preferences = new Preferences (id, COURSE_id, TIMESLOT_id, FACULTY_id, addendum);
                prefList.add(preferences);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prefList;
    } 
    
    
} // end of class SQLConnection
