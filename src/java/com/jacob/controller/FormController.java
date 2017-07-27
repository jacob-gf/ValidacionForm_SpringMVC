/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacob.controller;

import com.jacob.modelos.Persona;
import com.jacob.modelos.PersonaValidar;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("form.html")
public class FormController {
    
    private PersonaValidar personaValidar;

    public FormController() {
        this.personaValidar = new PersonaValidar();
    }
    
    
    
    @RequestMapping( method = RequestMethod.GET)
    public ModelAndView form(){
        
        ModelAndView mav= new ModelAndView();
        mav.setViewName("form");
        mav.addObject("persona", new Persona());
        return mav;
    }
    
    //Recibimos y Validamos Nuestros Datos del formulario
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView form(@ModelAttribute("persona") Persona per, BindingResult result, SessionStatus status){
        
        this.personaValidar.validate(per, result);
        if (result.hasErrors()) {
            
            //VOLVEMOS AL FORMULARIO  porque los datos ingresados no son correctos
            ModelAndView mav= new ModelAndView();
            mav.setViewName("form");
            mav.addObject("persona", new Persona());
        return mav;
        } else {
            
            //Aqui entramos , si el ususario ingreso bien los datos
            ModelAndView mav= new ModelAndView();
            mav.setViewName("exito");
            mav.addObject("nombre", per.getNombre());
            mav.addObject("apellido", per.getApellido());
            mav.addObject("pais", per.getPais());
        return mav;
        }
    }
    
    //Metodo para poblar nuestro select
    @ModelAttribute ("paisLista")
    public Map<String, String> listadoPaises(){
        
        Map<String, String> pais = new LinkedHashMap<>();
        pais.put("1","Peru");
        pais.put("2","Colombia");
        pais.put("3","Paraguay");
        pais.put("4","Brasil");
        pais.put("5","Ecuador");
        
        return pais;
    }
    
    @RequestMapping(value = "form.html", method = RequestMethod.POST)
    public String form(Persona per, ModelMap model){
        
        model.addAttribute("nombre",per.getNombre());
        model.addAttribute("apellido",per.getApellido());
        model.addAttribute("correo",per.getPais());
        return "exito";
    }
}
