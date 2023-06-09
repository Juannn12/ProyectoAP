package com.portfolioweb.AP.Service;

import com.portfolioweb.AP.Entity.Persona;
import com.portfolioweb.AP.Interface.iPersonaService;
import com.portfolioweb.AP.Repository.iPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplPersonaService implements iPersonaService{
    @Autowired iPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
