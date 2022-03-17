package com.sebone.java.asg;
import java.util.Scanner;
/*Class name - Factorial
 * objective - to calculate factorial of  number(from user)
 * author - utkarsh
 * date- 17-03-2022
 */
public class Factorial {    /*method name - factorial;
	 * objective- to calculate factorial
	 * author-utkarsh
	 */
	public int factorial(int number) {
		int res=1;
		while(number>0) {
			res= res*number;
			number--;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter no upto which u want factorial");
		int number= scanner.nextInt();
		Factorial factorial= new Factorial();//varialbe name hould be drive from class name
		//never use caps
		int result=factorial.factorial(number);
		System.out.println(result);//it will call factorial method
		scanner.close();
	}

}
