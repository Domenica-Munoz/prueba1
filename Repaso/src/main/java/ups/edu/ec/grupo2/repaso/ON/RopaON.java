package ups.edu.ec.grupo2.repaso.ON;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.grupo2.repaso.Dao.PersonaDao;
import ups.edu.ec.grupo2.repaso.Dao.RopaDao;
import ups.edu.ec.grupo2.repaso.Modelo.Persona;
import ups.edu.ec.grupo2.repaso.Modelo.Ropa;


@Stateless
public class RopaON {
	@Inject
	private RopaDao daoRopa;
	@Inject
	private PersonaDao daoPersona;
	public void registrarRopa(Ropa ropa) throws Exception {
		
	  daoRopa.insertJPA(ropa);
	  

}
	public void registrarPersona(Persona persona)throws Exception {
		daoPersona.insertJPA(persona);
	}
	
	
}