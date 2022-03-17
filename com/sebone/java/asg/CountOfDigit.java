package com.sebone.java.asg;
//com.<orgname>.<>groupname>
//com.sebone.asgmt
import java.util.Scanner;
/*Class name - Countofdigit
 * objective - to calculate total number of digit in a number(from user)
 * author - utkarsh
 * date- 17-03-2022 */
public class CountOfDigit {   
	/* method name - CountOfDigit
	 * objective - to calculate total number of digit in a number(from user)
	 * input- number
	 * return- total of digits in the number */
	public int countOfDigit(int number) {
		int res=0;
		while(number>0) {
			number/=10;
			res++;
		}
		return res;
	}
	/* method name - main method
	 * objective - it will call counofdigit method for number(from user) 
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number");
		int number= scanner.nextInt();
		CountOfDigit countOfDigit= new CountOfDigit();
		int result=countOfDigit.countOfDigit(number);//it will call countofdigit method
        System.out.println(result);
        scanner.close();
	}

}
