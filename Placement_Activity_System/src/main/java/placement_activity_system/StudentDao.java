package placement_activity_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDao {
  static ArrayList <Student> fetchstudent () throws Exception{
	  
	  Class.forName("com.mysql.jdbc.Driver");
	  
	  Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/placement_system","root","root");
	  String sql="select *from student";
	  
	  Statement s= c.createStatement();
	  ResultSet r=s.executeQuery(sql);
	  ArrayList<Student> als = new ArrayList<Student>();
	  while(r.next()) {
		  int rollNumber=r.getInt(1);
		  String name=r.getString(2);
		  String email=r.getString(3);
		  String resume=r.getString(4);
		  String company=r.getString(5);
		  String jobProfile=r.getString(6);
		  boolean Placed=r.getBoolean(7);
		  String contactDetails=r.getString(8);
		  Student stu=new Student(rollNumber,name,email,resume,company,jobProfile,Placed,contactDetails);
		  als.add(stu);
		  System.out.println("RollNumber:"+rollNumber);
		  System.out.println("Name:"+name);
		  System.out.println("Email:"+email);
		  System.out.println("Company:"+company);
		  System.out.println("jobProfile:"+jobProfile);
		  System.out.println("Placed:"+Placed);
		  System.out.println("Contact Details:"+contactDetails);
		 
		    
	  }
	  return als;
  }
}
