package br.com.unipampa.dao;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 *
 * @author GabrielBMoro
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() throws MappingException {
        if (sessionFactory == null) {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }

    public static Session getSession() {
        return getSessionFactory().openSession();
    }

}