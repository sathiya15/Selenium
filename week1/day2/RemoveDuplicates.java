package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
 String text = "We learn java basics as part of java sessions in java week1";
 int count=0;
 String[] str=null; 
 str = text.split(" ");  // converting string into string array
 
 String[] rev=new String[str.length];
 
 for(int i=0;i<=str.length-1;i++) {
	 for(int j=i+1;j<=str.length-1;j++) {
	  	   if(str[i].equals(str[j])) {
//	    	System.out.println(i+" "+str[i]+" "+j+" "+str[j]);
	    	count=count+1;
	    	if(count>1) {	    				
	    		str[i]=str[i].replace(str[i],"");

	    		}	
	    	}
	   }
	 }
 
 String s = str.toString();
 
 for(int i=0;i<=str.length-1;i++)
 {

	 System.out.print(str[i]+" "); 
 } 
}
}
