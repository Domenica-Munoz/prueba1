package ups.edu.ec.grupo2.repaso.Modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Persona implements Serializable {
	
	private static final long serialVersionUID=1L;
	@Id
	private String cedula;
	private String nombre;
 
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
	private List<Ropa> ingreso=new ArrayList<Ropa>();*/

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*public List<Ropa> getIngreso() {
		return ingreso;
	}

	public void setIngreso(List<Ropa> ingreso) {
		this.ingreso = ingreso;
	}*/

	
	
	
}



