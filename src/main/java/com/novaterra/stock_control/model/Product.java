// Product.java
package com.novaterra.stock_control.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    @Size(min = 3, max = 120, message = "A descrição deve conter entre {min} e {max} caracteres.")
    @NotBlank(message = "A descrição do produto é obrigatória")
    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @NotNull(message = "A quantidade mínima é obrigatória")
    @Column(name = "QUANTIDADE_MINIMA", nullable = false)
    private Integer quantidadeMinima;

    @NotNull(message = "A quantidade máxima é obrigatória")
    @Column(name = "QUANTIDADE_MAXIMA", nullable = false)
    private Integer quantidadeMaxima;

    @NotNull(message = "A data de criação é obrigatória")
    @Column(name = "CRIADO_EM", nullable = false)
    private LocalDateTime criadoEm;
}