package pruebas;

import clases.Empleado;

public class PruebasEmpleado extends Empleado {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Empleado e2 = new Empleado();
		System.out.println("El empleado creado con el constructor sin parámetros es "+e2);
		
		e2 = new Empleado("Ana","Lopez", 47, 1000 , 0);
		System.out.println("El empleado Ana es \n"+e2);
		
		System.out.println("El sueldo de Ana es: "+e2.calculaSalario());
		
		System.out.println("Actualizando la antiguedad a 4 años");
		e2.setAntiguedad(4);
		
		System.out.println("El sueldo de Ana es: "+e2.calculaSalario());
		
		System.out.println("Actualizando la antiguedad a 22 años");
		e2.setAntiguedad(22);
		System.out.printf("El sueldo de Ana es: %.2f", e2.calculaSalario());
		
			
		
	}

}
