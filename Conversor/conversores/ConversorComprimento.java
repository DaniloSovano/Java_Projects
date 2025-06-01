package conversores;

import utils.InputUsuario;
import utils.Formatador;

public class ConversorComprimento {
    private final InputUsuario input;

    public ConversorComprimento() {
        this.input = new InputUsuario();
    }

    public void iniciar() {
        System.out.println("\n=== CONVERSÃO DE COMPRIMENTO ===");
        System.out.println("1. Metros para Centímetros");
        System.out.println("2. Centímetros para Metros");
        System.out.println("3. Metros para Milímetros");
        System.out.println("4. Milímetros para Metros");
        System.out.println("5. Metros para Polegadas");
        System.out.println("6. Polegadas para Metros");
        System.out.println("7. Metros para Pés");
        System.out.println("8. Pés para Metros");
        
        int opcao = input.lerInteiro("Escolha uma opção: ");
        double valor = input.lerDouble("Digite o valor a ser convertido: ");
        double resultado = 0;
        String saida = "";
        
        switch (opcao) {
            case 1:
                resultado = metrosParaCentimetros(valor);
                saida = valor + " m = " + Formatador.formatarDecimal(resultado) + " cm";
                break;
            case 2:
                resultado = centimetrosParaMetros(valor);
                saida = valor + " cm = " + Formatador.formatarDecimal(resultado) + " m";
                break;
            case 3:
                resultado = metrosParaMilimetros(valor);
                saida = valor + " m = " + Formatador.formatarDecimal(resultado) + " mm";
                break;
            case 4:
                resultado = milimetrosParaMetros(valor);
                saida = valor + " mm = " + Formatador.formatarDecimal(resultado) + " m";
                break;
            case 5:
                resultado = metrosParaPolegadas(valor);
                saida = valor + " m = " + Formatador.formatarDecimal(resultado) + " in";
                break;
            case 6:
                resultado = polegadasParaMetros(valor);
                saida = valor + " in = " + Formatador.formatarDecimal(resultado) + " m";
                break;
            case 7:
                resultado = metrosParaPes(valor);
                saida = valor + " m = " + Formatador.formatarDecimal(resultado) + " ft";
                break;
            case 8:
                resultado = pesParaMetros(valor);
                saida = valor + " ft = " + Formatador.formatarDecimal(resultado) + " m";
                break;
            default:
                saida = "Opção inválida!";
        }
        
        System.out.println(saida);
    }

    private double metrosParaCentimetros(double metros) {
        return metros * 100;
    }

    private double centimetrosParaMetros(double centimetros) {
        return centimetros / 100;
    }

    private double metrosParaMilimetros(double metros) {
        return metros * 1000;
    }

    private double milimetrosParaMetros(double milimetros) {
        return milimetros / 1000;
    }

    private double metrosParaPolegadas(double metros) {
        return metros * 39.3701;
    }

    private double polegadasParaMetros(double polegadas) {
        return polegadas / 39.3701;
    }

    private double metrosParaPes(double metros) {
        return metros * 3.28084;
    }

    private double pesParaMetros(double pes) {
        return pes / 3.28084;
    }
    
}
