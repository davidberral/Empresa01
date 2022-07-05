package clases;

import java.util.Scanner;

public class Empleado {

	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
	protected int antiguedad;
	
	
	public Empleado() {
		
	}


	public Empleado(String nombre, String apellido, int edad, double salario, int antiguedad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad = antiguedad;
		
	}
	
	public Empleado(Empleado e1) {
		super();
		this.nombre = e1.nombre;
		this.apellido = e1.apellido;
		this.edad = e1.edad;
		this.salario = e1.salario;
		this.antiguedad = e1.antiguedad;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad=" + antiguedad + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getEdad()=" + getEdad() + ", getSalario()=" + getSalario() + ", getAntiguedad()=" + getAntiguedad()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	public double calculaTrienios() {
		int trienios = this.antiguedad/3;
		double importetrienio = 0;
		double sal = this.salario;
				
		for(int i=1; i<=trienios; i++) {
			sal = salario+importetrienio;
			if (i<=5) {
				importetrienio=importetrienio+sal*0.05;
				
			} else {
				importetrienio=importetrienio+sal*0.08;
			}
		}
		
		return importetrienio;
		
	}
	
	public double calculaSalario () {
		return this.salario+calculaTrienios();
	}
		
		
	
		
		
}