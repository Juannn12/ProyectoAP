package com.portfolioweb.AP.Interface;

import com.portfolioweb.AP.Entity.Persona;
import java.util.List;

public interface iPersonaService {
    //lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
