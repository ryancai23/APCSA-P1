//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		Grades grad = new Grades();
		grad.setGrades(5,new double[]{100.0, 90.0, 85.0, 72.5, 95.6});
		grad.getAverage();
		System.out.println(grad);
	}
}