import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        List<Integer> bitsList = new ArrayList<Integer>();
        int tempN = n;
        while(tempN != 0){
        	int rem = tempN % 2;
        	tempN = tempN/2;
        	bitsList.add(rem);
        }
        int maxConsOnes = 0;
        int tempMaxConsOnes = 0;
        for(int i=0; i<bitsList.size(); i++){
        	if(bitsList.get(i) == 1){
        		tempMaxConsOnes++;
        	}
        	else{
        		if((tempMaxConsOnes > maxConsOnes)){
        			maxConsOnes = tempMaxConsOnes;
        		}
        		tempMaxConsOnes = 0;
        	}
        	//If end of the list is reached the assign
        	if(i == bitsList.size() -1){
        		if((tempMaxConsOnes > maxConsOnes)){
        			maxConsOnes = tempMaxConsOnes;
        		}
        	}
        }
        System.out.println(maxConsOnes);
    }
}
