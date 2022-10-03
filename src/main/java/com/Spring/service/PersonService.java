package com.Spring.service;

import com.Spring.dao.PersonDao;
import com.Spring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PersonService {
    private final PersonDao personDao;

    //inject the PersonDao to PersonService
    //@Qualifier helps in multiple implementations of PersonDao interface...check FakePersonDataAccessService
    @Autowired
    public PersonService(@Qualifier("FakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id){
        return personDao.selectPersonById(id);
    }
    public int deletePerson(UUID id){
        return personDao.deletePersonById(id);
    }

    public int updatePersonById(UUID id,Person newPerson){
        return personDao.updatePersonById(id,newPerson);
    }
}