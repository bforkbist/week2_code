package code2_reverse;

import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s,string = in.next();
        s=reverse(string);
        System.out.println(s);
        in.close();
    }

    private static String reverse(String string) {
        char[] a=string.toCharArray();
        char[] b= new char[a.length];
        int n=string.length()-1;
        for(int i=0;i<string.length();i++){
            b[i]=a[n-i];
        }
        String string2=String.valueOf(b);
        return string2;

    }
}