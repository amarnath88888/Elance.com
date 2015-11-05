package com.test2.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program4 {
	public static void main(String args[])	{
		String strLine = new String();
		String str1,str2;
		int index;
		int sum1 = 0,sum2 = 0;
		try	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a single pair of strings separated by a comma (eg : 123ABC,456DEF)");
			strLine = br.readLine();
			index = strLine.indexOf(',');
			str1 = strLine.substring(0, index);
			str2 = strLine.substring(index+1,strLine.length());
			sum1=sum(str1);
			sum2=sum(str2);
			br.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		System.out.print(sum1-sum2);
	}

	private static int sum(String str) {
		int sum=0;
		int i=0;
		for(i=0;i<str.length();i++){
			sum += str.charAt(i);
		}
		System.out.println(sum);
		return sum;
	}
}

/*
4 . Write a program which will accept a single pair of strings separated by a comma; the program should calculate the sum of ascii values of the characters of each string. The program should then subtract the sum of the ascii values of the second string from the sum of the ascii values of the first string.

Suppose the following input is given to the program:

123ABC,456DEF

Then the sum of the ascii values of the characters in '123ABC' is 348 and in '456DEF' it is 366. The Difference between these numbers is 348 – 366 = -18
The corresponding output to be printed by the program is:

-18

*/