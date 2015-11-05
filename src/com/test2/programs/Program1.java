
package com.test2.programs;
import java.io.*;
public class Program1
{
 public static void main(String args[])
  {
  try{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String strLine[] = new String[10];
  String name[] = new String[10];
  String score[] = new String[10];
  int i=0;
  System.out.println("Enter the values of 10 student's name and mark in the format (rollno-mark)");
  while (i<10)   {
	  strLine[i] = br.readLine();
	  name[i] = (strLine[i].split("-", 2))[0];
	  score[i] = strLine[i].substring((strLine[i].indexOf("-"))+1);
	  System.out.println(name[i]+"==="+score[i]);
	  
	  i++;
  }
  br.close();
    }catch (Exception e){
  System.err.println("Error: " + e.getMessage());
  }
  }
}

/*
 * 1 . Write a program that accepts 10 student records (roll number and score) and prints them in decreasing order of scores. In case there are multiple records pertaining to the same student, the program should choose a single record containing the highest score. The program should be capable of accepting a multi-line input. Each subsequent line of input will contain a student record, that is, a roll number and a score (separated by a hyphen). The output should consist of the combination of roll number and corresponding score in decreasing order of score.

INPUT to program

1001-40
1002-50
1003-60
1002-80
1005-35
1005-55
1007-68
1009-99
1009-10
1004-89

OUTPUT from program

1009-99
1004-89
1002-80
1007-68
1003-60
1005-55
1001-40


Note: In case of input data being supplied to the question, it should be assumed to be a console input. 

public class MarksComparator implements Comparator
{
    Map    base;
 
    public MarksComparator(Map base)
    {
        this.base = base;
    }
 
    public int compare(Object a, Object b)
    {

        return ((Integer)base.get(a)).compareTo((Integer)base.get(b));
    }
 
 
public class Main
    {
        public static void main(String[] args)
        {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            MarksComparator marksComp= new MarksComparator (map);
            TreeMap<String, Integer> sorted_map = new TreeMap(marksComp);
            map.put("1001", 99);
            map.put("1005", 67);
            map.put("1003", 65);
            map.put("1002", 100);
            sorted_map.putAll(map);
                   
          }
    }

 */