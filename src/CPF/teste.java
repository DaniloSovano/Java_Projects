package CPF;

public class teste {
    public static void main(String[] args) {
        String CPF = "234.533.898-89";
        String teste= "";
        String[] digito =CPF.split("[.-]");
        for (int i = 0; i < digito.length; i++) {
            System.out.println(digito[i]);
        }
        for (int i = 0; i < digito.length; i++) {
            teste += digito[i];
        }
        System.out.println(teste);
    }
}
//String[] arrayPartes = CPF.split("[.-]");
//String noPointsCPF = "";
//        for (int i = 0; i < digito.length; i++) {
//noPointsCPF += digito[i];
//        }