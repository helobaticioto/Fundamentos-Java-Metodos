import java.util.Scanner;

public class ClassificacaoDeTriangulos {
    static void main() {

        Scanner sc = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.print("Informe o lado 1:  ");
        lado1 = sc.nextInt();
        System.out.print("Informe o lado 2: ");
        lado2 = sc.nextInt();
        System.out.print("Informe o lado 3:");
        lado3 = sc.nextInt();

        if(validar(lado1, lado2, lado3)) {
            classificar(lado1, lado2, lado3);
        }
        else {
            System.out.println("Os valores não formam um triângulo");
        }
    }

    public static boolean validar(double lado1, double lado2, double lado3) {
        return lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2;
    }

    public static void classificar(double a, double b, double c) {
        if(a == b && b == c) {
            System.out.println("Triângulo equilátero");
        }
        else if(a == b || a == c || b == c) {
            System.out.println("Triângulo isósceles");
        }
        else {
            System.out.println("Triângulo escaleno");
        }
    }
}



