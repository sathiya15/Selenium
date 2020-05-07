package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count=0;
		
	char[] CharArr = str.toCharArray();
	
	for(int i=0;i<=CharArr.length-1;i++) {
		//System.out.print(CharArr[i]);
		
		if(CharArr[i]=='e') {
			count=count+1;
		}
	}
	
	System.out.println("count= "+count);
	
		
	}

}
