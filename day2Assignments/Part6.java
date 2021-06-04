package day2Assignments;

public class Part6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []arr= {45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
		double sum=0.0;
		//getting the sum from the total array
		for(double x:arr) {
			sum += x;
		}
		double average= sum/arr.length;
		System.out.printf("Array average is %.2f",average);
	}

}
