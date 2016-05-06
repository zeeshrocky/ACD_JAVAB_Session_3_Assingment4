package s3Assignment4;

import java.util.Scanner;

 

public class calculator {

	public static void main(String[] args) {

		Maths math = new Maths();
		Scanner userinput = new Scanner(System.in);

		System.out.println("Welcome to Java Calculator");
		
		System.out.print("Enter First Number:");
		int num1 = userinput.nextInt();

		System.out.print("Enter Second Number:");
		int num2= userinput.nextInt();

		System.out.print("Enter operation to perform (+,-,x,/):");
		String operation= userinput.next();

		if (operation.equals("+")){
			System.out.println(math.Add(num1, num2));
		}
		else if (operation.equals("-")){
			System.out.println(math.Subtract(num1, num2));
		}
		else if (operation.equals("x")){
			System.out.println(math.Multiply(num1, num2));
		}
		else if (operation.equals("/")){
			System.out.println(math.Divide(num1, num2));
		}
		else{
			System.out.println("The operation is not valid.");
		}
	}

}