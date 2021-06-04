package day2Assignments;

public class Part5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base =3, exponent=4;
		
		long result=1;
		while(exponent !=0) {
			result*=base;
			--exponent;
		}
		System.out.println("Exponents are: "+result);
	}

}
