
class Name{
    // data members of the class.
    String name;
    int id;
    Name(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}
class PARA{
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        Name name1 = new Name("sairaj",31);
		System.out.println("Namename :" + name1.name + " and NameId :" + name1.id);
           }
}