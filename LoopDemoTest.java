package com.reg.java;

class LoopsDemo {
	// Print 1 to 10 numbers
	public static void print1to10(int x) {
		for (x = 1; x <= 10;) {
			System.out.print(x + "  ");
			x++;
		}
	}

	// Print 10 to 1 numbers
	public static void print10to1(int x) {
		for (x = 10; x > 0; x--) {
			System.out.print(" " + x + " ");
		}
	}

	// Print only Even Numbers
	public static void Evennum(int x) {
		for (int i = 0; i < x; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + i + " ");
			}
		}
	}

	// Print Only Odd Numbers
	public static void Oddnum(int x) {

		for (int i = 0; i < x; i++) {
			if (i % 2 != 0) {
				System.out.print(" " + i + " ");

			}
		}
	}

	// Print Alternate numbers 1 to 20
	public static void PrintAlt(int x) {
		int i = 1;
		for (i = 1; i < x; i = i + 2) {
			System.out.print(" " + i + " ");
		}
	}

	// Print numbers Divisible by 7
	public static void Diviby7(int x) 
    {
    	for(int i=1;i<20;i++)
    	{ 
    		if(i%7==0)
    		{
    			System.out.print(" "+i+" ");
    		}
    	}
    }
	// Print Prime Numbers from 1 to 20
	public static void PrintPrime(int x)  
	   {
		  
		   	   for(int i=0;i<=x;i++)
		   	   {  
		   		   int flag=0;
		   		   for (int j=2;j<=i/2;j++)
		   		   { 
		   			   if(i%j==0)
		   			   {
		   				flag=1;   
		   			   }
		   		   }	   
		   			   if(flag==0)
		   			   {
		   				   System.out.print(" "+i+" ");
		   			   }
		   	   }		   			   	
         }
}

	
public class LoopDemoTest {
	
	public static void main (String agrs[]) {
		
	int x=20;	
    
	System.out.print("Print numbers 1 to 10:\n ");
	LoopsDemo.print1to10(x);

 	System.out.println("\nPrint number 10 to 1:");
	LoopsDemo.print10to1(x);
	
	System.out.println("\nEven Number are:");
	LoopsDemo.Evennum(x);
	
	System.out.println("\nOdd Numbers Are:");
	LoopsDemo.Oddnum(x);
	
	System.out.println("\nPrint Alternate Numbers 1 to 20");
	LoopsDemo.PrintAlt(x);
	
	System.out.println("\nNumbers divisible by 7");
	LoopsDemo.Diviby7(x);
	
	System.out.println("\nPrint Prime numbers 1 to 20 ");
	LoopsDemo.PrintPrime(x);

}}
