import br.com.jdruk.models.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static EntityManager em;

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("PU");
        em = emf.createEntityManager();

//        createEmployee(1, "Ravi", "Raj", "Textile");
//        createEmployee(2, "Amit", "Raj", "IT");
//        createEmployee(3, "Nitish", "Kumar", "Marketing");
//
//
//        em.getTransaction().begin();
//        em.persist(new Pessoa("JOSAFA"));
//        em.getTransaction().commit();

       // em.getTransaction().begin();
        Pessoa p = em.find(Pessoa.class, 1l);
        //em.getTransaction().commit();

//        System.out.println(em.getTransaction().isActive());
//        System.out.println(p.getNome());
//        em.getTransaction().begin();
//        em.persist(new Musica(null, "musica"));
//        em.getTransaction().commit();
//        em.close();
//        em.i

        //new Musica().create();
        Chaves id = new Chaves(1L, 1L);
        ChaveComposta emp = em.find(ChaveComposta.class, id);

        // ler sobre table gerenetor

    }

    private static void createEmployee(int id, String firstName,
                                       String lastName, String dept) {
        em.getTransaction().begin();
        Employee emp = new Employee(id, firstName, lastName, dept);
        em.persist(emp);
        em.getTransaction().commit();
    }
}

