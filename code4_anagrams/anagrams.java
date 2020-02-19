package code4_anagrams;

import java.util.ArrayList;
import java.util.Scanner;

class Anagrams{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next(),s1=in.next();
        boolean n=anagrams(s,s1);
        System.out.println(n);
        in.close();
    }

    private static boolean anagrams(String s, String s1) {
        ArrayList<Character> arr1=new ArrayList<Character>(),arr2 =new ArrayList<Character>();
        char[] a=s.toCharArray();
        char[] b=s1.toCharArray();
        for(char c : a){
            arr1.add(c);
        }
        for(char c : b){
            arr2.add(c);
        }
        if(arr1.size()==arr2.size()){
            for(int i=0 ;i<arr1.size();i++){
                char e= arr1.get(i);
                if(arr2.contains(e)){
                    arr2.remove(arr2.indexOf(e));
                }
            }
            return arr2.isEmpty();
        }else 
            return false;
        
               
    }
}