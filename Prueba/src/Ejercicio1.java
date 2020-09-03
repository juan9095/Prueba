import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] parametro) {
		Scanner teclado=new Scanner(System.in);
		
		float distancia,valor_pasaje,pago,descuento;
		float valor_kilometro=30.00f;
	    int dias_estancia;
	    
		System.out.println("ingrese la distancia:");
		distancia=teclado.nextInt();
		
		System.out.println("ingrese los dias de estancia:");
		dias_estancia=teclado.nextInt();
		
		valor_pasaje=valor_kilometro*distancia;
		
		if(distancia>1000 && dias_estancia>7){
			descuento=distancia*valor_kilometro*0.3f;
			pago=valor_pasaje-descuento;
			System.out.println("su valor inicial a pagar es de:" + valor_pasaje +" " +"pesos");
			System.out.println("el descuento fue de :" + descuento+" " +"pesos");
			System.out.println("el pago a realizar por su pasaje en avion es de:" + pago+" " +"pesos");
			
		}else {
			pago=valor_pasaje;
			System.out.println("el pago a realizar por su pasaje en avion es de :" + pago +" " +"pesos");
		}
		
    }
	
}
