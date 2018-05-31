package lc.LC374.GuessNumberHigherOrLower;

import java.util.Random;

public class GuessGame {
	private static Random ran = new Random();
	//private static int number = ran.nextInt(Integer.MAX_VALUE);
	private static int number = ran.nextInt(20000);
	//private static int number = 2;
	public GuessGame(){
		System.out.println();
		System.out.println("Target Number is: "+number);
	}

	int guess(int num) {
		if(num > number) {
			return -1;
		} else if(num < number) {
			return 1;
		} else {
			return 0;
		}
	}
}
