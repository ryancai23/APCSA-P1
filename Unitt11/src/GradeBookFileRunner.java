import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.util.ArrayList;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!\n\n");
		Scanner file = new Scanner(new File("C:\\Users\\rcais\\Documents\\GitHub\\APCSA-P1\\Unitt11\\src\\Gradebook.dat"));
		String name = file.nextLine();
		int numba = Integer.parseInt(file.nextLine());
		Class userclass = new Class(name, numba);
		for (int i = 0; i < numba; i++){
			Student stu = new Student(file.nextLine(), file.nextLine());
			userclass.addStudent(i, stu);
		}
		out.println(userclass + "\n");
		out.println(userclass + "\n");
		out.println("Failure List = " + userclass.getFailureList(65));
		out.println("Highest Average = " + userclass.getStudentWithHighestAverage());
		out.println("Lowest Average = " + userclass.getStudentWithLowestAverage());
		out.println("Class average = " + userclass.getClassAverage());
		












	}		
}