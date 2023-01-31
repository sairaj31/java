import java.util.*;
public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int count=0;
		ForExample eg = new ForExample();
		eg.table(a, count);
		
	}
	
	public void table(int a, int count) {
		
		for(int i=1;i<=10;i++) {
			count = i*a;
			System.out.println(count);
		}

	
	}
}