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

    }
    
    private Connection connect;
    private Statement state;
    private ResultSet result;
    
    private String strHost = "istdata.bk.psu.edu";
    private String strPort = "3306";
    private String strUser = "jqj5405";
    private String strPassword = JOptionPane.showInputDialog(null, "Password: ");
    private String strDB = "jqj5405";
    
    public SQLConnection() throws SQLException
    {
        connectDatabase();
    }
    
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
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Connected to product:  " + connect.getMetaData().getDatabaseProductName());
    }
    
    public void getData()
    {
        try 
        {
            //PreparedStatement ps = connect.prepareStatement("select * from course");
            //result = ps.executeQuery();
            
            state = connect.createStatement();
            String query = "select * from course";
            result = state.executeQuery(query);
            
            System.out.println("Available Courses");
            while (result.next())
            {
                String id = result.getString("id");
                String program = result.getString("program");
                System.out.println("ID: " + id + "\tProgram: " + program);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
} // end of class SQLConnection
