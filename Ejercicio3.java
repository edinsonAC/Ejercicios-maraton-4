import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String ln = scanner.nextLine();
            if (ln.isEmpty()) {
                break;
            }
            int n = Integer.parseInt(scanner.nextLine());
            if (n == 0) {
                break;
            }

            int[] cartas = new int[n];
            String[] data = scanner.nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                cartas[i] = Integer.parseInt(data[i]);
            }

            int[][] dp = new int[n][n];

            for (int i = 0; i < n; i++) {
                dp[i][i] = cartas[i];
            }

            for (int len = 2; len <= n; len++) {
                for (int i = 0; i <= n - len; i++) {
                    int j = i + len - 1;
                    int a = ((i + 2) <= j) ? dp[i + 2][j] : 0;
                    int b = ((i + 1) <= (j - 1)) ? dp[i + 1][j - 1] : 0;
                    int c = (i <= (j - 2)) ? dp[i][j - 2] : 0;
                    dp[i][j] = Math.max(cartas[i] + Math.min(a, b), cartas[j] + Math.min(b, c));
                }
            }

            System.out.println(dp[0][n - 1]);
        }

    }
}
