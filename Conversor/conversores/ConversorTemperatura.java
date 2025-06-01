package conversores;

import utils.InputUsuario;
import utils.Formatador;

public class ConversorTemperatura {
    private final InputUsuario input;

    public ConversorTemperatura() {
        this.input = new InputUsuario();
    }

    public void iniciar() {
        System.out.println("\n=== CONVERSÃO DE TEMPERATURA ===");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.println("3. Celsius para Kelvin");
        System.out.println("4. Kelvin para Celsius");
        System.out.println("5. Fahrenheit para Kelvin");
        System.out.println("6. Kelvin para Fahrenheit");
        
        int opcao = input.lerInteiro("Escolha uma opção: ");
        double valor = input.lerDouble("Digite o valor a ser convertido: ");
        double resultado = 0;
        String saida = "";
        
        switch (opcao) {
            case 1:
                resultado = celsiusParaFahrenheit(valor);
                saida = valor + " °C = " + Formatador.formatarDecimal(resultado) + " °F";
                break;
            case 2:
                resultado = fahrenheitParaCelsius(valor);
                saida = valor + " °F = " + Formatador.formatarDecimal(resultado) + " °C";
                break;
            case 3:
                resultado = celsiusParaKelvin(valor);
                saida = valor + " °C = " + Formatador.formatarDecimal(resultado) + " K";
                break;
            case 4:
                resultado = kelvinParaCelsius(valor);
                saida = valor + " K = " + Formatador.formatarDecimal(resultado) + " °C";
                break;
            case 5:
                resultado = fahrenheitParaKelvin(valor);
                saida = valor + " °F = " + Formatador.formatarDecimal(resultado) + " K";
                break;
            case 6:
                resultado = kelvinParaFahrenheit(valor);
                saida = valor + " K = " + Formatador.formatarDecimal(resultado) + " °F";
                break;
            default:
                saida = "Opção inválida!";
        }
        
        System.out.println(saida);
    }

    private double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    private double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    private double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    private double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private double fahrenheitParaKelvin(double fahrenheit) {
        return celsiusParaKelvin(fahrenheitParaCelsius(fahrenheit));
    }

    private double kelvinParaFahrenheit(double kelvin) {
        return celsiusParaFahrenheit(kelvinParaCelsius(kelvin));
    }
}