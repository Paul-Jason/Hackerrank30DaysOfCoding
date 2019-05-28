import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

  	Difference(int[] a){
  		this.elements = a;
  	}
  	
  	public void computeDifference(){
  		for(int i=0; i<elements.length; i++){
  			for(int j=i; j<elements.length; j++){
  				int tempDiff = elements[i] - elements[j];
  				tempDiff = Math.abs(tempDiff);
  				if(tempDiff > maximumDifference){
  					maximumDifference = tempDiff;
  				}
  			}
  		}
  	}
  	
}

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}