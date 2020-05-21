package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String S = "PayPal India";
	
	char[] str=S.toCharArray();
	
	Set<Character> charSet = new LinkedHashSet<Character>();
	Set<Character> dupCharSet  = new HashSet<Character>();
	
	for(int i=0;i<=str.length-1;i++) {
		if(!charSet.add(str[i])) {
		dupCharSet.add(str[i]);
			
		}
		
		
		
	}
	
	charSet.removeAll(dupCharSet);
	
	  List<Character> array = new ArrayList<Character>();
	  array.addAll(charSet);
	  for (Character character : array) {
		  
		 if(!Character.isSpaceChar(character)) {
			 
		System.out.print(character);
	}
		
	}

}
}