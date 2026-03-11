package projeto.domain;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }

    public void mostrarMenuPrincipal() {
        System.out.println("==========================================|");
        System.out.println("         SISTEMA DE CADASTROS             |");
        System.out.println("==========================================|");
        System.out.println("1) Cadastrar Seminário                    |");
        System.out.println("2) Cadastrar Aluno                        |");
        System.out.println("3) Cadastrar Professor                    |");
        System.out.println("4) Listar Seminários                      |");
        System.out.println("5) Listar Alunos                          |");
        System.out.println("6) Listar Professores                     |");
        System.out.println("0) Sair                                   |");
        System.out.println("Escolha uma opção:                        |");
    }


    public int lerOpcaoNumerica(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.println("Por favor, digite um número válido.");
            input.nextLine();
            System.out.print("Escolha uma opção: ");
        }
        int valor = input.nextInt();
        input.nextLine();
        return valor;
    }
}
