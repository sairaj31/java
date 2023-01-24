class ArithmeticDemo{
	public void cal(){
	int a=30;
	int b=10;
	System.out.println("Addition: "+(a+b));
	System.out.println("Substraction: "+(a-b));
	System.out.println("Multiplicaction: "+(a*b));
	System.out.println("Division: "+(a/b));
	System.out.println("Modulus: "+(a%b));
}
	public static void main(String aegs[]){
	ArithmeticDemo obj = new ArithmeticDemo();
	obj.cal();
}
}