import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Enter your Number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		SwitchCase se = new SwitchCase();
		se.switchcase(n);
		
        
           
	}
	
	public void switchcase(int n) {
		switch(n) {
        case 1:
        	System.out.println("Monday");
        	break;
        case 2:
        	System.out.println("Tuseday");
        	break;
        case 3:
        	System.out.println("Wednesday");
        	break;
        case 4:
        	System.out.println("Thursday");
        	break;
        case 5:
        	System.out.println("Friday");
        	break;
        case 6:
        	System.out.println("Saturday");
        	break;
        case 7:
        	System.out.println("Sunday");
        	break;
        default:
        	System.out.println("Enter a Valid Number");
        	break;
     
	}
	}
}
