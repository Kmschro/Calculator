import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		int sum;
		int num1,num2;
		double sum2;
		System.out.println("Enter one number:");
		number1 = scan.nextInt();
		System.out.println("Enter a second number:");
		number2 = scan.nextInt();
		sum = number1 +number2;
		System.out.println("Sum: "+ sum);
	}
}