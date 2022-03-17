package com.sebone.java.asg;
import java.util.Scanner;


/*Class name - Factorial
 * objective - to reverse the string(from user)
 * author - utkarsh/sebone
 * date- 17-03-2022
 */
public class ReverseOfString {
 /*Class name - Factorial
 * objective - to reverse the string(from user)
 * input- String
 * output- reverse of the string in char[]
 * author - utkarsh/sebone
 * date- 17-03-2022
 */
	public char[] reverseOfString(String array) {
		char[] array1= array.toCharArray();
		int len= array.length();
		for(int i=0,j=len-1;i<j;i++,j--) {  
			char temp = array1[i];
		    array1[i]=array1[j];
		    array1[j]=temp;
		}
		return array1;
    }
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a string");
		String string= s.nextLine();
	    ReverseOfString reverseofstring= new ReverseOfString();
	    char[]result=reverseofstring.reverseOfString(string);//it will call reverseOfstring method
	    System.out.println(result);
	    s.close();
	}
}
