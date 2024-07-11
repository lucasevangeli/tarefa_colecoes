import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNomes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite os nomes separados por vírgula:");
            String linha = scanner.nextLine();

            // Remove espaços extras e divide a linha em nomes usando vírgula como delimitador
            String[] nomes = linha.split("\\s*,\\s*");

            // Ordena os nomes em ordem alfabética
            Arrays.sort(nomes);

            // Imprime os nomes ordenados
            System.out.println("Nomes em ordem alfabética:");
            for (String nome : nomes) {
                System.out.println(nome);
            }
        }
    }
}

