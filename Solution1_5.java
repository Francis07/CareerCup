package chapter_1;

/** Write a method to replace all spaces in a string with ¡®%20¡¯
 * 	*/

public class Solution1_5 {
	public static void main(String[] args){
		String str = new String(" ab ca  vbc");
		
		System.out.println(convert(str));
	}
	
	private static String convert(String str){	//the function to check anagrams
		StringBuffer newstr = new StringBuffer();
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == ' ') {
				newstr = newstr.append("%20");
			}else{
				newstr = newstr.append(str.charAt(i));
			}
		}
		return newstr.toString();
	}
}