package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsApp() {
		System.out.println("Connect Whatsapp");
		
	}
	public void takeVideo() {
		
		System.out.println("Take Video Smartphone");
}

	public static void main(String[] args) {
		
		
		SmartPhone obj= new SmartPhone();
		obj.takeVideo();
//		obj.makeCall();
//		obj.sendMessage();
//		obj.takeVideo();
//		obj.connectWhatsApp();
//		obj.connectWhatsApp();
	}

}
