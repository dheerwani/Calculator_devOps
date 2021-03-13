
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

	private static final Logger logger = LogManager.getLogger(Calculator.class);
	public Calculator() {
	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		double number1, number2;
		do {
			System.out.println("Welcome to the calculator!");
			System.out.print("Choose the following operation\n 1) Factorial\n2) Square root\n3)Power of the number \n4)Natural log\n" +
					"5)Exit\nEnter the option: ");
			int opt;
			try {
				opt = scanner.nextInt();
			} catch (InputMismatchException error) {
				return;
			}

			switch (opt) {
				case 1:
					// do factorial
					System.out.print("Enter a val : ");
					number1 = scanner.nextDouble();
					System.out.println("Factorial of "+number1+" is : " + calculator.dev_factorial(number1));
					System.out.println("\n");

					break;
				case 2:
					// find square root
					System.out.print("Enter a val : ");
					number1 = scanner.nextDouble();
					System.out.println("Square root of "+number1+" is : " + calculator.square_root(number1));
					System.out.println("\n");


					break;
				case 3:
					// find power
					System.out.print("Enter the first val : ");
					number1 = scanner.nextDouble();
					System.out.print("Enter the second val : ");
					number2 = scanner.nextDouble();
					System.out.println(number1+ " raised to power "+number2+" is : " + calculator.power(number1, number2));
					System.out.println("\n");
					break;
				case 4:
					// find natural log
					System.out.print("Enter a val : ");
					number1 = scanner.nextDouble();
					System.out.println("Natural log of "+number1+" is : " + calculator.naturalLog(number1));
					System.out.println("\n");

					break;
				default:
					System.out.println("Okay Bye!!");
					return;
			}
		} while (true);
	}


	public double dev_factorial(double number1) {
		logger.info("[FACTORIAL] - " + number1);
		double result = fact(number1);
		logger.info("[RESULT - FACTORIAL] - " + result);
		return result;
	}



	public double square_root(double number1) {
		logger.info("[SQ ROOT] - " + number1);
		double result = Math.sqrt(number1);
		logger.info("[RESULT - SQ ROOT] - " + result);
		return result;
	}


	public double power(double number1, double number2) {
		logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
		double result = Math.pow(number1,number2);
		logger.info("[RESULT - POWER] - " + result);
		return result;
	}

	public double naturalLog(double number1) {
		logger.info("[NATURAL LOG] - " + number1);
		double result = 0;
		try {

			if (number1 <0 ) {
				result = Double.NaN;
				throw new ArithmeticException("Case of NaN 0.0/0.0");
			}
			else {
				result = Math.log(number1);
			}
		} catch (ArithmeticException error) {
			System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
		}
		logger.info("[RESULT - NATURAL LOG] - " + result);
		return result;
	}
	public double fact(double num) {
		double facto = 1;
		for(int i = 1; i <= num; ++i)
		{ facto *= i;   }
		return  facto;
	}
}