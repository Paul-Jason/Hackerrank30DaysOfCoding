//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class DictionariesMaps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBookMap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBookMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            Integer phNo = phoneBookMap.get(s);
            if(phNo != null){
                System.out.println(s + "=" + phNo);
            }
            else{
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}

