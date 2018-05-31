package lc.LC062.UniquePaths;


public class RunnerClass {

	public static void run() {
		int m = 3;
		int n = 7;
		
		Solution s = new Solution();
		int paths = s.uniquePaths(m,n);
		System.out.println(paths);
			
	}
}
