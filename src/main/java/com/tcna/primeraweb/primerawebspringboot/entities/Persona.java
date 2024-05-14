package com.tcna.primeraweb.primerawebspringboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_personas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private int edad;
}

