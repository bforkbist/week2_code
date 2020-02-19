package code1_fabonacci;

import java.util.Scanner;

class Fabonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 0; i < n; i++) {
          System.out.println(fabonacci(n)+" ");  
        } 
        in.close();
    }

    private static int fabonacci(int n) {
        if(n==0)
            return 0;
        else if( n==1 )
            return 1;
        else 
            return (fabonacci(n-1)+fabonacci(n-2));
        
        
    }
}