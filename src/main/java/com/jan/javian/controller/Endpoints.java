package com.jan.javian.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jan.javian.model.Contact;
import com.jan.javian.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Endpoints {

    @Autowired
    ContactService contactService;

    @GetMapping("/info/contact")
    public JSONPObject getContactInfo(){
        List<Contact> contacts = contactService.findAll();

        return contacts == null ? new JSONPObject("contacts", new Contact()) : new JSONPObject("contact", contacts);
    }

    @GetMapping("/public")
    public String publicMonitoring(){
        return "Hello from Javian";
    }

    @GetMapping("/info/contact/id")
    public JSONPObject getContactInfoById(){
        Contact contact = contactService.findById(1);
        return contact == null ? new JSONPObject("contacts", new Contact()) : new JSONPObject("contact", contact);
    }
}
