import java.util.Scanner;
class UseDelimiterEx{
public static void main(String args[]){
     Scanner sc=new Scanner("Sairaj is good boy");
     sc.useDelimiter("a");//a is using as a saperator
     while (sc.hasNext()){//loop to continuesly execute the line until we reach the end of line
         System.out.println(sc.next());
     }
    Scanner s=new Scanner("sairaj/is a good ");
    s.useDelimiter("/");//"/" is use as saperator
    while (s.hasNext()){
        System.out.println(s.next());
    }
    Scanner s1=new Scanner("sairaj is a good boy");
    s1.useDelimiter("\\s");
    while (s1.hasNext()){
        System.out.println(s1.next());
    }
  }
}