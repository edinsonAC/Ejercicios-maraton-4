import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            lista.add(num);
        }

        for (int i = 0; i < Q; i++) {
            int K = scanner.nextInt();
            encontrarTriada(lista, K);
        }

        scanner.close();
    }

    public static void encontrarTriada(List<Integer> lista, int K) {
        int size = lista.size();
        Collections.sort(lista);

        for (int i = 0; i < size - 2; i++) {
            int a = lista.get(i);

            int left = i + 1;
            int right = size - 1;

            while (left < right) {
                int b = lista.get(left);
                int c = lista.get(right);
                int sum = a + b + c;

                if (sum == K) {
                    System.out.println(a + " " + b + " " + c);
                    return;
                } else if (sum < K) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println("NO");
    }
}
