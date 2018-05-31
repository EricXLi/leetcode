package lc.LC824.GoatLatin;


public class RunnerClass {

	public static void run() {
		String input = "The quick brown fox jumped over the lazy dog";
		String expectOutput = "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
		
		Solution s = new Solution();
		String output = s.toGoatLatin(input);
		System.out.println(output);
		System.out.println(output.equals(expectOutput));
	}
}
