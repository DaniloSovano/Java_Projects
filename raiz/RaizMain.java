import java.util.Scanner;

public class RaizMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(a, b, c);
        equacao.verificarRaizes();

    }
}
