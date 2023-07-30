package week1.day1;

public class LearnOperator {

	public static void main(String[] args) {
		int x=10;
		int y=4;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);//quotient value
		
		System.out.println(x%y); //remainder 
		
		//== equal to
		//!= not equal to 
		
		if(x%2!=0) {
			
			System.out.println("The number is not divisible by 2");
		}else {
			System.out.println("The number is divisible by 2");
		}

		if(x%3!=0) {
			System.out.println("The number is not divisible by 3");
		}
			
		
	}
}
