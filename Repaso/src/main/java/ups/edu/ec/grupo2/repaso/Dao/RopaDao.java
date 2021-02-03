package ups.edu.ec.grupo2.repaso.Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.edu.ec.grupo2.repaso.Modelo.Persona;
import ups.edu.ec.grupo2.repaso.Modelo.Ropa;

@Stateful
public class RopaDao {
	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	
	public boolean insertJPA(Ropa entity) throws SQLException {
		em.persist(entity);
		return true;
	}
	
	public void updateJPA(Ropa ropa) throws Exception {
        try {
            em.merge(ropa);
        } catch (Exception e) {
            throw new Exception("Erro actualizar Ropa" +e.getMessage());
        }
    }
	
	public List<Ropa> getClientes(int id) {
		String jpql= "Select c from Ropa c where c.id =?1";
		Query q = em.createQuery(jpql, Ropa.class);
		q.setParameter(1, id);
		return (List<Ropa>) q.getResultList();
	}
	
	public Ropa read(int id) throws Exception {
        try {
            return em.find(Ropa.class, id);
        } catch (Exception e) {
            throw new Exception("Erro leer Ropa " +e.getMessage());
        }
    }
	
	 public void deleteId(int id) throws Exception {
	        try {
	            em.remove(read(id));
	        } catch (Exception e) {
	            throw new Exception("Error Eliminar Ropa " +e.getMessage());
	        }
	    }
}
