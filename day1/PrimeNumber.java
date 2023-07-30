package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
	
		
		int num=25;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%1==0) {
				count++; 
			}
		}
	    if(count==2) {
	    	System.out.println("Its a prime number");
	    	
	    } else {
	    	System.out.println( "Its a non prime number");
	    }
	
	
	}

}
