package chapter_1;

import java.util.*;

/** Write a method to decide if two strings are anagrams or not
 * 	*/

public class Solution1_4 {
	public static void main(String[] args){
		String str1 = new String("abcabc");
		String str2 = new String("baccab");
		
		System.out.println(sortString(str1).equals(sortString(str2)));
	}
	
	private static String sortString(String s){	//the function to sort string s
		char[] chArray = s.toCharArray();
		Arrays.sort(chArray);
		return new String(chArray);
	}
}
