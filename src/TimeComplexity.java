import java.io.*;
import java.util.*;

public class TimeComplexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int T = scan.nextInt();
    	while(T-->0){
    		int number = scan.nextInt();
    		boolean prime = checkPrimability(number);
    		if(prime){
    			System.out.println("Prime");
    		}
    		else{
    			System.out.println("Not prime");
    		}
    	}
    }

	private static boolean checkPrimability(int number) {
		boolean prime = true;
		if(number == 1){
			return false;
		}
		for(int i = 2; i <= Math.sqrt(number); i++){
			if(number % i == 0){
				prime = false;
			}
		}
		return prime;
	}
}

