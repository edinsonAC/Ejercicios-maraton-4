import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            int tiempoTotal = 0;
            int contenidoAcumulado = 0;

            for (int i = 0; i < n; i++) {
                short contenido = scanner.nextShort();
                contenidoAcumulado += contenido;

                if (contenidoAcumulado < 0) {
                    tiempoTotal += Math.abs(contenidoAcumulado);
                } else {
                    tiempoTotal += contenidoAcumulado;
                }
            }

            System.out.println(tiempoTotal);
        } while (n != 0);
    }
}
