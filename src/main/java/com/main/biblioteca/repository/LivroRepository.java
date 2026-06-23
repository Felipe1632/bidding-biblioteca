/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.main.biblioteca.repository;

import com.main.biblioteca.model.LivroDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Aluno
 */
public interface LivroRepository extends JpaRepository<LivroDTO, Integer>{
    
}
