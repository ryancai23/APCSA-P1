import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		studentList = new ArrayList<Student>();
	}
	
	public Class(String s, int stuCount)
	{
		name = s;
		studentList = new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double Average=0.0;
		for (int i = 0; i < studentList.size(); i++){
			Average += getStudentAverage(i);
		}
		Average /= studentList.size();
		return Average;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int num = 0;
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getName() == stuName){
				num = i;
			}
		}
		return studentList.get(num).getAverage();
	}
	
	public String getStudentName(int stuNum)
	{
		return "" + studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		
		sort();
		return getStudentName(studentList.size() - 1);
	}

	public String getStudentWithLowestAverage()
	{
		
		sort();
		return getStudentName(0);
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getAverage() < failingGrade){
				output += studentList.get(i).getName() + " ";
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output= getClassName();
		for (int i = 0; i < studentList.size(); i++){
			output += "\n" + studentList.get(i).toString() + "\t" + studentList.get(i).getAverage();
		}
		return output;
	}  
	public ArrayList<Student> sort(){
		for (int i = 0; i < studentList.size(); i++){
			for (int j = 0; j < studentList.size() - 1; j++){
				if (studentList.get(j).compareTo(studentList.get(j + 1)) == 1){
					Student temp = studentList.get(j);
					studentList.set(j, studentList.get(j + 1));
					studentList.set(j + 1, temp);
				}
			}
		}
		return studentList;
	}
}