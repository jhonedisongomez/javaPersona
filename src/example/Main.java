package example;

public class Main {
	
	
	public static void main(String[] args) {
		
		Persona objPersona = new Persona("Jhon Edison", "Gomez", 17);
		
		String nombres = objPersona.getNombres();
		String apellidos = objPersona.getApellidos();
		int edad = objPersona.getEdad();
		
		System.out.println("nombres: " + nombres + "\n"
				+ "apellidos: " + apellidos + "\n"
				+ "edad: " + edad);

	}

}
