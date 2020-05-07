package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int input=123;
int sum=0;
int remainder;

while(input>0){
remainder = input%10;
System.out.println("printing remainder "+ remainder);
sum = sum+remainder;
input = input/10;
System.out.println("printing quotient "+ input);
}


System.out.println("sum "+ sum);

	}

	
}
