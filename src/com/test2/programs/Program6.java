package com.test2.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program6 {
	public static void main(String args[])	{
		String strLine[] = new String[4];
		int i=0;
		boolean isvalid[] = {true,true,true,true};
		try	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 4 usernames (one username per line) ");
			while (i<4)   {
				strLine[i] = br.readLine();
				isvalid[i] = check(strLine[i]);
			}
			br.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}

	private static boolean check(String string) {
		boolean isvalid = true;
		int i=0;
		if(!(string.length()>=5 && string.length()<=10))
			return false;
		for(;i<string.length();i++)	{
			if(string.charAt(i)==' ')	{
				isvalid = false;
				break;
			}
			else if((string.charAt(i)>=48 && string.charAt(i)<=57)&&((string.charAt(i)=='@')||(string.charAt(i)=='#')||(string.charAt(i)=='*')||(string.charAt(i)=='=')))	{
				
			}
		}
		return isvalid;
	}
}

/*

6 . Sam wants to select a username in order to register on a website.

The rules for selecting a username are:

1. The minimum length of the username must be 5 characters and the maximum may be 10.
2. It should contain at least one letter from A-Z
3. It should contain at least one digit from 0-9
4. It should contain at least one character from amongst @#*=
5. It should not contain any spaces

Write a program which accepts 4 usernames (one username per line) as input and checks whether each of them satisfy the above mentioned conditions.
If a username satisfies the conditions, the program should print PASS (in uppercase)
If a username fails the conditions, the program should print FAIL (in uppercase)

Suppose the following usernames are supplied to the program:
1234@a
ABC3a#@
1Ac@
ABC 3a#@

Then the output should be:
FAIL
PASS
FAIL
FAIL

*/