package Exercicio1;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (pertenceFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

    public static boolean pertenceFibonacci(int num) {
        if (num <= 1) {
            return true;
        }
        int a = 0;
        int b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num;
    }
}
