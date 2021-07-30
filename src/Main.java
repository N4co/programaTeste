import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total = quantidade;
		
		if (codigo ==1){
			total = quantidade * 4.0;
		System.out.println("X-salada");
		}
		else if (codigo ==2){
		total = quantidade * 4.5;
		System.out.println("X-Bacon");
		}
		else if (codigo ==3){
			total = quantidade * 5.0;
			System.out.println("X-burguer");
		}
		else if (codigo ==4) {
			total = quantidade * 2.0;
			System.out.println("Agua");
		}
		else if (codigo ==5) {
			total = quantidade * 1.5;
			System.out.println("suco");
		}
		
		System.out.printf("Total : R$ %.2f%n", total);
		sc.close();
		
		
			
		}
		
		

	}

