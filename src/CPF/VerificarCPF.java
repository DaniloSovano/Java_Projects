package CPF;

public class VerificarCPF {
    int calcularDigito(int soma){
        int divisao = soma % 11;
        if(divisao <2 ){
            return 0;
        }
        return 11-divisao;
    }
    boolean verificarRepetição(int[] vetor){
        for (int i = 0; i < vetor.length-1; i++) {
            if(vetor[i] != vetor[i+1]){
                return false;
            }
        }
        return true;
    }
    int[] separarDigitos(String CPF){
        int[] digitos = new int[11];
        int indice = 0;
        String[] arrayPartes = CPF.split("[.-]");
        String noPointsCPF = "";
        for (int i = 0; i < arrayPartes.length; i++) {
            noPointsCPF += arrayPartes[i];
        }
        for (String i : noPointsCPF.split("")) {
            int j = Integer.parseInt(i);
            digitos[indice] = j;
            indice++;
        }
        return digitos;
    }
    boolean verify(String CPF) {
        int[] digitos = separarDigitos(CPF);
        if (verificarRepetição(digitos)){
            return false;
        };
        int soma = 0;
        int multiplo = 10;
        for (int i = 0; i <=8;i++){
            soma += digitos[i]*multiplo;
            //System.out.println(digitos[i]*multiplo);
            multiplo--;
        }
        int decimoDigito = calcularDigito(soma);
        if  (decimoDigito != digitos[9]) {
//            System.out.println("deu falso");
            return false;

        }
        soma = 0;
        multiplo = 11;
        for (int i = 0; i <=9;i++){
            soma += digitos[i]*multiplo;
            multiplo--;
        }
        int decimoPrimeiroDigito = calcularDigito(soma);
        if  (decimoPrimeiroDigito != digitos[10]) {
            return false;
        };
        return true;
    }

}
