
public class MobileNumberCheck {

	public static void main(String[] args) {
	String mobileNo="8890543134";
	boolean valid=validMobileNumber(mobileNo);
	if(valid) {
		System.out.println("Mobile is valid");
		
		
	}
	else
	{
		System.out.println("Mobile number is invalid");
		
	}
	
	

	}

	private static boolean validMobileNumber(String mobileNo) {
	     boolean valid=true;
		for(int i=0;i<mobileNo.length();i++)
	   {
		   if(!(Character.isDigit(mobileNo.charAt(i)))) {
			   valid=false;
			   break;
		   }
	   }
		
		return valid;
	}

}
