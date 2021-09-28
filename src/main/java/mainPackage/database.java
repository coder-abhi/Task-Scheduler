/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;
import java.sql.*;
/**
 *
 * @author AK
 */
public class database {
        String url = "jdbc:mysql://localhost:3306/task_scheduler_db";
        String username = "root";
        String password = "26202620";
        Connection con;
        Statement st;
    public database()
    {

        try{
            con = DriverManager.getConnection(url, username, password);
            st = con.createStatement();
        }
        catch(Exception e){
            System.out.println("From onstructor of database class");
            System.out.println(e);
        }    
    }
    public ResultSet runReadQuery(String query)
    {
        ResultSet rs = null;
        try{
            
            rs = st.executeQuery(query);
        }
        catch(Exception e){
            System.out.println("Error in Database Read Query");
            System.out.println(e);
        }
        return rs;
    }
}
