//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  

/*      N E   D O V R S E N O */
public class Banks_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: "+ i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: "+ a.getRateOfInterest());
		
		
		
	}

}
