package com.novaterra.stock_control.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "PRODUTOS")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 15)
    @NotBlank(message = "O nome do produto é obrigatório")
    @Column(name = "NOME", nullable = false, unique = true)
    private String nome;

    @Size(min = 3, max = 120, message = "A descrição do produto deve conter entre {min} e {max} caracteres.")
    @NotBlank(message = "A descrição do produto é obrigatório")
    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @NotNull(message = "A Quantidade Mínima do produto é obrigatório")
    @Column(name = "QUANTIDADE MINIMA", nullable = false)
    private Integer quantidadeMinima;

    @NotNull(message = "A Quantidade Máxima do produto é obrigatório")
    @Column(name = "QUANTIDADE MAXIMA", nullable = false)
    private Integer quantidadeMaxima;

    @Column(name = "QNT MAXIMA", nullable = false)
    @NotBlank(message = "A data de criação do produto é obrigatório")
    private LocalDateTime criadoEm;
}

