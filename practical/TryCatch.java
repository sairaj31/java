public class TryCatch {

	public static void main(String[] args) {
		try { //may throw exception
			//int num = 88/0;//arithmeticException
			//System.out.println(num);
			//String name = null;//NullPointerException  
			//System.out.println(name.length());
			String s="java";  
			int i=Integer.parseInt(s);//NumberFormatException
			System.out.println(i);
		}
		catch(Exception e) { //handle exception
			System.out.println(e);
		}

	}

}