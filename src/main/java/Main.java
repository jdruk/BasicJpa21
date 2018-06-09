import br.com.jdruk.models.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static EntityManager em;

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("PU");
        em = emf.createEntityManager();

        createEmployee(1, "Ravi", "Raj", "Textile");
        createEmployee(2, "Amit", "Raj", "IT");
        createEmployee(3, "Nitish", "Kumar", "Marketing");

    }

    private static void createEmployee(int id, String firstName,
                                       String lastName, String dept) {
        em.getTransaction().begin();
        Employee emp = new Employee(id, firstName, lastName, dept);
        em.persist(emp);
        em.getTransaction().commit();
    }
}

