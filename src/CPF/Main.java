package CPF;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 1;
        while (opcao == 1) {
            teste();
            System.out.println("Digitar outro CPF? \n 1.Sim \n 2.Não ");
            opcao = input.nextInt();
        }

    }
    static void teste(){
        VerificarCPF cpf = new VerificarCPF();
        Scanner input = new Scanner(System.in);

        boolean teste;
        String CPF ;


        System.out.print("Digite um CPF para ser verificado: ");
        CPF = input.nextLine();
        teste = cpf.verify(CPF);

        if (teste) {
            System.out.println("O CPF informado é valido!");
        } else {
            System.out.println("O CPF é invalido!");
        }
    }
}