import java.util.Scanner;

public class CalculadoraCientifica {
    private final Scanner sc;

    public CalculadoraCientifica(Scanner sc) {
        this.sc = sc;
    }

    public void pause() {
        System.out.println("\nPressione Enter para continuar...");
        sc.nextLine();
        sc.nextLine();
    }
    private int fatorial(int n) {
        int fat = 1;
        for (int i = 2; i <= n; i++) fat *= i;
        return fat;

    }

    public void fatorial() {
        System.out.println("Digite um número inteiro:");
        int n = sc.nextInt();
        System.out.println("Fatorial: " + fatorial(n));
        pause();
    }

    public void potencia() {
        System.out.println("Digite o valor da base: ");
        float numA = sc.nextFloat();
        System.out.println("Digite o valor da exponencial: ");
        float numB = sc.nextFloat();
        float exp = 1;
        for (int i = 1; i <= numB; i++) {
            exp *= numA;
        }
        System.out.printf("O resultado da exponenciação é: %.2f\n", exp);
        pause();
    }


    public void getRaiz() {
        System.out.println("Digite um número inteiro para extrair a raiz n-ésima:");
        int x = sc.nextInt();

        System.out.println("Digite um inteiro para o grau da raiz (n):");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("O grau da raiz deve ser maior que zero.");
            return;
        }

        if (x < 0) {
            System.out.println("Raiz de número negativo não suportada.");
            return;
        }

        double resultado = raiz(x, n);
        System.out.printf("A raiz %d-ésima de %d é aproximadamente %.5f\n", n, x, resultado);
        pause();
    }

    public double raiz(int x, int n) {
        if (x == 0) return 0;

        double low = 0;
        double high = 1;
        if (x > 1) {
            high = x;
        }

        double mid;
        double precisao = 0.00001;

        while (high - low > precisao) {
            mid = (low + high) / 2;
            double potencia = 1;
            for (int i = 0; i < n; i++) {
                potencia *= mid;
            }

            if (potencia > x) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return (low + high) / 2;
    }

    public void arranjo() {
        System.out.println("Cálculo de Arranjos A(n, p) = n! / (n - p)!");
        System.out.println("Digite o total de elementos (n):");
        int n = sc.nextInt();

        System.out.println("Digite a quantidade de elementos a escolher e ordenar (p):");
        int p = sc.nextInt();

        if (p > n) {
            System.out.println("Erro: a quantidade escolhida (p) não pode ser maior que o total de elementos (n).");
            pause();
            return;
        }

        int resultado = fatorial(n) / fatorial(n - p);
        System.out.printf("O número de arranjos A(%d, %d) é: %d\n", n, p, resultado);
        pause();
    }

    public void permutacao() {
        System.out.println("Digite o valor de n para calcular a permutação (P(n) = n!):");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
            return;
        }

        int result = fatorial(num);
        System.out.printf("A permutação de %d é: %d\n", num, result);
        pause();
    }

    public void piso() {
        System.out.println("Digite um número para aplicar a função piso:");
        double num = sc.nextDouble();

        int piso;
        if (num >= 0) {
            piso = (int) num;
        } else {
            piso = (int) num;
            if (num != piso) {
                piso -= 1;
            }
        }

        System.out.printf("O piso de %.2f é: %d\n", num, piso);
        pause();
    }

    public void teto() {
        System.out.println("Digite um número para aplicar a função teto:");
        double num = sc.nextDouble();

        int teto;
        if (num <= 0) {
            teto = (int) num;
        } else {
            teto = (int) num;
            if (num != teto) {
                teto += 1;
            }
        }

        System.out.printf("O teto de %.2f é: %d\n", num, teto);
        pause();
    }

    public void primo() {
        System.out.println("Digite um número:");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("Não é primo.");
            pause();
            return;
        }
        for (int i = 2; i <= raiz(num,2); i++) {
            if (num % i == 0) {
                System.out.println("Não é primo.");
                pause();
                return;
            }
        }
        System.out.println("É primo.");
        pause();
    }

    public void quadradoPerfeito() {
        System.out.println("Digite um número:");
        int num = sc.nextInt();
        int raiz = (int) Math.sqrt(num);
        if (raiz * raiz == num) System.out.println("É quadrado perfeito.");
        else System.out.println("Não é quadrado perfeito.");
        pause();
    }
}
