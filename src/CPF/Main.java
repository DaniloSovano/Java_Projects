package CPF;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VerificarCPF cpf = new VerificarCPF();
        Scanner input = new Scanner(System.in);

        int opcao = 1;
        boolean teste;
        String CPF ;
        while (opcao == 1) {
            System.out.print("Digite um CPF para ser verificado: ");
            CPF = input.nextLine();
            teste = cpf.verify(CPF);

            if (teste) {
                System.out.println("O CPF informado é valido!");
            } else {
                System.out.println("O CPF é invalido!");
            }

            System.out.print("Digitar outro CPF? \n 1.Sim \n 2.Não ");
            opcao = input.nextInt();
            CPF="000.000.000.00";
        }

    }
}