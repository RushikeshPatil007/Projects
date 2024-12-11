package placement_activity_system;

import java.util.ArrayList;

public class StudentService {
   static ArrayList<Student> fetchstudent() throws Exception{
	   ArrayList<Student> al =StudentDao.fetchstudent();
	   
	   for(Student stu : al) {
		   if(stu.name.startsWith("R")) {
			   System.out.println(stu);
		   }
	   }
	   return al;
   }

 

}
