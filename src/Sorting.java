import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int[] a_sorted = new int[n];
        a_sorted = a;
        int noOfSwaps = 0;
        for(int i=0; i< n; i++){
        	for(int j=0; j< n-1; j++){
        		if(a_sorted[j] > a_sorted[j+1]){
        			swap(a_sorted, j, j+1);
        			noOfSwaps++;
        		}
        	}
        	if(noOfSwaps == 0){
        		break;
        	}
        }
        System.out.println("Array is sorted in " + noOfSwaps +" swaps.");
        System.out.println("First Element: " + a_sorted[0]);
        System.out.println("Last Element: "+ a_sorted[n-1]);
    }
    
    public static void swap(int[] a, int i, int j){
    	int temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }
}

