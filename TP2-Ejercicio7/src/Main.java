import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int edad;
		int experiencia;
		double remuneracion;
		
		//clase scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese edad del aspirante");
		edad = leer.nextInt();
		
		if (edad >= 18 & edad <= 35) {
			System.out.println("Ingrese experiencia del aspirante");
			experiencia = leer.nextInt();
			
			System.out.println("Ingrese renumeración del aspirante");
			remuneracion = leer.nextDouble();
			
			if (experiencia < 3 & remuneracion >50000 & edad >32 ) {
				System.out.println("El aspirante ah sido rechazado");
			}
				else 
					System.out.println("El aspirante ah sido aceptado");
				
		
			 if (experiencia > 3 & experiencia < 6  & edad > 32){
				System.out.println("El aspirante ah sido aceptado de forma condicional");
			
			 }
		}
		else {
			System.out.println("El aspirante ah sido rechazado");
		}

	}

}

