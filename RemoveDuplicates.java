package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
	String str = "Paypal India";
	char[] charArray = str.toCharArray();
	Set<Character> ch = new LinkedHashSet<Character>();
for(char c : charArray)
	{
		ch.add(c);
	}
	
	System.out.println(ch);
	
	
	
}}