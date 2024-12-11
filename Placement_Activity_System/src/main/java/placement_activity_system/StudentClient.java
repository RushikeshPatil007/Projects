package placement_activity_system;

import java.util.ArrayList;
public class StudentClient {
       
	public static void main(String [] args) throws Exception{
		ArrayList <Student> al =StudentController.fetchstudent();
		for(Student stu:al) {
			System.out.println(stu);
		}
	}
}
