package ups.edu.ec.grupo2.repaso.Servicios;



import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ups.edu.ec.grupo2.repaso.Modelo.Persona;
import ups.edu.ec.grupo2.repaso.ON.RopaON;

@Path("Persona")
public class ResetService {
	
	@Inject
	private RopaON co;

	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("prueba")
	public void registrarPersona(Persona persona)throws Exception {
		co.registrarPersona(persona);
		}

}
