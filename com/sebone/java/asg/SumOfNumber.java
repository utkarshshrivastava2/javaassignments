package com.sebone.java.asg;
import java.util.Scanner;
/*Class name - SumOfnumber
 * objective - to show sum of  number  upto n(from user)
 * author - utkarsh/sebone
 * date- 17-03-2022
 */
public class SumOfNumber{
	private int resall;

	/*Class name - SumOfnumber
	 * objective - to calclulate of number upto n
	 * input-number
	 * return-sum of number 
	 * author - utkarsh/sebone
	 * date- 17-03-2022
	 */

	public int sumAll(int number) {
		SumOfNumber res =new SumOfNumber();
	    res.resall= (number*(number+1))/2;
	    return res.resall;
	}
		
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter no upto which u want sum");
		int number= scanner.nextInt();
		SumOfNumber sumOfNumber= new SumOfNumber();
	    int result=sumOfNumber.sumAll(number);
		System.out.println(result);//it will call sumAll method
		scanner.close();
	}

}
