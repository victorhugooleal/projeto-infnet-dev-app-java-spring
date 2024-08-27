package com.infnet.dev.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Eletronico extends Produto {
    @NotBlank(message = "Marca não pode estar vazio")
    private String marca;

    @NotNull
    private Integer garantiaMeses;

    // Getters, Setters e toString

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(Integer garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
}
