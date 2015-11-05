package com.test1.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program10 {
	public static void main(String args[])	{
		String strLine[] = new String[3];
		int i=0;
		try	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 2 time intervals (one time interval per line) ");
			while (i<3)   {
				
			}
			br.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
}

/*

10 . Write a program which will take the year (yyyy) and the numeric sequence of the month (0-11) as its input. The program will return the day on which the 28th of that particular month and year falls. The input can consist of two year-month combinations, one combination per line.

The numeric sequence of months is as follows:

0 – Jan
1 – Feb
2 – March
and so on......

The format for supplying the input is:

1999-5

Where 1999 is the year and 5 is the numeric sequence of the month (corresponding to June). The program should display the day on which June 28, 1999 fell, and in this case the output will be MONDAY.

The output should be displayed in uppercase letters.

Suppose the following INPUT sequence is given to the program:

1999-5
1998-6

Then the output should be:

MONDAY
TUESDAY
*/