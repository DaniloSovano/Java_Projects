import java.util.Scanner;


public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public static void soma(){
        System.out.println("Digite o primeiro valor: ");
        float numA = sc.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float numB = sc.nextFloat();
        float soma = numA + numB;
        System.out.printf("A soma dos valores é: %.2f",soma);

    }
    public static void sub(){
        System.out.println("Digite o primeiro valor: ");
        float numA = sc.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float numB = sc.nextFloat();
        float sub = numA - numB;
        System.out.printf("A subtraçâo dos valores é: %.2f",sub);
    }
    public static void mult(){
        System.out.println("Digite o primeiro valor: ");
        float numA = sc.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float numB = sc.nextFloat();
        float mult = numA * numB;
        System.out.printf("A multplicação dos valores é: %.2f",mult);
    }
    public static void div(){
        System.out.println("Digite o primeiro valor: ");
        float numA = sc.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float numB = sc.nextFloat();
        float div = numA / numB;
        System.out.printf("A Divisão dos valores é: %.2f",div);
    }
    public static void exp(){
        System.out.println("Digite o valor da base: ");
        float numA = sc.nextFloat();
        System.out.println("Digite o valor da exponencial: ");
        float numB = sc.nextFloat();
        float exp = 1;
        for (int i = 1; i <= numB; i++){
            exp *= numA;
        }
        System.out.printf("O resultado da exponenciação é: %.2f",exp);
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
                    8 - Fatorial
                    9 - Arranjos
                    10 - Permutação
                    11 - Piso
                    12 - Teto
                    13 - Raízes de grau n
                    14 - Validar Numero primo
                    15 - Validar Quadrado perfeito
                    0 - Sair""";

    System.out.println("Bem vindo a calculadora!");
    int op;
    do{
    System.out.println("Que operação você deseja fazer?");
    System.out.println(menu);
    op = sc.nextInt();
    if(op > -1 && op <8){
        if (op == 1){
            soma();
        }else if(op == 2){
            sub();
        }else if(op == 3){
            mult();
        }else if( op == 4){
            div();
        }else if(op == 5){
            exp();
        }
    }else {
        System.out.println("Opção invalida");
    }
    }while(op != 0);
    System.out.println("Obrigado por utilizar a calculadora");

        }
}