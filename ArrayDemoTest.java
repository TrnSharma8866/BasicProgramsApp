package com.reg.java;

class Arraydemo 
{
	//Print All Elements in the Array
	public static void arrayelements(int arr[]) 
	{
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(" "+arr[i]+" ");
		}
	}	
	//Print Even Numbers in the Array
	public static void Evennum(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{ 
				System.out.print(" "+arr[i]+" ");
			}
		}
	}
	//Print Odd Numbers in the Array
	public static void Oddnum(int arr[])
	
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(" "+arr[i]+" ");
			}
		}
	}
	//Print Elements of Array which are placed in even index
	public static void Evenindex(int arr[])
	{
		for(int index=2;index<arr.length;index+=2)	
		System.out.print(" "+arr[index]+" ");
	}
	//Print Elements of Array which are placed in odd index
	public static void Oddindex(int arr[])
	{
		for(int index=1;index<arr.length;index+=2)
		System.out.print(" "+arr[index]+" ");
	}
	//Print Elements of Array middle to right
	public static void Middletoright(int arr[])
	{
		for(int i=9;i<arr.length;i++)
		System.out.print(" "+arr[i]+" ");
	}
	//Print Elements of Array middle to left
	public static void Middletoleft(int arr[])
	{
		for(int i=9;i>=0;i--)
			System.out.print(" "+arr[i]+" ");
	}
	//Print Alternate index elements in Array
	public static void Alternatenum(int arr[])
	{
		for(int i=0;i<arr.length;i+=2)
		System.out.print(" "+arr[i]+" ");
	}
	//To Determine the index of given number in the Array
	public static void Findindex(int arr[], int x)
	{
		for(int i=0;i<arr.length;i++)
		if (arr[i]==x)
		System.out.println(i);
	}
	public static void Sumavg(int arr[])
	{
		int sum=0,avg;
	    for(int i=0;i<arr.length;i++)
	    sum=sum+arr[i];
		avg=sum/arr.length;
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+avg);
	}

	
	
}



public class ArrayDemoTest 
{
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		System.out.println("The Elements in the Array are:");
		Arraydemo.arrayelements(arr);
	
		System.out.println("\nThe Even Numbers in the Array are:");
		Arraydemo.Evennum(arr);
		
		System.out.println("\nThe Odd Numbers in the Array are:");
		Arraydemo.Oddnum(arr);
		
		System.out.println("\nGoing to print Elements at Even index of Array");
		Arraydemo.Evenindex(arr);
		
		System.out.println("\nGoing to print Elements at Odd index of Array");
		Arraydemo.Oddindex(arr);
		
		System.out.println("\nPrint Array Elements from middle to right");
		Arraydemo.Middletoright(arr);
	
		System.out.println("\nPrint Array Elements from middle to Left");
		Arraydemo.Middletoleft(arr);

		System.out.println("\nPrint Array elements in Alternate index");
		Arraydemo.Alternatenum(arr);
	
		System.out.println("\nIndex of the number in array");
		Arraydemo.Findindex(arr, 13);
		
		System.out.println("\nSum and Average of Array elements");
		Arraydemo.Sumavg(arr);
	}
	
}
