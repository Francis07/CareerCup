package chapter_1;

import java.util.HashSet;

/** Implement an algorithm to determine if a string has all unique characters  What if you 
 * 	can not use additional data structures?
 * 	*/

public class Solution1_1 {
	public static void main(String[] args){
		String str = new String("absdf");
		System.out.println(checkUnique_1(str));
		System.out.println(checkUnique_2(str));
	}
	
	//hash set
	private static boolean checkUnique_1(String str){
		HashSet<Character> set = new HashSet<Character>();
		for(char ch : str.toCharArray()){
			if (!set.contains(ch)){
				set.add(ch);
			}
			else{
				return false;
			}
		}
		return true;
	}
	
	//O(n*n) or O(n*logn) search
	private static boolean checkUnique_2(String str){
		ShellSort ss = new ShellSort();
		return ss.check(str.toCharArray());
	}
	
	//Shell Sort
	private static class ShellSort {

		public boolean check(char[] data) {
			sort(data);
			for (int i = 0; i < data.length - 1; i++){
				if (data[i] == data[i + 1]){
					return false;
				}
			}
			return true;
		}
		
	    public void sort(char[] data) {
	        for(int i = data.length / 2; i > 2;i /= 2){
	            for(int j = 0; j < i; j++){
	                insertSort(data, j, i);
	            }
	        }
	        insertSort(data, 0, 1);
	    }

	    private void insertSort(char[] data, int start, int inc) {
	        for(int i = start + inc; i < data.length; i += inc){
	            for(int j = i;(j >= inc) && (data[ j ] < data[ j-inc ]); j -= inc){
	                swap(data, j, j-inc);
	            }
	        }
	    }
	    private void swap(char[] data, int i, int j) {
	    	char temp = data[i];
	        data[i] = data[j];
	        data[j] = temp;
	    }

	}
	
}