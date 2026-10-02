import java.util.Scanner;

public class Maior3Valores {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int v1, v2, v3;
        int maior;

        System.out.print("Primeiro valor --> ");
        v1 = sc.nextInt();
        System.out.print("Segundo valor --> ");
        v2 = sc.nextInt();
        System.out.print("Terceiro valor --> ");
        v3 = sc.nextInt();

        maior = acharMaior(v1, v2, v3);
        System.out.println("maior = " + maior);

    }

    static int acharMaior(int v1, int v2, int v3) {
        int maior = v1;
        if(v2 > maior) {
            maior = v2;
        }
        if(v3 > maior) {
            maior = v3;
        }
        return maior;
    }
}
