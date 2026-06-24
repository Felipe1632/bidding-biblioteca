/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "livro")
public class LivroDTO {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private int id;
    private String titulo;
    
    @ManyToOne
    @JoinColumn(name = "autor", referencedColumnName = "id", nullable = false)
    private AutorDTO autor;
    
    
}
