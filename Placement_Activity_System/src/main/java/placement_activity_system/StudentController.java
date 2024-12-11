package placement_activity_system;

 import java.util.ArrayList;
 
public class StudentController {
    static ArrayList<Student> fetchstudent ()throws Exception{
    	ArrayList<Student> alst = StudentService.fetchstudent();
    	return alst;
    }
}
