//7 - Faça um algoritmo que leia dois valores booleanos (lógicos)
// e determine se ambos são VERDADEIRO ou FALSO.

package fundamentosJava;

import java.util.Scanner;

public class booleanVOrF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean A = sc.nextBoolean();
        boolean B = sc.nextBoolean();

        if (A && B) {
            System.out.println("Ambos são verdadeiros!");
        } else {
            System.out.println("Um ou ambos são falsos!");
        }
    }
}
