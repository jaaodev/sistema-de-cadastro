package projeto.test;

import projeto.domain.*;

import java.util.Scanner;

import static projeto.domain.Aluno.listarAlunos;
import static projeto.domain.Professor.listarProfessores;
import static projeto.domain.Seminario.listarSeminarios;

public class SeminarioTest01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Seminario[] seminarios = new Seminario[1000];
        Aluno[] alunos = new Aluno[1000];
        Professor[] professores = new Professor[1000];

        int contSem = 0;
        int contAlu = 0;
        int contProf = 0;

        boolean executando = true;

        while (executando) {
            menu.mostrarMenuPrincipal();
            int opcao = menu.lerOpcaoNumerica(input);

            if (opcao == 1) {

                Seminario seminario1 = new Seminario();
                seminario1.cadastrarSeminario(input);
                seminarios[contSem] = seminario1;
                contSem++;
                Local local1 = new Local();
                local1.cadastrarEndereco(input);

            } else if (opcao == 2) {

                Aluno aluno1 = new Aluno();
                aluno1.cadastrarAluno(input);
                alunos[contAlu] = aluno1;
                contAlu++;

            } else if (opcao == 3) {

                Professor professor1 = new Professor();
                professor1.cadastrarProfessor(input);
                professores[contProf] = professor1;
                contProf++;

            } else if (opcao == 4) {

                listarSeminarios(seminarios);
                for (int i=0; i<contSem; i++) {
                    System.out.println(seminarios[i].getTitulo());
                }

            } else if (opcao == 5) {

                listarAlunos(alunos);
                for (int i=0; i<contAlu; i++) {
                    System.out.println(alunos[i].getNome() + ", " + alunos[i].getIdade() + " anos.");
                }

            } else if (opcao == 6) {

                listarProfessores(professores);
                for (int i=0; i<contProf; i++) {
                    System.out.println(professores[i].getNome() + " - " + professores[i].getEspecialidade());
                }

            } else if (opcao == 0) {

                System.out.println("Saindo... Obrigado por usar o sistema!");
                executando = false;

            } else {

                System.out.println("Opção inválida. Tente novamente.");

            }
            System.out.println();
        }

        input.close();
    }
}
