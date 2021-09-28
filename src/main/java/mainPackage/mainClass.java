/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;
import java.sql.ResultSet;
/**
 *
 * @author AK
 */
public class mainClass {
    public static void main(String args[])
    {
        database db = new database();
        ResultSet rs = db.runReadQuery("select * from tasks");
        try{
            while(rs.next()){
                System.out.println(rs.getString("task-name"));
            }
            
        }
        catch(Exception e){
            System.out.println("From main Class");
            System.out.println(e);
        }
        
    }
}
