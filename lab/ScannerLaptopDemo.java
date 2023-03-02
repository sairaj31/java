import java.util.Scanner;

public class ScannerLaptopDemo {
	static int userInput;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter Option: \nAdd - 1\nSubtract - 2\nMultiply - 3\nEven / Odd Number - 4\nQuit - 5");
			userInput = scanner.nextInt();
			switch (userInput) {
			case 1:
				System.out.println("Enter two numbers to be added: \n");
				double firstNumber = Double.parseDouble(scanner.next());
				double secondNumber = Double.parseDouble(scanner.next());
				System.out.println("The result is " + (firstNumber + secondNumber));
				break;
			case 2:
				System.out.println("Enter two numbers to be subtracted: \n");
				firstNumber = Double.parseDouble(scanner.next());
				secondNumber = Double.parseDouble(scanner.next());
				System.out.println("The result is " + (firstNumber - secondNumber));
				break;
			case 3:
				System.out.println("Enter two numbers to be multiplied: \n");
				firstNumber = Double.parseDouble(scanner.next());
				secondNumber = Double.parseDouble(scanner.next());
				System.out.println("The result is " + (firstNumber * secondNumber));
				break;
			case 4:
				System.out.println("Enter a number: \n");
				double number = Double.parseDouble(scanner.next());
				if (number % 2 == 0) {
					System.out.println("The result is even.");
				} else {
					System.out.println("The result is odd.");
				}
				break;
			case 5:
				System.out.println("error... :)");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + userInput);
			}
		} while (userInput != 5);
	}
}