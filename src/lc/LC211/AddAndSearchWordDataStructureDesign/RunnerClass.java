package lc.LC211.AddAndSearchWordDataStructureDesign;

public class RunnerClass {

	public static void run() {

		WordDictionary wd = new WordDictionary();
		wd.addWord("at");
		wd.addWord("and");
		wd.addWord("an");
		wd.addWord("add");
		wd.addWord("a");
		wd.addWord("bat");
		
		//System.out.println(wd.search("pad"));
		//System.out.println(wd.search("bad"));
		//System.out.println(wd.search(".ad"));
		//System.out.println(wd.search("a.d"));

		System.out.println(wd.search("...."));
		
	}
}
