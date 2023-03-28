import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	    
	    double x, xm, y, ym, distancia, vltotal;
	    int cont, pts;
	    
	    System.out.println("COORDENADAS (x e y) E O PONTO MAIS DISTANTE DA ORIGEM");
	    
	    System.out.print("Indique a quantidade de pontos => ");
	    pts = teclado.nextInt();
	    
	    cont = 1;
	    vltotal = 0;
	    xm = 0;
	    ym = 0;
	    
	    do{
	        System.out.println("PONTO " + cont + " :" );
	        
	        System.out.print("X => ");
	        x = teclado.nextInt();
	        
	        System.out.print("Y => ");
	        y = teclado.nextInt();
	    
	        distancia = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
	        
	        System.out.println("Distância até a origem => " + String.format("%.4f",distancia));
	        System.out.println("-----------------------------------------------------------------------------");
	        
	        cont = cont + 1;
	        
	        if(distancia > vltotal) {
	        	vltotal = distancia;
	            xm = x;
	            ym = y;
	      
	        }
	            
	    }while(cont <= pts);
	    
	    System.out.println("Coordenadas correspondentes ao ponto mais distante da origem  => x = " + xm + " e y = " + ym);
	
	}
}
