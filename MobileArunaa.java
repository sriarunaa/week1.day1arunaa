package week1.day1;

public class MobileArunaa {
	
	public void makeCall() {
		System.out.println("make call");
		String Mobilename="Redmi";
		float Mobileweight=5.57f;
		
		
	}
	public void sendMsg() {
		System.out.println("send msg");
		boolean fullycharged=true;
		int mobilecost=15000;
	}
	
	public static void main(String[] args) {
		MobileArunaa phone=new MobileArunaa();
		phone.makeCall();
		phone.sendMsg();
		System.out.println("This is my mobile");
		
		
		}

	}


