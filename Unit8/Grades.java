//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private int num;
	private double[] grades;

	//constructor
	public Grades()
	{
		setGrades(num, grades);
	//set method
	}
	public void setGrades(int numz,double[] grades2)
	{
		num = numz;
		grades = grades2;
	}

	private double getSum()
	{
		double sum=0.0;
		for(int i=0;i<grades.length;i++)
			sum = sum+grades[i];


		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/num;


		return average;
	}


	public String toString()
	{
		String output = "";
		for(int i=0;i<grades.length;i++)
			 output = output +"\n"+"grade "+i+":: "+grades[i];
		
		output = output + "\n"+ "average " + "= " + getAverage();
		return output;
	}


}