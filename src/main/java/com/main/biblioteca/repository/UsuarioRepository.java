/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.main.biblioteca.repository;

import com.main.biblioteca.model.UsuarioDTO;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Aluno
 */
public interface UsuarioRepository extends JpaRepository<UsuarioDTO, Integer>{
    
    Optional<UsuarioDTO> findByEmailAndPassword( String email, String senha);
}
