package com.test2.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program3 {
	public static void main(String args[])	{
		int t1,t2;
		int d1 = 0,d2 = 0;
		int u=10;
		int a=5;
		try	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 2 time intervals (one time interval per line) ");
			t1 = Integer.parseInt(br.readLine());
			t2 = Integer.parseInt(br.readLine());
			d1 = u*t1+((a*t1*t1)/2);
			d2 = u*t2+((a*t2*t2)/2);
			br.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		System.out.println(d1);
		System.out.print(d2);
	}
}

/*
3 . Write a program to calculate the distance travelled by a car at different time intervals. The initial velocity of the car is 36 km/hr and the constant acceleration is 5 m/s2.

The formula to calculate distance is:

Distance Travelled = u*t+((a*t*t)/2) where,
u = initial velocity of the car (36 km/hr)
a = acceleration of the car (5 m/s2)
t = time duration in seconds

The program should accept 2 time intervals as the input (one time interval per line) and print the distance travelled in meters by the car (one output per line).

Definitions:
------------
1 kilometer = 1000 meters
1 hour = 3600 seconds

Let us suppose following are the inputs supplied to the program

10
8

Then the output of the program will be

350
240

*/