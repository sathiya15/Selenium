package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  List<String> str = new ArrayList<String>();
	  str.add("HCL");
	  str.add("Wipro");
	  str.add("Aspire Systems");
	  str.add("CTS");
	  
	  System.out.println(str.size());
	  Collections.sort(str);
	  
	  for (int i=str.size()-1;i>=0;i--) {
		  System.out.println(str.get(i));
	  }

	}

}
