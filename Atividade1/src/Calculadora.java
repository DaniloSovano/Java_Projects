import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    static float numA, numB;

    public static void getNumbers() {
        System.out.println("Digite o primeiro valor: ");
        numA = sc.nextFloat();
        System.out.println("Digite o segundo valor: ");
        numB = sc.nextFloat();
    }
    public static void pause() {
        System.out.println("\nPressione Enter para continuar...");
        sc.nextLine(); // limpa buffer do nextInt/Float anterior
        sc.nextLine(); // aguarda Enter do usuário
    }

    public static void soma() {
        getNumbers();
        float soma = numA + numB;
        System.out.printf("A soma dos valores é: %.2f\n", soma);
        pause();
    }

    public static void sub() {
        getNumbers();
        float sub = numA - numB;
        System.out.printf("A subtração dos valores é: %.2f\n", sub);
        pause();
    }

    public static void mult() {
        getNumbers();
        float mult = numA * numB;
        System.out.printf("A multiplicação dos valores é: %.2f\n", mult);
        pause();
    }

    public static void div() {
        getNumbers();
        float div = numA / numB;
        System.out.printf("A divisão dos valores é: %.2f\n", div);
        pause();
    }

    public static void exp() {
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

    public static void divInt() {
        System.out.println("Digite os valores para realizar a divisão inteira");
        getNumbers();
        int divi = (int) (numA / numB);
        System.out.printf("A divisão inteira dos valores é: %d\n", divi);
        pause();
    }

    public static void rest() {
        getNumbers();
        float rest = numA % numB;
        System.out.printf("O resto da divisão é: %.2f\n", rest);
        pause();
    }

    public static void fat() {
        System.out.println("Digite um número para realizar o fatorial:");
        int num = sc.nextInt();
        int result = fat(num);
        System.out.printf("O resultado do fatorial de %d é: %d\n", num, result);
        pause();
    }
    public static int fat(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public static void arranjo() {
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

        int resultado = fat(n) / fat(n - p);
        System.out.printf("O número de arranjos A(%d, %d) é: %d\n", n, p, resultado);
        pause();
    }

    public static void permutation() {
        System.out.println("Digite o valor de n para calcular a permutação (P(n) = n!):");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
            return;
        }

        int result = fat(num);
        System.out.printf("A permutação de %d é: %d\n", num, result);
        pause();
    }
    public static void floor() {
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
    public static void ceil() {
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
    public static void getRaiz() {
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

    public static double raiz(int x, int n) {
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

    public static void validarPrimo() {
        System.out.println("Digite um número para verificar se é primo:");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " não é um número primo.");
            pause();
            return;
        }

        double limite = raiz(num, 2);

        for (int i = 2; i <= (int) limite; i++) {
            if (num % i == 0) {
                System.out.println(num + " não é um número primo.");
                pause();
                return;
            }
        }

        System.out.println(num + " é um número primo.");
        pause();
    }

    public static void quadradoPerfeito() {
        System.out.println("Digite um número para verificar se é quadrado perfeito:");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Números negativos não são quadrados perfeitos.");
            pause();
            return;
        }

        int raiz = 0;
        while (raiz * raiz < num) {
            raiz++;
        }

        if (raiz * raiz == num) {
            System.out.printf("O número %d é um quadrado perfeito.\n", num);
        } else {
            System.out.printf("O número %d não é um quadrado perfeito.\n", num);
        }
        pause();
    }




    public static void main(String[] args) {

        String menu = """
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                5 - Exponenciação
                6 - Divisão inteira
                7 - Resto da divisão
                8 - Menu Científico
                0 - Sair
                """;

        String menu2 = """
                9  - Fatorial
                10 - Arranjos
                11 - Permutação
                12 - Piso
                13 - Teto
                14 - Raízes de grau n
                15 - Validar número primo
                16 - Validar quadrado perfeito
                0  - Voltar ao menu principal
                """;

        System.out.println("Bem-vindo à Calculadora!");
        int op;

        do {
            System.out.println("\nQue operação você deseja fazer?");
            System.out.println(menu);
            op = sc.nextInt();

            switch (op) {
                case 1 -> soma();
                case 2 -> sub();
                case 3 -> mult();
                case 4 -> div();
                case 5 -> exp();
                case 6 -> divInt();
                case 7 -> rest();
                case 8 -> {
                    int op2;
                    do {
                        System.out.println("\nMenu Científico:");
                        System.out.println(menu2);
                        op2 = sc.nextInt();
                        switch (op2) {
                            case 9 -> fat();
                             case 10 -> arranjo();
                             case 11 -> permutation();
                             case 12 -> floor();
                             case 13 -> ceil();
                             case 14 -> getRaiz();
                             case 15 -> validarPrimo();
                             case 16 -> quadradoPerfeito();
                            case 0 -> System.out.println("Voltando ao menu principal...");
                            default -> System.out.println("Opção inválida no menu científico.");
                        }
                    } while (op2 != 0);
                }
                case 0 -> System.out.println("Obrigado por utilizar a calculadora!");
                default -> System.out.println("Opção inválida.");
            }

        } while (op != 0);
    }
}
