package com.jan.javian.service;

import com.jan.javian.model.Contact;
import com.jan.javian.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactRepo contactRepo;
    @Override
    public List<Contact> findAll(){
        return contactRepo.findAll();
    }

    @Override
    public Contact findById(long id){
        return contactRepo.findById(id).orElse(null);
    }
}
