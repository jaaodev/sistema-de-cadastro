package javacore.projeto.domain;

import java.util.Scanner;

public class Local {
    private String endereco;

    public Local() {
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public Local cadastrarEndereco(Scanner input) {
        this.endereco = lerTexto(input, "Endereço (Local): ");
        System.out.println("Seminário cadastrado com sucesso!");
        return this;
    }

    private static String lerTexto(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
