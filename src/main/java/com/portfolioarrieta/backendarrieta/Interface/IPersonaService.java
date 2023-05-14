/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioarrieta.backendarrieta.Interface;

import com.portfolioarrieta.backendarrieta.Entity.Persona;
import java.util.List;

/**
 *
 * @author Anabela
 */
public interface IPersonaService {
    //traer una lista
    public List<Persona> getPersona ();
    
    //guardar un objeto
    public void savePersona (Persona persona);
    
    //eliminar un objeto pero lo buscamos por Id
    public void deletePersona (Long id);
    
    //buscar persona por Id
    public Persona findPersona (Long id);
    
}
