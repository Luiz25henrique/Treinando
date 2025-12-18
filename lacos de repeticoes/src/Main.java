import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite '1' para iniciar o seu dia");

        int inicial = scanner.nextInt();

        if (inicial == 1) {
            LocalTime horaInicial = LocalTime.now();
            LocalDate incioDaJornada = LocalDate.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter formartoDaHora = DateTimeFormatter.ofPattern("HH:mm");
            System.out.println("A hora que você iniciouo seu dia " + formartoDaHora.format(horaInicial));
            System.out.println("A data que você ínicio " + formato.format(incioDaJornada));
        }




    }

}
