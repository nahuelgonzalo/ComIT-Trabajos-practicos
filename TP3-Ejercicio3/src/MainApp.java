
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int cantAutoPorcentaje = 0;//cantidad de autos con patente mayor a 1300000
		double porcentajeTotal;
		int cantidadPatentes;
		int patente;
		double valorModelo;
		double impuesto;
		double impuestoRecaudado = 0;//impuesto total recaudado por el registro del automotor
		
		Scanner leer=new Scanner(System.in);
		
		
		System.out.println("Ingrese la cantidad de patentes a registrar:");
		cantidadPatentes = leer.nextInt();
		
		for( int i = 0; i < cantidadPatentes; i++) {
			 patente = (int) Math.floor( Math.random()*(3000000-900000+1)+900000) ;//pantente entre 1950 y 2021 incluidos
			 valorModelo =  Math.floor(Math.random()*(4000-2000+1)+2000) ;// valor entre 2000 y 4000
			 
			 if (patente >= 1300000) {    
				 cantAutoPorcentaje++;
	            }
			 if (patente < 1000000);{
					impuesto =valorModelo * 0.05;//paga el 5% del modelo
				}
			 if (patente >= 1000000 & patente <= 2000000) {
					impuesto =valorModelo * 0.10;//paga el 10%
				}
			 else {
					impuesto =valorModelo * 0.15;//paga el 15%
				}
				
				impuestoRecaudado +=impuesto; //aumento lo que se genero de impuesto
				
	            System.out.println(String.format("La patente %s de numero %s debe pagar %s.", (i +1), patente, impuesto));

		}
		
		porcentajeTotal = (cantAutoPorcentaje *100)/cantidadPatentes; 
		
		System.out.println("El monto total recaudado por el Registro del Automotor es :"+impuestoRecaudado);
		System.out.println("El porcentaje de autos cuya numeración fue superior a 1300000 es:"+porcentajeTotal );
		
		
		
		
		

	}

}
