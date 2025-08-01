import model.Aluno;
import service.AlunoService;
import model.Aluno;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoService service = new AlunoService();
        int opcao;
        String nomeDigitado;

        do {
            System.out.println("------BEM VINDO AO CADRASTO DE ALUNOS-----");
            System.out.println("Digite uma das opções abaixo: ");
            System.out.println("1 - Adicionar aluno.");
            System.out.println("2 - Listar alunos.");
            System.out.println("3 - Buscar aluno.");
            System.out.println("4 - Remover aluno.");
            System.out.println(" 0 - Sair.");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Aluno novoAluno = new Aluno();
                    System.out.println("Digite o nome do aluno: ");
                    novoAluno.setNome(scanner.nextLine());
                    System.out.println("Digite o RA do Aluno");
                    novoAluno.setRA(scanner.nextLine());
                    System.out.println("Digite a Idade do Aluno");
                    novoAluno.setIdade(scanner.nextInt());
                    System.out.println();
                    System.out.println("Aluno cadrastrado com sucesso!");
                    service.adicionarAluno(novoAluno);
                break;

                case 2:
                    service.listarAlunos();
                break;
            }
        } while (opcao != 0);
        scanner.close();



    }
}