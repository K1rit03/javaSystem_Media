import java.util.Scanner;

public class alunoMedia {
    public static void main(String[] args) {
        String[] vetNomeAluno;
        float[] vetMediaFinal;
        int contadorAlunos;
        float acumMedia = 0, mediaTurma;

        // Inicializa o Scanner
        Scanner entraDado = new Scanner(System.in);

        // Inicializa os arrays
        vetNomeAluno = new String[10];
        vetMediaFinal = new float[10];

        try {
            // Coleta de dados dos alunos
            for (contadorAlunos = 0; contadorAlunos < 10; contadorAlunos++) {
                System.out.println("Informe o nome do aluno(a) " + (contadorAlunos + 1) + ":");
                vetNomeAluno[contadorAlunos] = entraDado.next();

                System.out.println("Informe a sua média final:");
                vetMediaFinal[contadorAlunos] = entraDado.nextFloat();

                if (vetMediaFinal[contadorAlunos] >= 7.0) {
                    System.out.println("Você está aprovado(a), " + vetNomeAluno[contadorAlunos]);
                } else if (vetMediaFinal[contadorAlunos] >= 5.0) {
                    System.out.println("Você está em exame, " + vetNomeAluno[contadorAlunos]);
                } else {
                    System.out.println("Você está reprovado(a), " + vetNomeAluno[contadorAlunos]);
                }

                acumMedia += vetMediaFinal[contadorAlunos];
                System.out.println();
            }

            mediaTurma = acumMedia / 10; // Dividindo pelo número fixo de alunos
            System.out.println("\nMédia da turma: " + mediaTurma);

            System.out.println("\nAlunos com média acima da média da turma:");
            for (contadorAlunos = 0; contadorAlunos < 10; contadorAlunos++) {
                if (vetMediaFinal[contadorAlunos] > mediaTurma) {
                    System.out.println(vetNomeAluno[contadorAlunos] + " com média " + vetMediaFinal[contadorAlunos]
                            + " - Bom aluno(a).");
                } else if (vetMediaFinal[contadorAlunos] < mediaTurma) {
                    System.out.println(vetNomeAluno[contadorAlunos] + " - Média: " + vetMediaFinal[contadorAlunos]
                            + " - Aluno(a) com baixo desempenho.");
                } else {
                    System.out.println(vetNomeAluno[contadorAlunos] + " - Média: " + vetMediaFinal[contadorAlunos]
                            + " - Média igual à média da turma.");
                }
            }
        } finally {
            // Fecha o Scanner
            entraDado.close();
        }
    }
}
