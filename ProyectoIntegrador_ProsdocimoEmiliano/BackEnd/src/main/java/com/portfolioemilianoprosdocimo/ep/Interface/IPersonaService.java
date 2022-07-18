package com.portfolioemilianoprosdocimo.ep.Interface;

import com.portfolioemilianoprosdocimo.ep.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de Persona
    public List<Persona> getPersona();
    
    //Guardar un objeto del tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar un persona por ID
    public Persona findPersona(Long id);
}
