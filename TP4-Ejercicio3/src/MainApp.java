import java.util.Iterator;
import java.util.Scanner;


public class MainApp {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
        int opcion = 10;
        
        while (opcion !=0)
        {
            ImprimirMenu();
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(String.format("El �rea del Circulo es %s :", calcularAreaCirculo(leer))); 
                    
                    break;
                
                case 2:
                    System.out.println(String.format("El �rea del Cuadrado es %s :", calcularAreaCuadrado(leer)));
                    
                    break;
                case 3:
                    System.out.println(String.format("El �rea del Rectangulo es %s :", calcularAreaRectangulo(leer)));
                    
                    break;
                
                case 4:
                    System.out.println(String.format("El �rea del Triangulo es %s :", calcularAreaTriangulo(leer)));
                    
                    break;
            
                case 5:
                    System.out.println(String.format("El �rea del Trapecio es %s :", calcularAreaTrapecio(leer)));

                    break;
                
                default:
                    break;
            }
        }
	}
	
	public static double calcularAreaCirculo(Scanner leer) {
		  double radio;
		  
		  System.out.println("Ingrese radio del circulo");
		  radio = leer.nextDouble();
		  
          return Math.PI * (radio * radio);
    }
	
	public static double calcularAreaCuadrado(Scanner leer) {
		double lado;
		
		System.out.println("Ingrese lado del cuadrado");
		lado = leer.nextDouble();
		
		return lado * lado;
	}
	
	public static double calcularAreaRectangulo(Scanner leer) {
		double base ,  altura;
		
		System.out.println("Ingrese base del rectangulo");
		base = leer.nextDouble();
		
		System.out.println("Ingrese altura del rectangulo");
		altura = leer.nextDouble();
		
		return base * altura;
	}
	
	public static double calcularAreaTriangulo(Scanner leer) {
		double base ,  altura;
		
		System.out.println("Ingrese base del triangulo");
		base = leer.nextDouble();
		
		System.out.println("Ingrese altura del triangulo");
		altura = leer.nextDouble();
		
		return (base * altura)/2;
	}
	
	public static double calcularAreaTrapecio(Scanner leer) {
		double base ,base2 ,altura;
		
		System.out.println("Ingrese base del rectangulo");
		base = leer.nextDouble();
		
		System.out.println("Ingrese base dos del rectangulo");
		base2 = leer.nextDouble();
		
		System.out.println("Ingrese altura del rectangulo");
		altura = leer.nextDouble();
		return altura*((base + base2)/2);
	}
	
	private  static void ImprimirMenu() {
		System.out.println("****************Menu****************");
        System.out.println("Ingrese  opci�n 1 para calcular el �rea de un C�rculo.");
        System.out.println("Ingrese  opci�n 2 para calcular el �rea de un Cuadrado.");
        System.out.println("Ingrese  opci�n 3 para calcular el �rea de un Rect�ngulo.");
        System.out.println("Ingrese  opci�n 4 para calcular el �rea de un Tri�ngulo.");
        System.out.println("Ingrese  opci�n 5 para calcular el �rea de un Trapecio.");
        System.out.println("Ingrese  opci�n 0 para salir.");
        System.out.println("************************************");
    }
	
	
}
