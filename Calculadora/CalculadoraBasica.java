// CalculadoraBasica.java
import java.util.Scanner;

public class CalculadoraBasica {
    private final Scanner sc;

    public CalculadoraBasica(Scanner sc) {
        this.sc = sc;
    }
    public void pause() {
        System.out.println("\nPressione Enter para continuar...");
        sc.nextLine();
        sc.nextLine();
    }
    private float[] lerDoisNumeros() {
        System.out.println("Digite o primeiro número:");
        float a = sc.nextFloat();
        System.out.println("Digite o segundo número:");
        float b = sc.nextFloat();
        return new float[]{a, b};
    }

    public void soma() {
        float[] nums = lerDoisNumeros();
        System.out.printf("Soma: %.2f\n", nums[0] + nums[1]);
        pause();
    }

    public void subtracao() {
        float[] nums = lerDoisNumeros();
        System.out.printf("Subtração: %.2f\n", nums[0] - nums[1]);
        pause();

    }

    public void multiplicacao() {
        float[] nums = lerDoisNumeros();
        System.out.printf("Multiplicação: %.2f\n", nums[0] * nums[1]);
        pause();

    }

    public void divisao() {
        float[] nums = lerDoisNumeros();
        if (nums[1] == 0) {
            System.out.println("Erro: divisão por zero.");
            return;
        }
        System.out.printf("Divisão: %.2f\n", nums[0] / nums[1]);
        pause();

    }

    public void divisaoInteira() {
        float[] nums = lerDoisNumeros();
        System.out.printf("Divisão inteira: %d\n", (int)(nums[0] / nums[1]));
        pause();

    }

    public void resto() {
        float[] nums = lerDoisNumeros();
        System.out.printf("Resto da divisão: %.2f\n", nums[0] % nums[1]);
        pause();

    }
}