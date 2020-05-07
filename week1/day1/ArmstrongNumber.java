package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int calculated=0;
		int remainder;
		int original=153;
		int input=original;
		
		
		while(input>0){
			
			remainder=input%10;
			
			System.out.println("remainder "+remainder);
			
			input=input/10;
			System.out.println("input "+input);
			
			calculated=calculated+(remainder*remainder*remainder);
			
			
		}
		
		if(original==calculated) {
			System.out.println("given number is armstrong "+calculated);
			}
		
	}

}
