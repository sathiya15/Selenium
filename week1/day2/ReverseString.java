package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String test = "feeling good";
        
        char[] CharArr = test.toCharArray();
    	
    	for(int i=CharArr.length-1;i>=0;i--) {
    		System.out.print(CharArr[i]);
    	}
        
	}

}
