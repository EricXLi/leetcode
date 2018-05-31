package lc.LC063.UniquePathsII;

//Thoughts: it can go down or go right
//so the problem is uniquePaths(m, n-1) + uniquePaths(m-1, n)
//we can use a dictionary to keep result that's already there - DP, we can use a two dimentional array
//we have base case of uniquePaths (1,1) = 1
class Solution {
	 public int uniquePaths(int m, int n) {
		 int[][] arr = new int[m][n];
		 return recurFunction(m, n, arr);		 
	 }
	 
	 private int recurFunction(int m, int n, int[][] arr) {
		//System.out.println(m + " " + n);
		int paths = 0;
		//base case
		if(m == 1){
			paths = recurFunction(1, n-1, arr);
		} else if(n == 1) {
			paths = recurFunction(m - 1,  1, arr);
		} 
		
		if(arr[m-1][n-1] != 0) {
			paths = arr[m-1][n-1];
		} else {
			paths = recurFunction(m-1, n, arr) + recurFunction(m, n-1, arr); 
			arr[m-1][n-1] = paths;
		}
		return paths;
	 }
}