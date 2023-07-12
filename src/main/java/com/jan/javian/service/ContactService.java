package com.jan.javian.service;

import com.jan.javian.model.Contact;
import java.util.List;
public interface ContactService {
    List<Contact> findAll();

    Contact findById(long id);
}
