package pl.marim.quarkus.mp.jpa;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class QuarkUserJpaService {
    
	@Inject
    EntityManager em;
	
    @Transactional 
    public void createQuarkUser(String name) {
    	QuarkUser user = new QuarkUser();
    	user.setName(name);
        em.persist(user);
    }
    
    @Transactional
    public List<QuarkUser> listUsers() {
    	return em.createQuery("from QuarkUser", QuarkUser.class).getResultList();
    }
}
