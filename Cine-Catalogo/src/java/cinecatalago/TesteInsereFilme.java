package cinecatalago;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteInsereFilme {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cinePU");
        EntityManager em = emf.createEntityManager();

        Filme filme = new Filme("Interestelar", "Christopher Nolan", 2014);

        em.getTransaction().begin();
        em.persist(filme);
        em.getTransaction().commit();

        System.out.println("Filme salvo com sucesso: " + filme);

        em.close();
        emf.close();
    }
}
