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

/************************** MODIFICATION LOG ********************************


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

        sc.getData();
    } // main
    
    private Connection connect;
    private Statement stment;
    private ResultSet result;
    
    private final String strHost = "istdata.bk.psu.edu";
    private final String strPort = "3306";
    private final String strUser = "jqj5405";
    private final String strPassword = "berks1649";
    private final String strDB = "jqj5405";
    
    public SQLConnection() throws SQLException
    {
        connectDatabase();
    } // constructor
    
    
/////////////////////////CONNECT TO DATABASE////////////////////////////////////       
    public final void connectDatabase() throws SQLException 
    {
        try 
        {
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
    
/////////////////////////GET CONNECTION/////////////////////////////////////////
    public Connection getConnection()
    {
        return connect;
    } // getData
    
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
            
            // hide column based on column number specified in array
            int[] intColsToHide = new int[0];
            //intColsToHide[0] = 1; // hide column2 [column# starts at 0]

            // sends data to tablepanel
            TablePanel table = new TablePanel(result, intColsToHide);

            // display tablepanel on JFrame (Temporary)
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
            } // for        
            result.next();
            
            for (int i = 0; i < numColumns; i++)
            {
                System.out.println("test");
                hm.put(rowTitles.get(i), result.getString((String)rowTitles.get(i)));
            } // for  
        } // try
        catch (SQLException ex) 
        {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } //catch
        
        return hm;
    } // Hashmap 
    
} // end of class SQLConnection
