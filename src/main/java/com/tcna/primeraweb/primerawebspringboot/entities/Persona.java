package com.tcna.primeraweb.primerawebspringboot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_personas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//que el ID sea autoincrementable, se agregaa un parametro que es la estrategia
    private Long id;
    private String nombre;
    private int edad;
}

