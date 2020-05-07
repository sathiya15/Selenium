package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String rev="";
		
		char[] Arr = str.toCharArray();
		
		char[] Arr_Rev = new char[Arr.length];		
		
		for(int i=Arr.length-1, j=0; (i>=0 & j<=Arr_Rev.length-1);i--,j++) {		
			
			Arr_Rev[j] = Arr[i];			
			//System.out.print(Arr_Rev[j]);
		}
      rev=String.valueOf(Arr_Rev);  //to convert character array into string
      
      if(str.equalsIgnoreCase(rev)) {
    	  System.out.println("given string is Palindrome");
      }
      else
      {
    	  System.out.println("given string is not Palindrome");
      }
	}

}
