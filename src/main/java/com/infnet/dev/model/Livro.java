package com.infnet.dev.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Livro extends Produto {
    @NotBlank(message = "Autor não pode estar vazio")
    private String autor;

    @NotNull
    @Min(1)
    private Integer paginas;

    // Getters, Setters e toString

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
}