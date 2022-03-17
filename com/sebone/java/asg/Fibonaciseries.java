package com.sebone.java.asg;
import java.util.Scanner;

/*Class name - Fibonaciseries
 * objective - to create a fibonaci series upto n
 * author - utkarsh
 * date- 17-03-2022
 */
public class Fibonaciseries {
	/*method name - main method 
	 * objective - to give a fibonaci series upto n(from user)
	 * author - utkarsh
	 * date- 17-03-2022
	 */
	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter a number upto which you want fibonaci");
	int number= scanner.nextInt();
	int term1=0,term2=1;
	int term3=term1+term2;
	System.out.println(term1);
	System.out.println(term2);
	for(int i=1;i<=number;i++)
	{
		System.out.println(term3);
		term1=term2;
		term2=term3;
		term3=term1+term2;	
	}
	}

}
