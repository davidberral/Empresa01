package clases;

public class Comercial extends Empleado {
	
	private int ventas;
	public static double importe=45.90;
	
	
	public Comercial() {
		this.ventas=0;
	}
	
	public Comercial(String nombre, String apellido, int edad, double salario, int antiguedad) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.ventas = 0;
		
	}


	public Comercial(String nombre, String apellido, int edad, double salario, int antiguedad, int ventas) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.ventas = ventas;
	}




	public Comercial(Comercial c1) {
		super(c1);
		this.ventas=c1.ventas;
	}


	
	@Override
	public String toString() {
		return "Comercial [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad=" + antiguedad + ", ventas=" + ventas + "]";
	}


	public void  contabilizaVentas(int numVentas) {
				
		if (numVentas>7) {
			numVentas=7;
		}
		this.ventas= this.ventas+numVentas;
		if (this.ventas>25) {
			this.ventas=25;
		}
		
		/** Esta sentencia resolveria el segundo if 
		 * 
		 */
		//this.ventas = Math.min(this.ventas + numVentas, 25);
		
		/** Esta sentencia resolveria el primer y el segundo if
		 *  
		 */
		//this.ventas = Math.min(this.ventas + Math.min(numVentas, 7), 25);
		
		
	}
	
	public void reseteaContadorVentas(int numVentas) {
		numVentas=0;
		
	}


	
	@Override
	public double calculaSalario() {
		// TODO Esbozo de método generado automáticamente
		return super.calculaSalario()+this.ventas*Comercial.importe;
	}
	
		
	
}
