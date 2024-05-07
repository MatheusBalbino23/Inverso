

import java.util.Scanner;

public class Inverso {
	
    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro de no máximo 4 dígitos: ");
        int numero = entrada.nextInt();
        int numeroInvertido = Integer.parseInt(new StringBuilder(String.valueOf(numero)).reverse().toString());
        System.out.println("Número invertido: " + numeroInvertido);
        
        entrada.close();
    }
}
