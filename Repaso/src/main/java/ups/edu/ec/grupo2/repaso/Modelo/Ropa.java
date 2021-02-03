package ups.edu.ec.grupo2.repaso.Modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ropa implements Serializable {

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	
	
	/*@ManyToOne
	@JoinColumn
	private Persona persona;*/


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/*public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}*/
	
	
	
}
