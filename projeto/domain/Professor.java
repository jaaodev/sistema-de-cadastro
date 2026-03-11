package projeto.domain;

import java.util.Scanner;

public class Professor {
    private String nome;
    private String especialidade;
    private static Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        Professor.seminarios = seminarios;
    }

    public Professor cadastrarProfessor(Scanner input) {
        System.out.println("\n--- Cadastro de Professor ---");
        this.nome = lerTexto(input, "Nome do professor: ");
        this.especialidade = lerTexto(input, "Especialidade: ");
        System.out.println("Professor cadastrado com sucesso!");
        return this;
    }

    private static String lerTexto(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }

    public static void listarProfessores(Professor[] professores) {
        System.out.println("\n--- Professores Cadastrados ---");
        System.out.println();
    }

    public static void associarSeminarioAProfessor(Scanner input) {
        System.out.println("\n--- Associar Seminário a Professor ---");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
