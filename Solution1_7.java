package chapter_1;

/** Write an algorithm such that if an element in an MxN matrix is 0, its entire row and 
 * 	column is set to 0
 * 	*/

public class Solution1_7{
	static int m = 3;
	static int n = 5;
	public static void main(String[] args){
		int[][] a = {{0,9229,863,47,0},{23,0,45,0,63},{132,9,84,71,83}};
		int[][] b = new int[m][n];
		printMatrix(a);
		b = setZero(a);
		printMatrix(b);
	}
	
	private static int[][] setZero(int[][] a){
		int[][] b = new int[m][n];
		boolean row[] = new boolean [n];  //true±Ì æ∑«0
		for (int j = 0; j < n; j++){
			row[j] = true;
		}
		
		boolean col[] = new boolean [m];
		for (int i = 0; i < m; i++){
			col[i] = true;
		}
		
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				if (a[i][j] == 0){
					row[j] &= false;
					col[i] &= false;
				}
			}
		}
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				if (row[j] && col[i]){
					b[i][j] = a[i][j];
				}
			}
		}
		return b;
	}
	
	private static void printMatrix(int[][] a){
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}

