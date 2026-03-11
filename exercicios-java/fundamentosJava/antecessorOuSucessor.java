//4 - Faça um algoritmo que receba um número inteiro e
// imprima na tela o seu antecessor e o seu sucessor.

package fundamentosJava;

import java.util.Scanner;

public class antecessorOuSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ant = num - 1;
        int suc = num + 1;
        System.out.println(ant + " " + suc);
    }
}
