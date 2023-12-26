package Arijit_AutomationFramework.Arijit_AutomationFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class InterviewCompilation {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();

		int l=s.length();
        int i=0,letter=0,digit=0,specialchar=0;
        
        
		for(i=0;i<l;i++)
		{
          if(Character.isLetter(s.charAt(i)))
          {
        	 letter++;
          }
          else if(Character.isDigit(s.charAt(i)))
          {
        	  digit++;
          }
          else
          {
        	  specialchar++;
          }
		}
		System.out.println("LETTER COUNT : "+letter);
		System.out.println("DIGIT COUNT : "+digit);
		System.out.println("SPECIAL CHARACTER COUNT : "+specialchar);
		
	}
}
		
		
		
		
		
//      String s="ARIJIT";
//      int l=s.length();
//      int count=0;
//      for(int i=0;i<l;i++)
//      {
//    	 // System.out.println(s.charAt(i));
//    	  
//    	  String g=String.valueOf(s.charAt(i));
//    	  //System.out.println(g);
//    	  
//    	  if(g.equalsIgnoreCase("A")||g.equalsIgnoreCase("E")||g.equalsIgnoreCase("I")||g.equalsIgnoreCase("O")||g.equalsIgnoreCase("U"))
//    	  {
//    		  count++;
//    	  }
//      }
//      
//      System.out.println(count);
	

