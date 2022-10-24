package esprit.tn.soa.entity;

import java.util.Objects;

public class Student {
	
	private final String cin;
	private final String nombre;
	private final String email;
	
	
	public Student(String cin, String nombre, String email) {
		super();
		this.cin = cin;
		this.nombre = nombre;
		this.email = email;
	}


	public String getCin() {
		return cin;
	}


	public String getNombre() {
		return nombre;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cin, email, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(cin, other.cin) && Objects.equals(email, other.email)
				&& Objects.equals(nombre, other.nombre);
	}
	
	
}