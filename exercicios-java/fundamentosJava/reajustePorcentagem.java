//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

package fundamentosJava;

import java.util.Scanner;

public class reajustePorcentagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double res = num + (num/100*5);
        System.out.println(res);
    }
}
