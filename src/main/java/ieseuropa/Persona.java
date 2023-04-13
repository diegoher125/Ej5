package main.java.ieseuropa;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private float peso;
	private int altura;
	private String DNI;
	private LocalDate fecha;
	
	public Persona(String nombre, String apellidos, float peso, int altura, String fecha) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.peso = peso;
		this.altura = altura;
		this.DNI = calcularDNI();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fecha = LocalDate.parse(fecha, fmt);
	}
	
	public Persona(String nombre, String apellidos, float peso, int altura) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.peso = peso;
		this.altura = altura;
		this.DNI = calcularDNI();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fecha = LocalDate.parse("12/01/2000", fmt);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public LocalDate getFecha(){
		return this.fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	private String calcularDNI() {
		String numDNI = "";
		int cont = 0;
		while(cont < 8) {
			numDNI += (int)(Math.random()*10);
		}
		char[] letraCorrecDni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int num = Integer.parseInt(numDNI)%23;
		numDNI += letraCorrecDni[num];
		return numDNI;
	}
	
	public String calcularEdad() {
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fecha, ahora);
		return "Tu edad es: " + periodo.getYears() + " años, " + periodo.getMonths() + " meses y " + periodo.getDays() + " días";
	}

}
