package com.mahesh.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.angularjs.model.Contact;

@Service
@Transactional
public class ContactSevice
{
	    @Autowired ContactRepository repo;
	     
	    public void save(Contact contact) {
	        repo.save(contact);
	    }
	     
	    public List<Contact> listAll() {
	        return (List<Contact>) repo.findAll();
	    }
	     
	    public Contact get(Long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(Long id) {
	        repo.deleteById(id);
	    }	     
}


