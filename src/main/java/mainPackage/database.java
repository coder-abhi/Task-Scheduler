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
            con.setAutoCommit(false);
            if (con != null) {
                System.out.println("Connected");
            }
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
            con.commit();
        }
        catch(Exception e){
            System.out.println("Error in Database Read Query");
            System.out.println(e);
        }
        return rs;
    }
    public boolean runWriteQuery(String query,String[] paramArray)
    {
        int rowEffect = 0;
        
//        PreparedStatement NewQuery = con.prepareStatement(query, paramArray);      
        
        try{
            PreparedStatement NewQuery = con.prepareStatement(query);
            for(int i=0;i<paramArray.length;i++)
            {
                System.out.println("Appeared "+ paramArray[i]);
                NewQuery.setString(i+1,paramArray[i]);
            }
            
//            NewQuery.setInt(rowEffect, rowEffect);
            rowEffect = NewQuery.executeUpdate();
            con.commit();
//          con.close();
        }
        catch(Exception e){
            System.out.println("Error in Database Write Query");
            System.out.println(e);
        }
        if(rowEffect > 0) return true;
        return false;
    }
   
}
