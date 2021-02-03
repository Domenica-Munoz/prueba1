package ups.edu.ec.grupo2.repaso.Servicios;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ups.edu.ec.grupo2.repaso.Modelo.Persona;
import ups.edu.ec.grupo2.repaso.ON.RopaON;

@WebService
public class SOAPservices {
	@Inject
	private RopaON co;
	@WebMethod
	
	public void registrarPersona(Persona persona)throws Exception {
	co.registrarPersona(persona);
	}
}
