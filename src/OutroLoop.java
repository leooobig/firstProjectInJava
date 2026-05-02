import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidadeDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação do filme de 0 a 10 ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                quantidadeDeNotas++;
            }
        }
        if (quantidadeDeNotas > 0) {
            System.out.println("Média da avaliação: " + mediaAvaliacao / quantidadeDeNotas);
        }else {
            System.out.println("Não há notas para fazer a média.");
        }

    }
}