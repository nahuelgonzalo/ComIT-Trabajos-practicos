import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		Alumno [] vector = new Alumno [70];
		ArrayList<Alumno> informacion = new ArrayList<Alumno>();
		
		for (int i = 0; i < 70; i++) {
			Alumno alumno = new Alumno(String. valueOf(i));
			alumno.setNota(Math.random() * 10);
			vector[i] = alumno;
		}
		
		
		
		
		double promedio = obtenerPromedio(vector);//obtengo el promedio
		llenarArrayList(vector, informacion, promedio);//agrego al arraylist las informacion de los alumnos cuya nota es mayor al promedio
		
		System.out.println("La nota promedio es :"+promedio);
		
		imprimirArraylist(informacion);
		

	}

	private static void imprimirArraylist(ArrayList<Alumno> informacion) {
		for (Alumno alum : informacion) {
			  System.out.println(alum.toString() + "Supero el promedio");
			}
	}

	private static void llenarArrayList(Alumno[] vector, ArrayList<Alumno> informacion, double promedio) {
		for (int i = 0; i < vector.length ; i++) {
			if(vector[i].getNota() > promedio) {
				informacion.add(vector[i]);
			}
		}
	}

	private static double obtenerPromedio(Alumno[] vector) {
		double notaAux = 0;
		double promedio = 0;
		for (int i = 0; i < vector.length ; i++) {
			
			notaAux = vector[i].getNota() + notaAux; //suma de las notas de todos los alumnos
	
		}
		promedio = notaAux /70;
		return promedio;
	}
}
