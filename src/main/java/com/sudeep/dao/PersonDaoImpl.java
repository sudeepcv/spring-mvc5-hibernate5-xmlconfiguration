package com.sudeep.dao;

import com.sudeep.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void savePerson(Person person) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(person);

    }

}