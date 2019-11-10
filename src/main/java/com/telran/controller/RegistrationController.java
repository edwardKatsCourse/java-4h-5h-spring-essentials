package com.telran.controller;

import com.telran.service.RegistrationService;
import com.telran.service.RegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController { //new Person()

    //ApplicationContext.getBean(RegistrationService.class)

    @Autowired
    @Qualifier("development")
    private RegistrationService registrationService; //2 beans

    private StringBuilder stringBuilder;

}
