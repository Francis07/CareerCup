package chapter_1;

/** Write code to reverse a C-Style String  (C-String means that ¡°abcd¡± is represented as
 * 	five characters, including the null character )
 * 
 * 	Note: A C-Style String ends with '/0'
 * 	*/

public class Solution1_2 {
	public static void main(String[] args){
		StringBuffer str = new StringBuffer("123asdf").append('\0');
		
		System.out.println(str);
		System.out.println(reverseCString(str));
	}
	
	private static StringBuffer reverseCString(StringBuffer str){	//the function to remove duplicate characters
		return str.deleteCharAt(str.length()-1).reverse().append('\0');
	}
}