import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] data = line.split(" ");
            int n = Integer.parseInt(data[0]);
            int m = Integer.parseInt(data[1]);

            int meDebe = m;
            int prestamo = 0;
            int deudas = 0;

            data = scanner.nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                int valor = Integer.parseInt(data[i]);
                deudas += valor;
            }

            meDebe -= deudas;
            if (deudas < 0) {
                // si debo prestarle
                prestamo = deudas * -1;
            }

            System.out.println(prestamo + " " + meDebe);
        }

    }
}
