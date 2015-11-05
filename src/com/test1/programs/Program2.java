package com.test1.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program2
{
 public static void main(String args[])	{
	 String strLine[] = new String[3];
	 String words[];
	 List<String> output = new ArrayList<String>();
	 int i=0;	  
	 try	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter three sentences (one sentence per line) ");
		 while (i<3)   {
			 strLine[i] = br.readLine();
			 words = strLine[i].split(" ");
			 for(String str : words)	{
				 if(str.charAt(0)>=65 && str.charAt(0)<=90)
					 output.add(str);
			 }
			 i++;
		 }
		 br.close();
	 }catch (Exception e){
		  System.err.println("Error: " + e.getMessage());
	 }
	 for(String list : output)	{
		 System.out.println(list);
	 }
  }
}

/*
2 . Write a program which will accept three sentences (one sentence per line) and print the words having Initial Caps within the sentences. Below is an example.

Here is an example. If the below three sentences are given to the program as input,

This is a Program
Coding test of Initial Caps
the program Will Test You

Then, the output would look like:

This
Program
Coding
Initial
Caps
Will
Test
You


Note: In case of input data being supplied to the question, it should be assumed to be a console input. 

*/