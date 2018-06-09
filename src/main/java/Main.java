import br.com.jdruk.models.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("PU");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Pessoa p = new Pessoa("OI",1l);
        entityManager.persist(p);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}

