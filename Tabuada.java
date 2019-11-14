import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 @SuppressWarnings("resource")
Scanner in = new Scanner(System.in);
 
 System.out.print("Input a number: ");
 int num1 = in.nextInt();
 
 System.out.print("Input a second number: ");
 int num2 = in.nextInt();

 
 for (int i=0; i< num2; i++){
  System.out.println(num1 + " x " + (i+1) + " = " +
    (num1 * (i+1)));
 }
}
	}

