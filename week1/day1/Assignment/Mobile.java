package week1.day1.Assignment;

public class Mobile {

	public static void main(String[] args) 
	{
		Mobile.myMobile=new Mobile();
		myMobile.makeCall();
	    myMobile.sendMsg();
	System.out.println("This is my Mobile");
	}
   public void makeCall()
   {
	   String mobileModel="Samsung";
	   float mobileWeight=137.26f;
	   System.out.println("making a call");
	   System.out.println("Mobile Model:+mobileModel");
	   System.out.println("Mobile weight:+mobileWeight");
	   
   }  
   public void sendMsg()
   {
	   boolean isFullyCharged=true;
	   int mobileCost=23000;
	   System.out.println("sending Messages");
	   System.out.println("Mobile charged:+isFullyCharged");
	   System.out.println("Mobile cost:+mobileCost");
   }
}
// compilation error-

