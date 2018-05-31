package lc;

public class MainClass {	
    public static void main( String[] args ) {
    	System.out.println("----------Start-----------");
    	long startTime = System.nanoTime();
    	lc.LC824.GoatLatin.RunnerClass.run();
    	long endTime = System.nanoTime();
    	System.out.println("----------Finish----------");
    	System.out.println("Total running time: "+ (endTime - startTime)/1000 + " micro seconds");
    }
}
