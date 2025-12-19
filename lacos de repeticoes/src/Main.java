import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate date = LocalDate.now();

        int prazo = 15;
         LocalDate dateEntrega = date.plusDays(prazo);

         String dateConvertida = dateEntrega.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("O prazo da sua entrega é " + dateConvertida);

    }
}
