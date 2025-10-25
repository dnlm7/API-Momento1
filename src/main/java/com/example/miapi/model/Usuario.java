package com.example.miapi.model;

import jakarta.persistence.*; 

@Entity // Marca la clase como una entidad JPA (representa una tabla)
@Table(name = "usuarios") // Nombre de la tabla

public class Usuario { 
      @Id // Marca el campo como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID autoincremental
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(unique = true, nullable = false, length = 150)
    private String email;

    // Constructor vacío obligatorio (JPA lo necesita)
    public Usuario() {}

    // Constructor con parámetros (opcional)
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
