package com.hybridnetwork.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

public abstract class BaseDAO {

    @PersistenceContext(unitName = "ConexaoBD")
    private EntityManager em;

    public EntityManager getEntityManager() {
        return em;
    }

    public  <T> List<T> list(Class<T> clazz) {
        try {
            Entity entidade = clazz.getAnnotation(Entity.class);
            TypedQuery<T> query = em.createQuery("select x from " + entidade.name() + " x", clazz);
            return query.getResultList();
        } catch (Exception e) {
            System.err.print(e.getMessage());
            return Collections.emptyList();
        }
    }

    public <T> T find(Class<T> clazz, Long valor) {
        T object;
        try {
            object = em.find(clazz, valor);
            return object;
        } catch (Exception e) {
            System.err.print(e.getMessage());
            return null;
        }
    }

    public <T> boolean insert(T entity) {
        try {
            this.em.persist(entity);
            return true;
        } catch (Exception e) {
            System.err.print(e.getMessage());
            return false;
        }
    }

    public <T> T update(T entity) {
        try {
            return em.merge(entity);
        } catch (Exception e) {
            System.err.print(e.getMessage());
            return null;
        }
    }

    public <T> boolean deleteById(Class<T> clazz, Integer id) {
        try {
            T object = em.find(clazz, id);
            em.remove(object);
            return true;
        } catch (Exception e) {
            System.err.print(e.getMessage());
            return false;
        }
    }
    
}
