import java.util.Scanner;

public class exercicio09 {

      public static String abreviarNome(String nomeCompleto) {
        
        String[] partes = nomeCompleto.trim().split("\\s+");

        if (partes.length <= 2) {
            return String.join(" ", partes);
        }

     
        StringBuilder resultado = new StringBuilder(partes[0]);

       
        for (int i = 1; i < partes.length - 1; i++) {
         
            char inicial = Character.toUpperCase(partes[i].charAt(0));
            resultado.append(" ").append(inicial).append(".");
        }

       
        resultado.append(" ").append(partes[partes.length - 1]);

        return resultado.toString();

         }

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nome = teclado.nextLine();

      
        String nomeAbreviado = abreviarNome(nome);

        System.out.println("Nome abreviado: " + nomeAbreviado);
    
}
}
