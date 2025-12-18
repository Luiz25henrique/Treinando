import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quando a sua encomenda chegar");

        String dataChegada = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));


        System.out.println(dataChegada);
    }
}
