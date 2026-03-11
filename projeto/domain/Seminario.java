package projeto.domain;

import java.util.Scanner;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario() {
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario cadastrarSeminario(Scanner input) {
        System.out.println("\n--- Cadastro de Seminário ---");
        this.titulo = lerTexto(input, "Título do seminário: ");
        return this;
    }

    private static String lerTexto(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }

    public static void listarSeminarios(Seminario[] seminarios) {
        System.out.println("\n--- Seminários Cadastrados ---");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
