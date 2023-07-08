package Assignement;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String  str = "srinadh";
		String str2= "sirnahd";
		
		
		
		char[] ch = str.toCharArray();
		char[] ch1 = str2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch, ch1))
			System.out.println("Yes it is a anagram...");
		else
			System.out.println("NO a anagram...............");
		
	}

}
