import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RegEx {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Hashtable<String,String> table = new Hashtable<>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            table.put(firstName, emailID);
        }
        
        String myRegExString = "[a-z]+@gmail.com";
        Pattern p = Pattern.compile(myRegExString);
        
        List<String> sortedNames = new ArrayList<String>();
        for(String name : table.keySet()){
        	String email = table.get(name);
        	Matcher m = p.matcher(email);
        	if(m.find()){
        		sortedNames.add(name);
        	}
        }
        
        //sorting
        sortedNames = sort(sortedNames);
         
        scanner.close();
    }
    
    public static List<String> sort(List<String> unsortedArray){
		return null;
    }
}
