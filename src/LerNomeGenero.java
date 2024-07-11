import java.util.ArrayList;
import java.util.Scanner;

public class LerNomeGenero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> masculinos = new ArrayList<>();
            ArrayList<String> femininos = new ArrayList<>();

            System.out.println("Digite o nome e gênero (formato: Nome sexo: G). Digite 'sair' para parar:");

            while (true) {
                String entrada = scanner.nextLine();
                if (entrada.equalsIgnoreCase("sair")) {
                    break;
                }

                String[] partes = entrada.split(" sexo: ");
                if (partes.length == 2) {
                    String nome = partes[0].trim();
                    String genero = partes[1].trim();

                    if (genero.equalsIgnoreCase("M")) {
                        masculinos.add(nome);
                    } else if (genero.equalsIgnoreCase("F")) {
                        femininos.add(nome);
                    } else {
                        System.out.println("Gênero inválido. Use 'M' para masculino ou 'F' para feminino.");
                    }
                } else {
                    System.out.println("Formato inválido. Use o formato: Nome sexo: G");
                }
            }

            System.out.println("\nLista de nomes masculinos:");
            for (String nome : masculinos) {
                System.out.println(nome);
            }

            System.out.println("\nLista de nomes femininos:");
            for (String nome : femininos) {
                System.out.println(nome);
            }
        }
    }
}

