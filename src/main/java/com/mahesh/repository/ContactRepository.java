package com.mahesh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.model.Contact;
@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer>
{

}
