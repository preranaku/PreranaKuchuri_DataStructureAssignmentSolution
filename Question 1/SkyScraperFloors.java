//package com.greatlearning;
import java.util.*;
import java.util.Stack;

class SkyScraperFloors
{
	
	public static Stack<Integer> sortstack(Stack<Integer>
											input)
	{
		Stack<Integer> tmpStack = new Stack<Integer>();
		while(!input.isEmpty())
		{
			
			int tmp = input.pop();
		
			
			while(!tmpStack.isEmpty() && tmpStack.peek()
												> tmp)
			{
				
			input.push(tmpStack.pop());
			}
			
			
			tmpStack.push(tmp);
		}
		return tmpStack;
	}




	public static void main(String[] args) 
	{

  		Scanner sc = new Scanner(System.in);
  		System.out.println("Enter the total no. of floors: ");

  		int number = sc.nextInt();
  		int[] array = new int[number];

  		Stack<Integer> stack = new Stack<Integer>();
  		for(int i = 1; i <= array.length; i++)
      		{
      	  		System.out.println("Enter your floor size given on Day  " +i+ ":");
          		int value = sc.nextInt();              
          		stack.push(value);
      		}

  		Stack<Integer> tmpStack=sortstack(stack);
      		while (!(tmpStack.isEmpty())) 
      		{
        		System.out.println ("The order of construction is as follows: ");
        		for(int i = 1; i <= array.length; i++)
        		{
                  System.out.println("Day" +i+ "");
                  System.out.println(tmpStack.pop());
        		}

      		}    
    
    }
	
}