import java.io.* ;
 
class StringBufferBuilder{
    public static void main(String args[])
    {
        StringBuffer s1 = new StringBuffer("This is StringBuffer ");
        System.out.println(s1.append("This is a sample program"));
        System.out.println(s1.insert(21, " object "));
        System.out.println(s1.reverse());
        System.out.println(s1.reverse());
		System.out.println(s1.replace(14,20, "Builder"));
        
    }
}