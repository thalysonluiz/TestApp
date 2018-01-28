package teste;

import java.util.Scanner;

public class Quest2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = -1;

		while(n < 0){
			System.out.printf("Informe o valor de n inteiro positivo: ");
			n = entrada.nextInt();
		}
		
		
		int i = 0;
		
		while(n != 1){
			if(n == 0){
				i++;
				System.out.print(n+"->");
				n++;
			}
			else if(n % 2 == 0){
				i++;
				System.out.print(n+"->");
				n = n/2;
			}
			else{
				i++;
				System.out.print(n+"->");
				n--; 
			}
		}
		System.out.println(n);
		System.out.println("Operações: "+i);
	}

}
