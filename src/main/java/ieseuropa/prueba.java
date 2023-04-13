package main.java.ieseuropa;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = "15/11/2003";
		LocalDate fechaNac = LocalDate.parse(fecha, fmt);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		System.out.println(ahora);
		System.out.println(fechaNac);
		System.out.printf("Tu edad es: %s años, %s meses y %s días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());
		
	}

}
