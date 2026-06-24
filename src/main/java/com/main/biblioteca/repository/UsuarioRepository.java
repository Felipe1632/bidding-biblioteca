/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.main.biblioteca.repository;

import com.main.biblioteca.model.UsuarioDTO;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Aluno
 */
public interface UsuarioRepository extends JpaRepository<UsuarioDTO, Integer>{
    
    @Query("select u from UsuarioDTO u where u.email = ?1 and u.senha = ?2")
    UsuarioDTO findByEmailAndSenha( String email, String senha);

    @Query("select u from UsuarioDTO where u.email = ?1")
    UsuarioDTO findByEmail (String email);
}
