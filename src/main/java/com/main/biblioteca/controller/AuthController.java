/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.biblioteca.controller;

import com.main.biblioteca.model.UsuarioDTO;
import com.main.biblioteca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Aluno
 */
@Controller
public class AuthController {
    
    @Autowired
    UsuarioRepository repository;
    
    @GetMapping("/")
    public String home(Model model) {

        UsuarioDTO user = new UsuarioDTO();
        model.addAttribute("user", user);
        
        return "index";
        
        }
    @PostMapping("/login")
    public String login(Model model, @RequestBody UsuarioDTO requestBody){
        
        UsuarioDTO user = repository.findByEmail(requestBody.getEmail());
        
        model.addAttribute("user", user);
        
        return "login";
    }
}