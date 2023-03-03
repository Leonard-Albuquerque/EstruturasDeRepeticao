package Nome;


             import java.util.Scanner;
public class Nome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while(true) {
            System.out.println("Qual a sua nota ?");
            nota = scan.nextInt();
            if((nota == 1) || (nota == 2) || (nota == 3) || (nota == 4) || (nota == 5) || (nota == 6) || (nota == 7) || (nota == 8) || (nota == 9) || (nota == 10)) {
                break;
            }

        }

    }
}
