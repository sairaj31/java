import java.util.*;
public class DoWhileExample {n

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int count=0;
		DoWhileExample eg = new DoWhileExample();
		eg.table(a, count);
		
	}
	
	public void table(int a, int count) {
		int i=1;
		do {
			count = a*i;
			i++;
			System.out.println(count);
		}
		while(i<=10);
		
	}
}