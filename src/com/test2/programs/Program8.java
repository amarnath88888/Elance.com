package com.test2.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program8
{
 public static void main(String args[])
 {
 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	 int i,j,k,loop;
 	 int no[] = new int[3];
 	 System.out.println("Enter 3 numbers ");
 	 try {
		 no[0] = Integer.parseInt(br.readLine());
		 no[1] = Integer.parseInt(br.readLine());
		 no[2] = Integer.parseInt(br.readLine());
		 } catch (NumberFormatException e) {
			 e.printStackTrace();
		} catch (IOException e) {
				 e.printStackTrace();
	 }
	for(loop=0;loop<3;loop++)	{
		for(i=1;i<=no[loop];i++)	{
			for(j=no[loop];j>i;j--)	{
				System.out.print(" ");
			}
			for (k=1;k<=i;k++)	{
				System.out.print(i);
				if(k!=i)
					System.out.print(" ");
				}
				System.out.println();
			}
	}
}
}

/*
8 . Write a program which will print the below structures according to the input provided to the program. The program should accept 3 inputs in the form of numbers between 1 and 9, both inclusive (one number per line) and then generate the corresponding structures based on the input.

Suppose the following sequence of numbers is supplied to the program:

3
2
4

Then the output should be:

  1
 2 2
3 3 3
 1
2 2
   1
  2 2
 3 3 3
4 4 4 4



*/