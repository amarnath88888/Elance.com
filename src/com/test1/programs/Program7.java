package com.test1.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Program7
{
 public static void main(String args[])
  {
	 int i=0, j=0, count=0;
  try{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String event1,event2;
  System.out.println("Enter the emp ids of event 1");
  event1=br.readLine();
  System.out.println("Enter the emp ids of event 2");
  event2=br.readLine();

  String empids1[] = event1.split(",");
  String empids2[] = event2.split(",");
  
  for(i=0;i<empids1.length;i++)	{
	  for(j=0;j<empids2.length;j++)	{
		  if(empids1[i].equals(empids2[j]))
			  count++;
	  }
  }
  br.close();
    }catch (Exception e){
  System.err.println("Error: " + e.getMessage());
  }
  System.out.println(count);
  }
}

/*

7 . Ross is an event organizer. He has received data regarding the participation of employees in two different events. Some employees have participated in only one event and others have participated in both events. Ross now needs to count the number of employees who have taken part in both events. The records received by Ross consist of employee ids, which are unique. Write a program that accepts the employee ids participating in each event (the first line relates to the first event and the second line relates to the second event). The program should print the number of common employee ids in both the events.

Suppose the following input is given to the program, where each line represents a different event:

1001,1002,1003,1004,1005
1106,1008,1005,1003,1016,1017,1112

Now the common employee ids are 1003 and 1005, so the program should give the output as:

2

*/