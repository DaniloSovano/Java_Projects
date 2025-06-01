package conversores;
import utils.InputUsuario;
import utils.Formatador;

public class ConversorMoeda {
    private final InputUsuario input;
    // Taxas de câmbio fictícias (substitua por taxas reais ou API)
    private final double USD_TO_BRL = 5.20;
    private final double EUR_TO_BRL = 5.60;
    private final double GBP_TO_BRL = 6.50;

    public ConversorMoeda() {
        this.input = new InputUsuario();
    }

    public void iniciar() {
        System.out.println("\n=== CONVERSÃO DE MOEDA ===");
        System.out.println("1. Real para Dólar");
        System.out.println("2. Dólar para Real");
        System.out.println("3. Real para Euro");
        System.out.println("4. Euro para Real");
        System.out.println("5. Real para Libra");
        System.out.println("6. Libra para Real");
        System.out.println("7. Dólar para Euro");
        System.out.println("8. Euro para Dólar");
        
        int opcao = input.lerInteiro("Escolha uma opção: ");
        double valor = input.lerDouble("Digite o valor a ser convertido: ");
        double resultado = 0;
        String saida = "";
        
        switch (opcao) {
            case 1:
                resultado = realParaDolar(valor);
                saida = Formatador.formatarMoedaBR(valor) + " = " + Formatador.formatarMoedaUS(resultado);
                break;
            case 2:
                resultado = dolarParaReal(valor);
                saida = Formatador.formatarMoedaUS(valor) + " = " + Formatador.formatarMoedaBR(resultado);
                break;
            case 3:
                resultado = realParaEuro(valor);
                saida = Formatador.formatarMoedaBR(valor) + " = " + Formatador.formatarMoedaEU(resultado);
                break;
            case 4:
                resultado = euroParaReal(valor);
                saida = Formatador.formatarMoedaEU(valor) + " = " + Formatador.formatarMoedaBR(resultado);
                break;
            case 5:
                resultado = realParaLibra(valor);
                saida = Formatador.formatarMoedaBR(valor) + " = " + Formatador.formatarMoedaUK(resultado);
                break;
            case 6:
                resultado = libraParaReal(valor);
                saida = Formatador.formatarMoedaUK(valor) + " = " + Formatador.formatarMoedaBR(resultado);
                break;
            case 7:
                resultado = dolarParaEuro(valor);
                saida = Formatador.formatarMoedaUS(valor) + " = " + Formatador.formatarMoedaEU(resultado);
                break;
            case 8:
                resultado = euroParaDolar(valor);
                saida = Formatador.formatarMoedaEU(valor) + " = " + Formatador.formatarMoedaUS(resultado);
                break;
            default:
                saida = "Opção inválida!";
        }
        
        System.out.println(saida);
    }

    private double realParaDolar(double real) {
        return real / USD_TO_BRL;
    }

    private double dolarParaReal(double dolar) {
        return dolar * USD_TO_BRL;
    }

    private double realParaEuro(double real) {
        return real / EUR_TO_BRL;
    }

    private double euroParaReal(double euro) {
        return euro * EUR_TO_BRL;
    }

    private double realParaLibra(double real) {
        return real / GBP_TO_BRL;
    }

    private double libraParaReal(double libra) {
        return libra * GBP_TO_BRL;
    }

    private double dolarParaEuro(double dolar) {
        return dolar * (USD_TO_BRL / EUR_TO_BRL);
    }

    private double euroParaDolar(double euro) {
        return euro * (EUR_TO_BRL / USD_TO_BRL);
    }
}


