package com.mahesh.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.model.Contact;
import com.mahesh.repository.ContactRepository;

@Service
@Transactional
public class ContactService
{
	    @Autowired ContactRepository repo;
	     
	    public void save(Contact contact) { 
	    	
	        repo.save(contact);
	    }
	     
	    public List<Contact> listAll() {
	        return (List<Contact>) repo.findAll();
	    }
	     
	    public Contact get(Integer id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(Integer id) {
	        repo.deleteById(id);
	    }	     
}


