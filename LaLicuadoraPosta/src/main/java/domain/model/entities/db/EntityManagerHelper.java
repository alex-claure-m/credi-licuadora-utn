package domain.model.entities.db;

import javax.persistence.*;

public class EntityManagerHelper {

    private static EntityManagerFactory emf;

    private static ThreadLocal<EntityManager> threadLocal;

    static{
        try {
            emf = Persistence.createEntityManagerFactory("db");
            threadLocal = new ThreadLocal<>();
        } catch(Exception e){
               e.printStackTrace();
            }
        }
    public static EntityManager entityManager(){
        return getEntityManager();
    }
    public static EntityManager getEntityManager(){
        EntityManager manager = threadLocal.get();
        if(manager ==null || !manager.isOpen()){
            manager=emf.createEntityManager();
            threadLocal.set(manager);
        }
        return manager;
    }
    public static void closeEntityManager(){
        EntityManager em = threadLocal.get();
        threadLocal.set(null);
        if(em !=null){
            em.close();
        }
    }
    public static void beginTransaction() {
        EntityManager em = EntityManagerHelper.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(!tx.isActive()){
            tx.begin();
        }
        //getEntityManager().getTransaction().begin();  --> FORMA RESUMIDA
    }
    public static void commit() {
        EntityManager em = EntityManagerHelper.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        if(tx.isActive()){
            tx.commit();
        }
        // getEntityManager().getTransaction().commit(); --> forma resumida
    }

    public static Query createQuery(String query) {
        return getEntityManager().createQuery(query);
    }

    public static void flush() {
        getEntityManager().flush();
    }

    public static void rollback() {
        getEntityManager().getTransaction().rollback();
    }
}

