package chapter_1;

/** Design an algorithm and write code to remove the duplicate characters in a string
 * 	without using any additional buffer  NOTE: One or two additional variables are fine   
 * 	An extra copy of the array is not
 * 	FOLLOW UP
 * 	Write the test cases for this method
 * 	*/

public class Solution1_3 {
	public static void main(String[] args){
		StringBuffer[] str_array = {
				new StringBuffer(),
				new StringBuffer(""),
				new StringBuffer("a"),
				new StringBuffer("aabb"),
				new StringBuffer("abcd"),
				new StringBuffer("ababa"),
		};
		
		for (StringBuffer str : str_array){
			rmdup(str);
			System.out.println(str.toString());
		}
	}
	
	private static void rmdup(StringBuffer str){	//the function to remove duplicate characters
		if (str == null) {
			return;
		}
		if (str.length() < 2){
			return;
		}
		int p = 0;	//the pointer of the new array
		for (int i = 0; i < str.length(); i++){	//to handle with each character 
			int j = 0;
			while ((j < p) && (str.charAt(j) != str.charAt(i))){	//to check if this character has appeared
				j++;
			}
			if (j == p){	//meaning it isn't duplicate
				str.setCharAt(p++, str.charAt(i));	//to add it to the new array
			}
		};
		str.delete(p, str.length());
	}
}