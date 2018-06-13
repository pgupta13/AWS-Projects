package resources;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class Data {
	
	@PersistenceContext
	public static final EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
	EntityManager entityManager;
	public static EntityManager getEntityManager()
	{
		EntityManager entityManager = emf.createEntityManager();
		return entityManager;
	}
	public Data() {
		super();
	}

	public static void storeData(Student student) {
		
			
			
		EntityManager entityManager = getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
