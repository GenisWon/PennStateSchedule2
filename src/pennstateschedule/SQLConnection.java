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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

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
        
        /*
        HashMap hm = new HashMap();
        hm = sc.getAttributes("course");
        System.out.println(Arrays.asList(hm));
        */
        
        Course course1 = new Course(sc);
        System.out.println(course1.getProgram());

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
    public ResultSet getData()
    {
        try 
        {
            //PreparedStatement ps = connect.prepareStatement("select * from course");
            //result = ps.executeQuery();
            
            stment = connect.createStatement();
            String query = "select * from course";
            result = stment.executeQuery(query);
            
            

            
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
        
        return result;
    } // getData
    
    
    public HashMap getAttributes(String tableName)
    {
        List rowTitles = new ArrayList();
        List<Object> results = new ArrayList<Object>();
        HashMap hm = new HashMap();
        
        try 
        {
            stment = connect.createStatement();
            String query = "select * from " + tableName;
            result = stment.executeQuery(query);
            ResultSetMetaData resultMetaData = result.getMetaData();
            
            int numColumns = resultMetaData.getColumnCount();
            for (int i = 1; i <= numColumns; i++)
            {
                rowTitles.add(resultMetaData.getColumnLabel(i));
            }
            
            result.next();
            for (int i = 0; i < numColumns; i++)
            {
                hm.put(rowTitles.get(i), result.getString((String)rowTitles.get(i)));
            }
            
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;
    } 
    
    public Connection getConnection() {
        return connect;
    }
    
    
} // end of class SQLConnection
