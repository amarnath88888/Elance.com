package com.test1.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program9 {
	public static void main(String args[])	{
		int hop[] = new int[4];
		int distance[] = new int[4];
		int one=20,two=30;
		int r=0;
		int i=0;
		try	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 4 numbers of hops (one number per line)  ");
			while (i<4)   {
				hop[i] = Integer.parseInt(br.readLine());
				distance[i]=(hop[i]/3)*35;
				r=hop[i]%3;
				if(r==1)
					distance[i]+=one;
				else if(r==2)
					distance[i]+=two;
				i++;
			}
			br.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		for(i=0;i<4;i++)
			System.out.println(distance[i]);
	}
}

/*

9 . Kermit, a frog hops in a particular way such that:
1. He hops 20cm in the first hop, 10cm in the second hop and 5cm in the third hop.
2. After three hops Kermit rests for a while and then again follows the same hopping pattern.

Calculate the total distance travelled by Kermit (in centimeters) for the provided number of hops. Exactly 4 numbers of hops will be provided to the program (one number per line) as per the below example.

Suppose the following number of hops is provided to the program:

4
6
3
5

Then the total distance covered should be displayed as follows:

55
70
35
65

*/