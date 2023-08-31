import java.util.InputMismatchException;
import java.util.Scanner;

import contador.Contador;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        
    }
    private static void menu() {

        int escolha = -1;

        while (escolha != 0) {
            exibirMenu();

            
            try {
                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        new Contador(scanner);
                        break;
                   
                    case 0:
                        System.out.println("Sair.");
                       scanner.close();
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                menu(); 
            }
            
        }

    }

    public static void exibirMenu() {
        System.out.println("==== Menu ====");
        System.out.println("1 iniciar Contagem");;
        System.out.println("0. Sair ");
        System.out.print("Escolha uma opção: ");
    }

}
