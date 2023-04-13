package main.java.ieseuropa;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona per1 = new Persona("Pepe", "Antonio", 80.6f, 180);
		System.out.println(per1.calcularEdad());
		System.out.println(per1.getDNI());
	}

}
