package code1_fabonacci;

import java.util.Scanner;

class Fabonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] array=new int[n];
        array=fabonacci(n);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }
        in.close();
    }

    private static int[] fabonacci(int n) {
        int[] array = new int[n];
        array[0]=1;
        array[1]=1;
        for (int i = 2; i < n; i++) {
            array[i]=array[i-1]+array[i-2];
        }

        return array;
        
    }
}