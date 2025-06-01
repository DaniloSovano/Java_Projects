package utils;

import java.util.Scanner;

public class InputUsuario {
    private final Scanner scanner;

    public InputUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public double lerDouble(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public void fecharScanner() {
        scanner.close();
    }
}