package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		int sum = 0;
		char[] arr=text.toCharArray();
		for(int i=0;i<=arr.length-1;i++) {
			if(Character.isDigit(arr[i])) {
				int a = Character.getNumericValue(arr[i]);
				sum=sum+a;
				
			}
					
		}
		System.out.println(sum);
			}

}
