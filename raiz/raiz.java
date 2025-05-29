import java.util.Scanner;

public class raiz{
    public static void  main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Digite o valor de a: ");
        a=scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        b=scanner.nextDouble();

        System.out.println("Digite o valor de c: ");
        c=scanner.nextDouble();
        verificar_raizes(a,b,c);
    }
    public static void verificar_raizes(double a,double b, double c){
        if(a==0){
            System.out.println("ERRO, 'a' tem q ser diferente de 0");
        }
        else   {
            double x1,x2,delta = b*b-4*a*c;
            if(delta>0){
                x1= (-b+ Math.sqrt(delta))/(2*a);
                x2= (-b- Math.sqrt(delta))/(2*a);
                System.out.println("tem duas raizes reais: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

        }else if(delta==0){
            double x= -b/(2*a);
            System.out.println("so tem uma raiz real: ");
            System.out.println("x = " + x);


        }else{
            System.out.println("nao tem raizes reais");
        }
        }

        }

    }
