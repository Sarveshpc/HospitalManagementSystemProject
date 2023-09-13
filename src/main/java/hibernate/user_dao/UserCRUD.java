package hibernate.user_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.catalina.User;

public class UserCRUD {
	
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sarvesh").createEntityManager();
	}

	public void signupUser(User user) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
	}

	public boolean loginUser(String email, String password) {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("SELECT u FROM User u where u.email=?1");
		query.setParameter(1, email);
		try {
			User user = (User) query.getSingleResult();
			if (user.getPassword().equals(password)) {
				return true;
			}
			return false;
		} catch (Exception e) {
			System.out.println("User with the given email not found");
		}
		return false;
	}

	public void displayPasswords(String email) {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("SELECT u FROM User u where u.email=?1");
		query.setParameter(1, email);
		
		User user = (User) query.getSingleResult();
		System.out.println("facebook :" + user.getName());
		System.out.println("instagram :" + user.getName());
		System.out.println("snapchat :" + user.getName());
		System.out.println("whatsapp :" + user.getName());
		System.out.println("twitter :" + user.getName());
	}

	public void updatePasswords(User user, String email) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Query query = entityManager.createQuery("SELECT u FROM User u where u.email=?1");
		query.setParameter(1, email);
		User dbUser = (User) query.getSingleResult();

		entityTransaction.begin();
		user.setId(dbUser.getId());
		user.setName(dbUser.getName());
		user.setEmail(dbUser.getRoles());
		user.setPassword(dbUser.getPassword());
		user.setPhone(dbUser.getPhone());
		entityManager.merge(user);
		entityTransaction.commit();
	}

}


}
