class VariableExample {
 static int num = 55; //static
 long num1 = 54321980;  //instance
 public void display() { //nonstatic method 
   char a = 'M'; //local
   double num2 = 45.355;
   System.out.println("local variable value : " +a); //printing local variable
   System.out.println("local variable value :"+num2);
}
public static void calc(){
 double b = 99.30;
 double c = 45.23;
 double res =b * c;
 System.out.println("Result is : " +res); 
}
public static void main(String args[]){
VariableExample obj = new VariableExample(); //object creation
obj.display(); //invoke nonstick method with obj
calc();  //invoke static method 
System.out.println("Instance variable value :" +obj.num); //calling instace varibale
System.out.println("Static variable value : "+num); //calling static variable without class
}
}