import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite '1' para informar que sua entrega chegou");


        if (scanner.nextInt() == 1) {
            String dataChegada = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            String horaDaCheada = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
            System.out.println("Sua mercaoria foi registrada a chegada dia: " + dataChegada);
            System.out.println("A hora que sua mercadoria chegou " + horaDaCheada);
        } else {
            System.out.println("informe sua reclamação");
        }

    }
}
