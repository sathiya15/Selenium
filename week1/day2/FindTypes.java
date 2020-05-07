package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
   char[] Arr=test.toCharArray();
   
   for(int i=0;i<=Arr.length-1;i++) {
	   
	   if(Character.isLetter(Arr[i])) {
		   letter=letter+1;		   
	   }
	   
	   else if(Character.isDigit(Arr[i])) {
		   num=num+1;
	   }
	
	   else if(Character.isSpaceChar(Arr[i])) {
		   space=space+1;
	   }
	   
	   else
	   {
		   specialChar=specialChar+1;
	   }
   }
		
   System.out.println("letter: " + letter);
	System.out.println("space: " + space);
	System.out.println("number: " + num);
	System.out.println("specialCharcter: " + specialChar);
		
		
	}

}
