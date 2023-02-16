interface LibraryUser {

	
	public void name();
	public void registerAccount();
	public void requestbook();

}

 class KidUsers implements LibraryUser {
	
	private int age = 12;
	private String bookType = "kids";
	
	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getBookType() {
		return bookType;
	}

	protected void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (getAge() < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		} else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestbook() {
		if (getAge() < 12 && getBookType() == bookType) {
			System.out.println("Book Issued successfully, please return the book within 10 day");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}

	@Override
	public void name() {
		
	}

}

 class AdultUser implements LibraryUser {

	private int age;
	private String bookType;
	
	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getBookType() {
		return bookType;
	}

	protected void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerAccount() {
		if (getAge() > 12) {
			System.out.println("You have successfully registered under an Adult  Account");
		} else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void requestbook() {
		if (getAge() > 12 && getBookType() == bookType) {
			System.out.println("Book Issued successfully, please return the book within 10 day");
		} else {
        System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		
	}

}

 class LibraryInterfaceDemo {
	
	static KidUsers kidUsers = new KidUsers();
	static AdultUser adultUser = new AdultUser();

	public static void main(String[] args) {

		testCase1();
		testCase2();
		
	}
	
	public static void testCase1() {
		
		kidUsers.setAge(10);
		kidUsers.registerAccount();
		kidUsers.setAge(18);		
		kidUsers.registerAccount();
		kidUsers.setBookType("kids");
		kidUsers.requestbook();
		kidUsers.setBookType("fiction");
		kidUsers.requestbook();
	}
	
	public static void testCase2() {

		adultUser.setAge(5);
		adultUser.registerAccount();
		adultUser.setAge(23);
		adultUser.setBookType("kids");
		adultUser.requestbook();
		kidUsers.setBookType("fiction");
		adultUser.requestbook();
		
	}

}