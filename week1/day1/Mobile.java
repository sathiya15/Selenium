package week1.day1;

public class Mobile {

	double mobilePrice = 8500.50;
	 int noContacts = 100; 
	String brand = "honor";
	long imeNumber = 1234567989L; 
	public void makeCall() {
		// TODO Auto-generated method stub
System.out.println("makeCall");
	}

	public void sendMessage() {
		// TODO Auto-generated method stub
System.out.println("sendMessage");
	}
	
	public void takePicture() {
		// TODO Auto-generated method stub
System.out.println("takePicture");
	}
	
	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		
		myMobile.makeCall();
		myMobile.sendMessage();
		myMobile.takePicture();		
		
	
	double mblPrice = myMobile.mobilePrice;
	int contacts = myMobile.noContacts;
	String bran = myMobile.brand;
	long imeNo = myMobile.imeNumber;
	
	System.out.println(imeNo);
	System.out.println(imeNo+" "+mblPrice+" "+contacts+" "+bran);
	
	}
	
}
