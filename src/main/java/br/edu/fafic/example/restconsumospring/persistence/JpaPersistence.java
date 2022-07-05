package br.edu.fafic.example.restconsumospring.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaPersistence {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-jpa");
    private final EntityManager em;

    public JpaPersistence() {
        em = emf.createEntityManager();
    }

    public EntityManager getEm(){
        return em;
    }

    public void save(Object o){
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        em.close();
    }
}
