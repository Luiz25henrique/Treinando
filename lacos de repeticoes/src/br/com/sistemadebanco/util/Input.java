package br.com.sistemadebanco.util;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Solicita e lê um valor inteiro do console, tratando entradas inválidas.
     * @param prompt A mensagem a ser exibida ao usuário.
     * @return O valor inteiro digitado pelo usuário.
     */

    public static int lerInteiro(String prompt){
        int value = 0;
        boolean validarEntrada = false;

        while (!validarEntrada) {
            System.out.println(prompt);
            try{
                value = scanner.nextInt();
                validarEntrada=true;
            }catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um Número inteiro.");
                //Limpa o buffer do scanner para evitar o loop infinito.
                scanner.next();
            }
        }
        //Consome a nova linha pendente após nextint()
        scanner.nextLine();
        return value;
    }


    /**
     * Solicita e lê valor de ponto flutuante (double) do console.
     * @param prompt a mensagem a ser exibida ao usuário.
     * @return o valor double digitado pelo usuário.
     */
    public static double lerString(String prompt) {
        double value = 0.0;
        boolean validarEntrada = false;

        while (!validarEntrada) {
            System.out.println(prompt);
            try{
                value = scanner.nextDouble();
                validarEntrada = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número decimal");
                //Limpa o buffer do scanner para evitar o loop infinito.
                scanner.next();
            }
        }
        scanner.nextLine();
        return value;
    }

    /**
     * Solicita e lÊ uma linha de texto completa (String) do console.
     * Este método é o mais seguro para ler String.
     * @param prompt a mensagem a ser exibida ao usuário.
     * @return a linha de texto digitado pelo usuário.
     */

    public static String readLine(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    /**
     * Solicita e lê um booleano (true/false) do console.
     * Aceita "true" ou "false" (case-insensitive).
     * @param prompt a mensagem a ser exibida ou usuário.
     * @return o valor boolean digitado pelo usuário.
     */

    public static boolean redBoolean(String prompt) {
        boolean value = false;
        boolean validaEntrada = false;

        while (!validaEntrada) {
            System.out.println(prompt);
            if (scanner.hasNextBoolean()) {
                value=scanner.nextBoolean();
                validaEntrada = true;
            } else {
                System.out.println("Entrada inválida. Por favor, digite 'true' ou 'false'.");
                scanner.next();
            }
        }
        scanner.nextLine();
        return value;
    }

    /**
     * Fecha o objeto scanner. Deve ser chamado UMA ÚNICA VEZ ao final da aplicação
     * para liberar o recurso do sistema (System.in).
     */

    public static void close() {
        System.out.println("\n Fechando o gerenciador de entrada...");
    }
}
