package Exercicio2;

import java.util.Scanner;

public class ContarLetra {
    public static int contarLetraA(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = sc.nextLine();
        int total = contarLetraA(input);
        System.out.println("A letra 'a' aparece " + total + " vezes.");
        sc.close();
    }
}
