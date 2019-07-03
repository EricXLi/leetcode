package lc.LC423.reconstructOriginalDigitsfromEnglish;
import java.lang.Math;
//count all the letters and stripe everything?
// z,x,w,u,g only appears once, we got the count for those automatically
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Reconstruct Original Digits from English.
//Memory Usage: 38 MB, less than 100.00% of Java online submissions for Reconstruct Original Digits from English.

class Solution {
  public String originalDigits(String s) {
      int[] alphabet = new int[26];
      for(char c : s.toCharArray()){
          alphabet[c-'a']++;
      }
      int[] numbers = new int[10];
      //count zero
      numbers[0] = alphabet['z'-'a'];
      alphabet['z'-'a'] -= numbers[0];
      alphabet['e'-'a'] -= numbers[0];
      alphabet['r'-'a'] -= numbers[0];
      alphabet['o'-'a'] -= numbers[0];
      //count six
      numbers[6] = alphabet['x'-'a'];
      alphabet['s'-'a'] -= numbers[6];
      alphabet['i'-'a'] -= numbers[6];
      alphabet['x'-'a'] -= numbers[6]; 
      //count two
      numbers[2] = alphabet['w'-'a'];
      alphabet['t'-'a'] -= numbers[2];
      alphabet['w'-'a'] -= numbers[2];
      alphabet['o'-'a'] -= numbers[2]; 
      //count four
      numbers[4] = alphabet['u'-'a'];
      alphabet['f'-'a'] -= numbers[4];
      alphabet['o'-'a'] -= numbers[4];
      alphabet['u'-'a'] -= numbers[4]; 
      alphabet['r'-'a'] -= numbers[4]; 
      //count eight
      numbers[8] = alphabet['g'-'a'];
      alphabet['e'-'a'] -= numbers[8];
      alphabet['i'-'a'] -= numbers[8];
      alphabet['g'-'a'] -= numbers[8];
      alphabet['h'-'a'] -= numbers[8];
      alphabet['t'-'a'] -= numbers[8];
      //count one
      numbers[1] = getMin(alphabet['o'-'a'], alphabet['n'-'a'], alphabet['e'-'a']);
      alphabet['o'-'a'] -= numbers[1];
      alphabet['n'-'a'] -= numbers[1];
      alphabet['e'-'a'] -= numbers[1];
      //count three
      numbers[3] = getMin(alphabet['t'-'a'], alphabet['h'-'a'], alphabet['r'-'a'], 2 * alphabet['r'-'a']);
      alphabet['t'-'a'] -= numbers[3];
      alphabet['h'-'a'] -= numbers[3];
      alphabet['r'-'a'] -= numbers[3];
      alphabet['e'-'a'] -= numbers[3] * 2;
      //count five
      numbers[5] = getMin(alphabet['f'-'a'], alphabet['i'-'a'], alphabet['v'-'a'], alphabet['e'-'a']);
      alphabet['f'-'a'] -= numbers[5];
      alphabet['i'-'a'] -= numbers[5];
      alphabet['v'-'a'] -= numbers[5];
      alphabet['e'-'a'] -= numbers[5];
      //count seven
      numbers[7] = getMin(alphabet['s'-'a'], alphabet['v'-'a'], alphabet['e'-'a'] * 2, alphabet['n'-'a']);
      alphabet['s'-'a'] -= numbers[7];
      alphabet['v'-'a'] -= numbers[7];
      alphabet['n'-'a'] -= numbers[7];
      alphabet['e'-'a'] -= numbers[7] * 2;
      //count nine        
      numbers[9] = getMin(alphabet['n'-'a'], alphabet['i'-'a'], alphabet['n'-'a'], alphabet['e'-'a']);
      alphabet['n'-'a'] -= numbers[9];
      alphabet['i'-'a'] -= numbers[9];
      alphabet['n'-'a'] -= numbers[9];
      alphabet['e'-'a'] -= numbers[9];
      
      StringBuilder sb = new StringBuilder();
      for(int i = 0 ; i < numbers.length ; i++ ) {
          while(numbers[i] > 0 ){
              sb.append(i);
              numbers[i]--;
          }
      }
      return sb.toString();
  }
  
  private int getMin(int ... numbers) {
	  int min = Integer.MAX_VALUE;
	  for(int number : numbers) {
		  min = (number < min) ? number : min;
	  }
	  return min;
  }
}
