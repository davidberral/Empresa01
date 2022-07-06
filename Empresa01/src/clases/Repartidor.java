package clases;

public class Repartidor extends Empleado {

	protected String zona;
	protected String matricula;
	protected double kmInicioMes;
	protected double kmFinales;
	protected double dietas;
	
	public Repartidor () {
		super();
		this.zona="";
		this.matricula="";
		
	}
	
	

	public Repartidor(String nombre, String apellido, int edad, double salario, int antiguedad, String zona,
			String matricula, double kmInicioMes, double kmFinales, double dietas) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.zona = zona;
		this.matricula = matricula;
		this.kmInicioMes = kmInicioMes;
		this.kmFinales = kmFinales;
		this.dietas = dietas;
	}
	
	// Otro constructor opcional //
	
	
	


	public Repartidor(Repartidor r2) {
		super(r2);
		this.zona = r2.zona;
		this.matricula = r2.matricula;
		this.kmInicioMes = r2.kmInicioMes;
		this.kmFinales = r2.kmFinales;
		this.dietas = r2.dietas;
		
	}



	public Repartidor(Empleado e1, String zona, String matricula) {
		super(e1);
		this.zona = zona;
		this.matricula = matricula;
	}



	
	@Override
	public String toString() {
		return "Repartidor [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad=" + antiguedad + ", zona=" + zona + ", matricula=" + matricula + ", kmInicioMes="
				+ kmInicioMes + ", kmFinales=" + kmFinales + ", dietas=" + dietas + "]";
	}



	public String getZona() {
		return zona;
	}



	public void setZona(String zona) {
		this.zona = zona;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public double getKmInicioMes() {
		return kmInicioMes;
	}



	public double getKmFinales() {
		return kmFinales;
	}



	public double getDietas() {
		return dietas;
	}
	
	
	public void añadirDieta (double importeDieta) {
		
		if (importeDieta>25) {
			dietas=dietas+25;
		} else {
			dietas=dietas+importeDieta;
			
		}
	}
		
	public void actualizaKms (double numKm) {
		
		if (numKm>kmFinales) {
			kmFinales=numKm;
		}
	}



	@Override
	public double calculaSalario() {
		// TODO Esbozo de método generado automáticamente
		return super.calculaSalario()+this.getDietas()+(kmFinales-kmInicioMes)*0.45;
	}
	
	

		
		
	}
	
	
	
	
	

