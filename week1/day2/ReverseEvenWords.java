package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		 String test="I am a software tester";		 
	String[] str = test.split(" "); 
		 
		 for(int i=0;i<=str.length-1;i++) {
			 
			if(i%2==1) {
				char[] rev =str[i].toCharArray();
				System.out.print(" ");
			  for(int j=rev.length-1;j>=0;j--) {
				  String S = String.valueOf(rev[j]);
				  System.out.print(S);
			
				}				
			}				
			else {
				System.out.print(" "+str[i]);
			}
		 }		 
			}
}
