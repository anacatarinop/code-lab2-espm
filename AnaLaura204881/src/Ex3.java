import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		double tmin, tmax, celsius;
		
		System.out.println(" CONVERSÃO DE TEMPERATURA - Indique os valores correspondentes abaixo:  ");
		
		System.out.print("Temperatura mínima (em °C) => ");
		tmin = teclado.nextDouble();
		
		System.out.print("Temperatura máxima (em °C) => ");
		tmax = teclado.nextDouble();
				
		
		System.out.println("Celsius  |  Fahrenheit");
		
		while(tmin <= tmax) {
			celsius = 9 * tmin / 5 + 32;
			
			System.out.println(String.format("%.4f", tmin) + "    ==>   " + String.format("%.4f", celsius));
			tmin++;
		
		}
	}
}
