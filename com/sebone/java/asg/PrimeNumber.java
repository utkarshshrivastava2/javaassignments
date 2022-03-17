package com.sebone.java.asg;
import java.util.Scanner;

/*Class name - PrimeNumber
 * objective - to check whether the number is prime or not
 * author - utkarsh/sebone
 * date- 17-03-2022
 */
public class PrimeNumber{
	/*method name- isPrime
	 * objective- to return the flag which determine the number is prime or not
	 * input- number
	 * return- flag 
	 */
	public boolean isPrime(int number){
		boolean flag=true;
		for(int i=2;i<number/2;i++){
			if(number%i==0) {
				flag=false;
				break;
			}
	    } 
		return flag;
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter a number");
		int number = scanner.nextInt();
		PrimeNumber primeNumber= new PrimeNumber();
		boolean result=primeNumber.isPrime(number);//it will call isprime method
		if(result)
			System.out.println("yes it is prime");
		else
			System.out.println("no it is not a prime no.");
		scanner.close();
	}

}
