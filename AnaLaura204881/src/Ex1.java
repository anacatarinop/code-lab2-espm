import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		
		   double vlemp, taxaj, juros;
		   int prazo;
		   
		   do{
			   System.out.println("-----------------------------------------------------------------------------");
			   System.out.println("C�LCULO DE JUROS DO EMPR�STIMO");
			   
			   System.out.print("\nValor principal do empr�stimo(-1 para terminar a sequ�ncia de testes) => R$ ");
			   vlemp = teclado.nextDouble();
			  
			   if(vlemp == -1){
					System.out.println("Opera��o terminada");
					break;
					
			   }else{
			   System.out.print("Taxa de juros(valor entre 0 e 1) => ");
			   taxaj = teclado.nextDouble();
			   
			   System.out.print("Prazo do empr�stimo(dias) => ");
			   prazo = teclado.nextInt();
			   
			   juros = (vlemp * prazo * taxaj) / 365;
			   System.out.println("Valor total de juros  => R$ " + String.format("%.2f", juros));
				    }   
			 }while (vlemp != -1); 
 	   System.out.println("Sequ�ncia encerrada com sucesso "); 
		       
	}
	
}
