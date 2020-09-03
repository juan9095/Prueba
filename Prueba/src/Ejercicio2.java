import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] parametro) {
		Scanner teclado = new Scanner(System.in);

		int total_bultos = 0;
		float suma=0;
		float promedio_bultos = 0;
		int valorPagar = 0;
		
		System.out.println("ingrese cantidad de bultos");//Construya una tabla de seguimiento con no menos de 15 bultos para realizar la prueba del algoritmo.//
		
		int n = teclado.nextInt();
		int array[] = new int[n];
		System.out.println("");

		for (int i = 0; i < array.length; i++) {
			System.out.println("");
			System.out.println("ingrese peso del bulto:" + (i + 1));
			array[i] = teclado.nextInt();

			if (array[i] <= 25) {
				valorPagar = array[i] * 0;
				System.out.println("el valor a pagar por el peso del bulto es:" + valorPagar+" " +"pesos");
				System.out.println("");
				suma+=array[i];

			} else {
				if(array[i]<=300) {
					valorPagar=array[i]*1500;
		    		System.out.println("el valor a pagar por el peso del bulto es:" + valorPagar+" " +"pesos");
		    		System.out.println("");
		    		suma+=array[i];
			}else {
				if(array[i]<=500) {
					valorPagar=array[i]*2500;
		    		System.out.println("el valor a pagar por el peso del bulto es: " + valorPagar+" " +"pesos");
		    		System.out.println("");
		    		suma+=array[i];
			}else {
				System.out.println("el peso no esta permitido");
		   }
		  }
		 }
		}

		int mayor,menor;
		mayor = menor = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
			if (array[i] < menor) {
				menor = array[i];
			}
		}
		
		 total_bultos=n;
         System.out.println("total de bultos:" +total_bultos);
         System.out.println("");
         System.out.println("el bulto mas pesado es  :" + mayor+"kg");
         System.out.println("");
 		 System.out.println("el bulto mas liviano es  :" + menor+"kg");
 		 System.out.println("");
 		 promedio_bultos=suma/total_bultos;
         System.out.println(" el promedio del peso de los bultos en total es de :" + promedio_bultos+"kg");
   
	}
}
