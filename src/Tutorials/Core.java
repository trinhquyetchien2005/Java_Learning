package src.Tutorials;

import java.util.Scanner;

public class Core {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum; 
        System.out.println(sum = a+ b);
    }

    private int SumNUmber(int a, int b){
        int sum = a + b;
        return sum;
    }
}
