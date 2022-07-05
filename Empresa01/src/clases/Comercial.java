package clases;

public class Comercial extends Empleado {
	
	protected int ventas;
	protected static double importe=45.90;
	
	
	public Comercial() {
		this.ventas=0;
	}


	public Comercial(Empleado e1) {
		super(e1);
		// TODO Esbozo de constructor generado automáticamente
	}


	public Comercial(String nombre, String apellido, int edad, double salario, int antiguedad) {
		super(nombre, apellido, edad, salario, antiguedad);
		// TODO Esbozo de constructor generado automáticamente
	}


	@Override
	public String toString() {
		return "Comercial [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad=" + antiguedad + ", ventas=" + ventas + "]";
	}


	public void  contabilizaVentas(int numVentas) {
				
		if (numVentas>=7) {
			numVentas=7;
		}
		this.ventas= this.ventas+numVentas;
		if (this.ventas>=25) {
			this.ventas=25;
		}
	
	}
	
	public void reseteaContadorVentas(int numVentas) {
		numVentas=0;
		
	}


	@Override
	public double calculaTrienios() {
		// TODO Esbozo de método generado automáticamente
		return super.calculaSalario()+this.ventas*Comercial.importe;
	}
	
	
	
	
	
}
