import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Grades
{
	private ArrayList<Double> grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner lol = new Scanner(gradeList);
		grades =new ArrayList<Double>();
		lol.next();
		lol.next();
		while (lol.hasNextDouble()){
			grades.add(lol.nextDouble());
		}

	}
	
	public void setGrade(int spot, double grade)
	{
		grades.set(spot, grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.size(); i++){
			sum += grades.get(i);
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = grades.get(0);
		for (int i = 1; i < grades.size(); i++){
			if (grades.get(i) < low){
				low = grades.get(i);
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = grades.get(0);
		for (int i = 1; i < grades.size(); i++){
			if (grades.get(i) > high){
				high = grades.get(i);
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		for (int i = 0; i < grades.size(); i++){
			output += grades.get(i) + " ";
		}
		return output;
	}	
}