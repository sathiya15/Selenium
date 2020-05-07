package week1.day2;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		for(int i=1;i<arr.length-1;i++) {
			System.out.println(i);
			
			if((i)!= arr[i-1]) {
				System.out.println("Missing Element "+(i));
				break;
			}
				
		}
			
		
	}

}
