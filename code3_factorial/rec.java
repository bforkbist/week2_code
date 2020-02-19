package code3_factorial;

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s,n=in.nextInt();
        s=factorial(n);
        System.out.println(s);
        in.close();
    }

    private static int factorial(int n) {
        int sum=1;
        if(n>1)
            sum=sum*factorial(n-1);
        else
            sum = 1;
        return sum;
    }
}