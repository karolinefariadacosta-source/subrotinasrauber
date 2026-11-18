import java.util.Scanner;

public class exercicio08 {

   
    public static void encontrarMaiorEMenor(int n1, int n2, int n3, int n4, int n5) {
       
        int[] numeros = {n1, n2, n3, n4, n5};

        
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o 1º número inteiro: ");
        int a = teclado.nextInt();

        System.out.print("Digite o 2º número inteiro: ");
        int b = teclado.nextInt();

        System.out.print("Digite o 3º número inteiro: ");
        int c = teclado.nextInt();

        System.out.print("Digite o 4º número inteiro: ");
        int d = teclado.nextInt();

        System.out.print("Digite o 5º número inteiro: ");
        int e = teclado.nextInt();

        encontrarMaiorEMenor(a, b, c, d, e);

    }
}

