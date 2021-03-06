import java.util.Scanner;

public class CompundedInterest {
		public static void main(String[]args){
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Please enter your interest rate:  ");
			Double rate = keyboard.nextDouble();
			System.out.println("Please enter your original amount: ");  
			double principal = keyboard.nextDouble();
			
			System.out.println("Please enter your number of times the loan is compounded per year:  ");
			int compound = keyboard.nextInt();
			System.out.println("Please enter your life of the loan (in years): ");  
			int life = keyboard.nextInt();
			
			System.out.printf("Your total monthly payment is %10.2f", 
								amount(principal, rate, compound, life));
		}
		
		public static double amount(double p, double r, int n, int t){
			r = r/100;
			return (p*Math.pow((1 + r/n),n*t))/(t*12);
		}
}