package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Formatador {
    private static final DecimalFormat df = new DecimalFormat("0.##");
    private static final NumberFormat moedaBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    private static final NumberFormat moedaUS = NumberFormat.getCurrencyInstance(Locale.US);
    private static final NumberFormat moedaEU = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    private static final NumberFormat moedaUK = NumberFormat.getCurrencyInstance(Locale.UK);

    public static String formatarDecimal(double valor) {
        return df.format(valor);
    }

    public static String formatarMoedaBR(double valor) {
        return moedaBR.format(valor);
    }

    public static String formatarMoedaUS(double valor) {
        return moedaUS.format(valor);
    }

    public static String formatarMoedaEU(double valor) {
        return moedaEU.format(valor);
    }

    public static String formatarMoedaUK(double valor) {
        return moedaUK.format(valor);
    }
    
}
