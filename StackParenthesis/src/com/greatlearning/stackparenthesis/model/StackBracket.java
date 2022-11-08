package com.greatlearning.stackparenthesis.model;

import java.util.Stack;

public class StackBracket {
	private static boolean checkBracket(String input) {
		Stack <Character> stack=new Stack<>();
		int i;
		char k;
		for(i=0; i<input.length();i++)
		{
			k=input.charAt(i);
			if(k=='['||k=='{'|| k== '(')
			{
				stack.push(k);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char z;
			switch(k)
			{
			case ']' :
				z=stack.pop();
				if(z=='{'|| z=='(')
					return false;
				break;
			case '}' :
				z=stack.pop();
				if(z=='['|| z=='(')
					return false;
				break;
			case ')' :
				z=stack.pop();
				if(z=='{'|| z=='[')
					return false;
				break;
				
			}
		}
		return(stack.isEmpty());
		//return false;
	}


	public static void main(String[] args)
	{
		String input="([[{}]])";
		boolean result = checkBracket(input);
		if(result)
		{
			System.out.println("The Entered String has Balanced Brackets");
		}
		else
		{
			System.out.println("The Entered String do not contain Balanced Brackets");
		}
	
	}

	
}
