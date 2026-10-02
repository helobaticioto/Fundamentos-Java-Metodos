import java.util.Scanner;

public class RaizesEquacao2Grau {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta;
        double[] raiz;

        System.out.println("Digite o valor de A: ");
        a = sc.nextDouble();
        if(a == 0){
            System.out.println("Não é uma equação de segundo grau.");
        }
        else{
            System.out.println("Digite o valor de B:");
            b = sc.nextDouble();
            System.out.println("Digite o valor de C:");
             c = sc.nextDouble();
            delta = cal_reto_delta(a, b, c);
            if(delta >= 0){
                raiz = calcularRaiz(a, b, delta);
                System.out.println("x1 = " + String.format("%.2f", raiz[0]));
                System.out.println("x2 = " + String.format("%.2f", raiz[1]));
            }
            else{
                System.out.println("A equação não tem número real.");
            }
        }
    }
    static double cal_reto_delta (double a, double b, double c){
        return (b*b) -4*a*c;
    }

    static double[] calcularRaiz (double a, double b, double delta){
        double[] raiz  = new double[2];
        raiz[0] = (-b + Math.sqrt(delta))/(2*a);
        raiz[1] = (-b + Math.sqrt(delta))/(2*a);
        return raiz;
    }
}
