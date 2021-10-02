/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author AK
 */
public class mainClass {
    public static void main(String args[])
    {
        /*
        try{
        SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date dt = new Date();
        Date dt2 = dateFormate.parse("30-09-2021 20:00:00");
        long diff = dt2.getTime() - dt.getTime();
        TimeUnit time = TimeUnit.HOURS;
        System.out.println(time.convert(diff, TimeUnit.MILLISECONDS));
        }
        catch(Exception e){
            
        }
        */
        
        
        database db = new database();
//        PreparedStatement stmt = 
        
        /*
        database db = new database();
        db.runWriteQuery("insert into tasks (`task-name` , `task-unit`) values('Abhshek','Hours')");
        db.runWriteQuery("update tasks set `task-name`='Rushya' where `task-id` = 3");
        db.runWriteQuery("delete from tasks where `task-name`='Rushya'");
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
        */
    }
}
