package chapter_1;

/** Given an image represented by an NxN matrix, where each pixel in the image is 4 
 * 	bytes, write a method to rotate the image by 90 degrees  Can you do this in place?
 * 	*/

public class Solution1_6{
	static int n = 2;
	public static void main(String[] args){
		int[][] a = {{9229,86347},{2345,63}};
		printMatrix(a);
		rotateMatrix(a);
		printMatrix(a);
	}
	
	private static void rotateMatrix(int[][] a){
		for (int i = 0; i < n/2; i++){
			for (int j = i; j < n - i - 1; j++){
				//4 pixels are (i, j) (j, n - i - 1), (n - i - 1, n - j - 1), (n - j - 1, i)
				int temp = a[ i ][ j ];
				a[ i ][ j ] = a[ j ][ n - i - 1 ];
				a[ j ][ n - i - 1 ] = a[ n - i - 1 ][ n - j - 1 ];
				a[ n - i - 1 ][ n - j - 1 ] = a[ n - j - 1 ][ i ];
				a[ n - j - 1 ][ i ] = temp;
			}
		}
	}
	private static void printMatrix(int[][] a){
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

