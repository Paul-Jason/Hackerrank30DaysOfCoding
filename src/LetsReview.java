import java.io.*;
import java.util.*;

public class LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int T = scan.nextInt();
    	scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    	String[] arrStrings = new String[T];
    	for(int i=0; i<T; i++){
        	String str  = scan.nextLine();
        	arrStrings[i] = str;
    	}
    	scan.close();
    	for(int i=0; i<arrStrings.length; i++){
    		String str = arrStrings[i];
    		StringBuffer evenStr = new StringBuffer();
    		StringBuffer oddStr = new StringBuffer();
    		for(int j = 1; j<=str.length(); j++){
    			if(j%2 == 0){
    				evenStr.append(str.charAt(j-1));
    			}
    			else{
    				oddStr.append(str.charAt(j-1));
    			}
    		}
    		System.out.println(oddStr + " " + evenStr);
    	}
    }
}

