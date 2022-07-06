package pruebas;

import clases.Comercial;

public class PruebasComercial {

	public static void main(String[] args) {

		
		clases.Comercial c1 = new Comercial ("Luis", "Sánchez", 34, 1800, 4);
		
		System.out.println("El comercial creado es \n"+c1);
		
		System.out.printf("El salario de Luis es %.2f\n", c1.calculaSalario());
		
		
		
		
		System.out.println("Luis ha hecho hoy 6 ventas, añadiendolas...");
		c1.contabilizaVentas(6);
		
		System.out.println(c1);
		
		
		
		
		
	
		
		
	}

}
