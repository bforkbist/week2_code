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
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        return sum;
    }
}