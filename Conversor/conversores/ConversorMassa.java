package conversores;

import utils.InputUsuario;
import utils.Formatador;

public class ConversorMassa {
    private final InputUsuario input;

    public ConversorMassa() {
        this.input = new InputUsuario();
    }

    public void iniciar() {
        System.out.println("\n=== CONVERSÃO DE MASSA ===");
        System.out.println("1. Quilogramas para Gramas");
        System.out.println("2. Gramas para Quilogramas");
        System.out.println("3. Quilogramas para Libras");
        System.out.println("4. Libras para Quilogramas");
        
        int opcao = input.lerInteiro("Escolha uma opção: ");
        double valor = input.lerDouble("Digite o valor a ser convertido: ");
        double resultado = 0;
        String saida = "";
        
        switch (opcao) {
            case 1:
                resultado = quilogramasParaGramas(valor);
                saida = valor + " kg = " + Formatador.formatarDecimal(resultado) + " g";
                break;
            case 2:
                resultado = gramasParaQuilogramas(valor);
                saida = valor + " g = " + Formatador.formatarDecimal(resultado) + " kg";
                break;
            case 3:
                resultado = quilogramasParaLibras(valor);
                saida = valor + " kg = " + Formatador.formatarDecimal(resultado) + " lb";
                break;
            case 4:
                resultado = librasParaQuilogramas(valor);
                saida = valor + " lb = " + Formatador.formatarDecimal(resultado) + " kg";
                break;
            default:
                saida = "Opção inválida!";
        }
        
        System.out.println(saida);
    }

    private double quilogramasParaGramas(double kg) {
        return kg * 1000;
    }

    private double gramasParaQuilogramas(double g) {
        return g / 1000;
    }

    private double quilogramasParaLibras(double kg) {
        return kg * 2.20462;
    }

    private double librasParaQuilogramas(double lb) {
        return lb / 2.20462;
    }
    
}
