package com.sudeep.service;

import javax.transaction.Transactional;

import com.sudeep.dao.PersonDao;
import com.sudeep.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonDao personDao;

    @Override
    @Transactional
    public void savePerson(Person person) {
        personDao.savePerson(person);
    }

}