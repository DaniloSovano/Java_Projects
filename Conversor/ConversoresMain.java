import conversores.ConversorComprimento;
import conversores.ConversorMassa;
import conversores.ConversorMoeda;
import conversores.ConversorTemperatura;
import utils.*;

public class ConversoresMain {
    public static void main(String[] args) {
        boolean continuar = true;
        InputUsuario input = new InputUsuario();
        
        while (continuar) {
            System.out.println("\n=== CONVERSOR DE UNIDADES E MOEDAS ===");
            System.out.println("1. Temperatura");
            System.out.println("2. Comprimento");
            System.out.println("3. Massa");
            System.out.println("4. Moeda");
            System.out.println("5. Sair");
            
            int opcao = input.lerInteiro("Escolha uma opção: ");
            
            switch (opcao) {
                case 1:
                    new ConversorTemperatura().iniciar();
                    break;
                case 2:
                    new ConversorComprimento().iniciar();
                    break;
                case 3:
                    new ConversorMassa().iniciar();
                    break;
                case 4:
                    new ConversorMoeda().iniciar();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
        System.out.println("Programa encerrado. Até mais!");
        input.fecharScanner();
    }
}