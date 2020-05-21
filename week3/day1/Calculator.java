package week3.day1;

public class Calculator {
	
	public void add(int a,int b) {
	
System.out.println("add int a and int b: "+a+ " "+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println("add int a and int b and int c: "+a+ " "+b+ " "+c);

	}
	public void multiply(int a,int b) {
		
		System.out.println("Multiply int a and int b: "+a+ " "+b);
	}
	
public void multiply(int a,double b) {
		
	System.out.println("add  int a and double b: "+a+ " "+b);
	}

		
	public void subtract(int a, int b) {
		System.out.println("subtract int a and int b: "+a+ " "+b);

	}
	
public void subtract(double a, double b) {
		
	System.out.println("add double a and double b: "+a+ " "+b);
	}

public void divide(int a, int b) {
	
	System.out.println("divide a and int b: "+a+ " "+b);
}
public void divide(double a, int b) {
	System.out.println("divide double a and int b: "+a+ " "+b);

}
public static void main(String[] args) {
	
	Calculator obj = new Calculator();
	obj.add(1, 2);
	obj.add(1, 2, 3);
	obj.subtract(1, 2);
	obj.subtract(12345, 123456);
	obj.multiply(10, 20);
	obj.multiply(10, 12345);
	obj.divide(100, 200);
	obj.divide(12345, 10);
}

}

