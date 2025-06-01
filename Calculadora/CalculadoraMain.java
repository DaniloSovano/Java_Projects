import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraBasica calculadora = new CalculadoraBasica(sc);
        CalculadoraCientifica cientifica = new CalculadoraCientifica(sc);

        int op;
        do {
            System.out.println("""
                    --- Menu Principal ---
                    1 - Soma
                    2 - Subtração
                    3 - Multiplicação
                    4 - Divisão
                    5 - Divisão inteira
                    6 - Resto da divisão
                    7 - Fatorial
                    8 - Potência
                    9 - Raiz n-ésima
                    10 - Arranjo
                    11 - Permutação
                    12 - Piso
                    13 - Teto
                    14 - Verificar primo
                    15 - Verificar quadrado perfeito
                    0 - Sair
                    """);

            op = sc.nextInt();

            switch (op) {
                case 1 -> calculadora.soma();
                case 2 -> calculadora.subtracao();
                case 3 -> calculadora.multiplicacao();
                case 4 -> calculadora.divisao();
                case 5 -> calculadora.divisaoInteira();
                case 6 -> calculadora.resto();
                case 7 -> cientifica.fatorial();
                case 8 -> cientifica.potencia();
                case 9 -> cientifica.getRaiz();
                case 10 -> cientifica.arranjo();
                case 11 -> cientifica.permutacao();
                case 12 -> cientifica.piso();
                case 13 -> cientifica.teto();
                case 14 -> cientifica.primo();
                case 15 -> cientifica.quadradoPerfeito();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }
}
