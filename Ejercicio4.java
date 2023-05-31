import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            int n = Integer.parseInt(scanner.nextLine());

            if (esCasiDeLaSuerte(n)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    public static boolean esCasiDeLaSuerte(int n) {
        if (esNumeroSuerte(n))
            return true;

        for (int i = 4; i <= n; i++) {
            if (esNumeroSuerte(i) && n % i == 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean esNumeroSuerte(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            n /= 10;
        }

        return true;
    }
}
