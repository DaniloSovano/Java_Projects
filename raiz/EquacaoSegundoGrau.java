public class EquacaoSegundoGrau {
    private final double a;
    private final double b;
    private final double c;

    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void verificarRaizes() {
        if (a == 0) {
            System.out.println("ERRO: 'a' deve ser diferente de 0.");
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Duas raízes reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Uma única raiz real:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Não há raízes reais.");
        }
    }
}
