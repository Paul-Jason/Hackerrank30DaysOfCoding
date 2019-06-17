package NestedLogic;
import java.io.*;
import java.util.*;

public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	String actualDate = scan.nextLine();
    	String[] actualDateSplit = actualDate.split(" ");
    	int actualDay = Integer.parseInt(actualDateSplit[0]);
    	int actualMonth = Integer.parseInt(actualDateSplit[1]);
    	int actualYear = Integer.parseInt(actualDateSplit[2]);
    	String expectedDate = scan.nextLine();
    	String[] expectedDateSplit = expectedDate.split(" ");
    	int expectedDay = Integer.parseInt(expectedDateSplit[0]);
    	int expectedMonth = Integer.parseInt(expectedDateSplit[1]);
    	int expectedYear = Integer.parseInt(expectedDateSplit[2]);
    	int fine = 0;
    	if(actualYear > expectedYear){
    		fine = 10000;
    	}
    	else{
    		if(actualYear < expectedYear){
        		fine = 0;
        	}
    		else{
    			if(actualMonth > expectedMonth){
        			fine = 500 * (actualMonth - expectedMonth);
        		}
        		else{
        			if(actualDay > expectedDay){
        				fine = 15 * (actualDay - expectedDay);
        			}
        			else{
        				fine =0;
        			}
        		}
    		}
    	}
		System.out.println(fine);
    }
}

