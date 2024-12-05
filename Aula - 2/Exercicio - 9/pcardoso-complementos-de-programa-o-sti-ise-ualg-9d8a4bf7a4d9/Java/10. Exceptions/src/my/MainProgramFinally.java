package my;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainProgramFinally {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x, y;

		// and now do things with scanner!
		try{
			System.out.println("Options:\n 1 - sum\n 2 - sqrt \n 3 - division");
			int op = scanner.nextInt();
			switch(op){
			case 1: 
				System.out.print("x = ");
				x = scanner.nextDouble();  
				System.out.print("y = ");
				y = scanner.nextDouble();
				System.out.print("x + y = " + (x + y));
				break;
			case 3: 
				System.out.print("x = ");
				x = scanner.nextDouble();  
				System.out.print("y = ");
				y = scanner.nextDouble();
				System.out.print("x / y = " + (x / y));
				break;
			case 2: 
				System.out.print("x = ");
				x = scanner.nextDouble();  
				System.out.print("sqrt(x) = " + Math.sqrt(x));
				break;
			}
		}catch (InputMismatchException ime){
			//			 Thrown by a <code>Scanner</code> to indicate that the token
			//			 retrieved does not match the pattern for the expected type, or
			//			 that the token is out of range for the expected type.
			//... DO THINGS!
			System.out.println("InputMismatchException thrown");
		}catch(NoSuchElementException nse){
			//			 Thrown by various accessor methods to indicate that the element being requested
			//			 does not exist.			
			//... DO THINGS!
			System.out.println("NoSuchElementException thrown");
		}catch(IllegalStateException ise){
			//			 Signals that a method has been invoked at an illegal or
			//			 inappropriate time.  In other words, the Java environment or
			//			 Java application is not in an appropriate state for the requested
			//			 operation.
			//... DO THINGS!
			System.out.println("NoSuchElementException thrown");
		}finally{
			//whatever happen you should close the scanner!
			scanner.close();
		}

	}

}
