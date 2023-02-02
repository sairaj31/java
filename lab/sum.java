class sum 
{
   public static void main(String[] args)
   {
	int num = 200, sum = 0;
      System.out.println("Even numbers between 1 and 200: ");
      for(int a = 1; a <= 200; a++)
      {
         if(a % 2 == 0)   //condition
         {
            System.out.print(a + " ");
         }
      }
      System.out.println("\nOdd numbers between 1 and 200: ");
      for(int a = 1; a<=200; a++)
      {
         if(a % 2 != 0)
         {
            System.out.print(a + " ");
         }
      }
		for(int i = 1; i<= num;++i)
		{
			//sum =sum +i;
			sum +=i;
		}
			System.out.println("\nSum = "+sum);
   }
}