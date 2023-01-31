import java.util.*;
public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int count=0;
		WhileExample eg = new WhileExample();
		eg.table(a, count);
		
	}
	
	public void table(int a, int count) {
		int i=1;
		while(i<=10) {
			count = i*a;
			System.out.println(count);
			i++;
		}
		}

	
	}