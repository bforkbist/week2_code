package code5_repeat;

import java.util.Scanner;

class Repeat{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c=in.next().charAt(0);
        int count;
        boolean value;
        count = repeat(s,c);
        if(count>0){
            value = oddEven(count);
            System.out.println("Count="+count+" and Value="+value);
        }
        else
            System.out.println("letter not present");
        in.close();
    }

    private static boolean oddEven(int count) {
        if(count%2==0)
            return true;
        else
            return false;
    }

    private static int repeat(String s, char c) {
        int n=0;
        char a=c;
        char[] array = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(a==array[i])
                n++;
        }
        return n;
    }
}