package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char[] CharArr = test.toCharArray();
		
		for(int i=0;i<=CharArr.length-1;i++) {
			if(i%2==1) {
				System.out.print(Character.toUpperCase(CharArr[i]));
//				CharArr[i] =Character.toUpperCase(CharArr[i]);
				//System.out.print(CharArr[i]);
			}
			else {
				System.out.print(CharArr[i]);
			}			
	}		

	}

}
