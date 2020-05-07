package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		boolean flag=false;

		if(text1.length()==text2.length()) {
			char[] arr1 = text1.toCharArray();
			char[] arr2 = text2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			for(int i=0,j=0;i<=arr1.length-1 & j<=arr2.length-1; i++,j++) {
				//	System.out.println(arr1[i]+" "+arr2[j]);
				if(arr1[i]==arr2[j]) {
					flag=true;
				}
				else {
					System.out.println("Array values are not same");
					flag=false;
					break;
				}
			}	
		}
		else {
			System.out.println("length are not same");
		}
		if(flag) {
			System.out.println("both the arrays has same value");
		}
       
	}

}