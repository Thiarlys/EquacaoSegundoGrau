import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Sendo ax² ,bx ,c = 0, digite os valores de a, b e c:  ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == 0){
            System.out.println("O valor de A não pode ser igual a zero");
        }else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Não existem raízes reais, pois o delta é negativo. ");
            } else if (delta == 0) {
                System.out.println("existe somente uma raiz real");
            }else {
                double raizDelta = Math.sqrt(delta);
                double x1 = (-b + raizDelta) / (2 * a);
                double x2 = (-b - raizDelta) / (2 * a);

                System.out.println("O valor de X1 é " + x1);
                System.out.println("O valor de X2 é " + x2);
            }
        }
    }
}