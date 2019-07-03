package lc.LC409.LongestPalindrome;

class Solution {
    public int longestPalindrome(String s) {
    	//from 65 A - 122 z, there's some symbols in the middle, [91 \92 ]93 ^94 _95 `96
    	//hense the array needs to be a bit bigger than 26 * 2
    	//Also, according to Java spec below, no need to initialize 
    	//{Each class variable, instance variable, or array component is initialized with a default value when it is created (§15.9, §15.10) [...] For type int, the default value is zero, that is, 0.  }}
    	
    	//in the solution, they are using int[128] and using letters[c] directly which is cleanner solution I think
    	int[] letters = new int[58];
    	int palindromeLen = 0;
    	for(char c : s.toCharArray()) {
    		letters[c-'A']++;
    	}
    	
    	for(int value : letters) {
    		//first devide by 2 to get the count of paired numbers then multiply by 2 to have the actual length
    		palindromeLen += (value/2)*2;
    	}
    	if(palindromeLen < s.length()) {
    		//add unique center
    		palindromeLen++;
    	}
    	
        return palindromeLen;
    }
}
