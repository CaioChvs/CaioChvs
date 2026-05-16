import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];

        System.out.println("=== SISTEMA DE CADASTRO ===");

        for(int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do usuário: ");
            nomes[i] = sc.nextLine();
        }

        System.out.println("\nUsuários cadastrados:");

        for(int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + " - " + nomes[i]);
        }

        sc.close();
    }
}
