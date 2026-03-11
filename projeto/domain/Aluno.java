package projeto.domain;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno() {
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    public Aluno cadastrarAluno(Scanner input) {
        System.out.println("\n--- Cadastro de Aluno ---");
        this.nome = lerTexto(input, "Nome do aluno: ");
        this.idade = lerInteiro(input, "Idade do aluno: ");
        System.out.println("Aluno cadastrado com sucesso!");
        return this;
    }

    private static String lerTexto(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }

    private static int lerInteiro(Scanner input, String prompt) {
        System.out.print(prompt);
        while (!input.hasNextInt()) {
            System.out.println("Valor inválido. Digite um número inteiro.");
            input.nextLine();
            System.out.print(prompt);
        }
        return input.nextInt();
    }

    public static void listarAlunos(Aluno[] alunos) {
        System.out.println("\n--- Alunos Cadastrados ---");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
