package com.telran.service;

import com.telran.repository.PersonDetailsRepository;
import com.telran.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service("production")
public class RegistrationServiceImpl implements RegistrationService {

    private PersonRepository personRepository;
    private PersonDetailsRepository personDetailsRepository;


    //single constructor in BEAN - @Autowired will be set automatically
    public RegistrationServiceImpl(PersonRepository personRepository, PersonDetailsRepository personDetailsRepository) {
        this.personRepository = personRepository;
        this.personDetailsRepository = personDetailsRepository;
    }
}


@Service("development")
class RegistrationServiceDevImpl implements RegistrationService {}
