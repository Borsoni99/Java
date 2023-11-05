package Main;
// Thiago Borsoni e daniel Lloyd

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import Dao.AlunoCRUD;
import Entidades.Aluno;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoCRUD alunoCRUD = new AlunoCRUD();
        String nome;
        String curso;
        Integer matricula;

        carregarDados(alunoCRUD);

        boolean sair = false;
        while (!sair) {
            System.out.println("1. Incluir aluno");
            System.out.println("2. Remover aluno");
            System.out.println("3. Editar aluno");
            System.out.println("4. Listar alunos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Adicionar aluno
                    System.out.println("Digite o nome: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite o curso: ");
                    curso = scanner.nextLine();
                    System.out.println("Digite a matrícula: ");
                    matricula = scanner.nextInt();

                    Aluno aluno = new Aluno(nome, curso, matricula);

                    alunoCRUD.adicionar(aluno);
                    break;
                case 2:
                    // Remover aluno
                    System.out.println("Digite a matrícula do aluno que deseja remover: ");
                    matricula = scanner.nextInt();
                    scanner.nextLine();

                    alunoCRUD.remover(matricula);
                    break;
                case 3:
                    // Editar aluno
                    System.out.println("Digite a matrícula do aluno que deseja editar: ");
                    matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o novo curso: ");
                    curso = scanner.nextLine();

                    alunoCRUD.atualizar(matricula, curso);

                    break;
                case 4:
                    // Listar alunos
                    System.out.println(alunoCRUD.listarTodos());
                    break;
                case 5:
                    // Sair
                    sair = true;
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        salvarDados(alunoCRUD);
    }

    public static void carregarDados(AlunoCRUD alunoCRUD) {
        try {
            FileReader fileReader = new FileReader("C:/Users/thiag/Downloads/Java-main/Java-main/AC6/src/alunos.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                StringBuilder sbNome = new StringBuilder();
                StringBuilder sbCurso = new StringBuilder();
                StringBuilder sbMatricula = new StringBuilder();

                boolean separadorEncontrado = false;
                for (char c : linha.toCharArray()) {
                    if (c == ',') {
                        separadorEncontrado = true;
                    } else if (!separadorEncontrado) {
                        sbNome.append(c);
                    } else if (Character.isDigit(c)) {
                        sbMatricula.append(c);
                    } else {
                        sbCurso.append(c);
                    }
                }

                String nome = sbNome.toString().trim();
                String curso = sbCurso.toString().trim();
                int matricula = Integer.parseInt(sbMatricula.toString().trim());

                Aluno aluno = new Aluno(nome, curso, matricula);
                alunoCRUD.adicionar(aluno);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Não foi possível carregar dados do arquivo.");
        }
    }

    public static void salvarDados(AlunoCRUD alunoCRUD) {
    List<Aluno> alunos = alunoCRUD.listarTodos();

    try {
        FileWriter fileWriter = new FileWriter("C:/Users/thiag/Downloads/Java-main/Java-main/AC6/src/alunos.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Aluno aluno : alunos) {
            String linha = aluno.getNome() + "," + aluno.getCurso() + "," + aluno.getMatricula();
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    } catch (IOException e) {
        System.out.println("Não foi possível salvar os dados no arquivo.");
    }
}

}

