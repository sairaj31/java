package My;

public class SingleArrayEg{
	public static void main(String args[]){
		int myarray[]= new int[4];  //declaration & instatntiation
		myarray[0] = 78; //initialization
		myarray[1] = 97;
		myarray[2] = 76;
		myarray[3] = 30;

		System.out.println(myarray[2]); //value at index2		

		// traversing an array
		for(int i=0;i<myarray.length;i++) {//length of array
			System.out.println(myarray[i]);

}

		float num[] = {3.3f,5.5f,8.3f,9.8f,}; //declaration, instatntiation,initialization
		
		//print num array
		Sysytem.out.println("array element : ");
		
		//for each loop
		//holds an aray element im a variable 
		for(float j:num){
		System.out.print(j + " , ");
}

}

}