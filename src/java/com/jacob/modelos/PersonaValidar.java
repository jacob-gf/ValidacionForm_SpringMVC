/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jacob.modelos;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PersonaValidar implements Validator{

    @Override
    public boolean supports(Class<?> type) {
        
        return Persona.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        
        Persona persona = (Persona)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "required.nombre", "El campo NOMBRE ES OBLIGATORIO");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apellido", "required.apellido", "El campo Apellido ES OBLIGATORIO");
    }    
    

}
