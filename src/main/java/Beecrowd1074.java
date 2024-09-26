
import java.util.Scanner;

public class Beecrowd1074 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        //declarar variável
        int N;

        //ler variável
        N = scanner.nextInt();

        //declarar array com o valor da variável lida
        int valores[] = new int[N];

        //ler e classificar os valores inseridos
        for (int i = 0; i < N; i++) {
            valores[i] = scanner.nextInt();
            if (valores[i] == 0) {
                System.out.println("NULL");
            } else {
                if (valores[i] % 2 == 0) {
                    System.out.print("EVEN");
                } else {
                    System.out.print("ODD");
                }
                if (valores[i] > 0) {
                    System.out.println(" POSITIVE");
                } else if (valores[i] < 0) {
                    System.out.println(" NEGATIVE");
                }
            }
        }
    }
}
